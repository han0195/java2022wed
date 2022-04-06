package controller.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.productdao;
import dto.product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;



public class productupdate implements Initializable{
	 
	 	@FXML
	    private Button btnadd;

	    @FXML
	    private TextField txtpname;

	    @FXML
	    private Button btnback;

	    @FXML
	    private TextField txtpprice;

	    @FXML
	    private ImageView imgview;

	    @FXML
	    private TextArea txtpcontent;

	    @FXML
	    private Label imgpath;

	    @FXML
	    private Button btnimgadd;

	    @FXML
	    private RadioButton opt1;

	    @FXML
	    private ToggleGroup category;

	    @FXML
	    private RadioButton opt4;

	    @FXML
	    private RadioButton opt3;

	    @FXML
	    private RadioButton opt2;
	    
	    private String pimage = null;
		@Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
			product product = productC.selet;
			txtpname.setText( product.getPname() );
			txtpcontent.setText( product.getPcontent() );
			txtpprice.setText( product.getPprice()+"" );
			imgpath.setText( product.getPimg() );
			if( product.getPcategory().equals("�����Ƿ�") ) { opt1.setSelected(true);}
			if( product.getPcategory().equals("�����Ƿ�") ) { opt2.setSelected(true);}
			if( product.getPcategory().equals("���ӱ��") ) { opt3.setSelected(true);}
			if( product.getPcategory().equals("��Ȱ��ǰ") ) { opt4.setSelected(true);}
	    	
	    }

	    @FXML
	    void add(ActionEvent event) {
	    	 // ���� ������ ������ ���� ���� ��� ���
	    	if( pimage == null ) pimage = productC.selet.getPimg();
	    	
	    	String pcategory = null; 
	    	if( opt1.isSelected() ) pcategory="�����Ƿ�";
	    	if( opt2.isSelected() ) pcategory="�����Ƿ�";
	    	if( opt3.isSelected() ) pcategory="���ӱ��";
	    	if( opt4.isSelected() ) pcategory="��Ȱ��ǰ";
	    	
	    	product upproduct = new product(
	    			productC.selet.getPnum() ,
	    			txtpname.getText() ,
	    			pimage ,
	    			txtpcontent.getText() , 
	    			pcategory , 
	    			Integer.parseInt( txtpprice.getText() ) , 
	    			0,
	    			null,
	    			0);
	    	
	    	boolean result = productdao.productdao.productupdate(upproduct);
	    	if( result ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
					alert.setHeaderText(" ��ǰ ���� ����");
				alert.showAndWait();
	    		Home.home.loadpage("/view/product/product.fxml");
	    	}else {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    			alert.setHeaderText(" ��ǰ ���� ���� [�����ڿ��Թ���]");
	    		alert.showAndWait();
	    	}
	    }

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/productview.fxml");
	    }

	    @FXML
	    void img(ActionEvent event) {
	    	// 1. ���� ���� Ŭ���� 
	    	FileChooser fileChooser = new FileChooser();
	    	// 2. *���� ����[����] ���� 
	    		fileChooser.getExtensionFilters().add( 
	    				new ExtensionFilter("�̹�������:image file" , "*png" , "*jpeg" , "*jpg","*gif") );
	    	// 3. ���ο� stage���� ���ϼ��� ȭ�� ���� 
	    	File file = fileChooser.showOpenDialog( new Stage() );
	    		// ���ϼ��ð�ü.showOpenDialog( �������� ) ;
	    		// fileChooser ȭ�鿡�� ���õ� ������ file Ŭ������üȭ
	    	// 4. ������ ������ ��� ǥ��
	    	imgpath.setText("���� ��� : " + file.getPath() ); // ��� ���м� : \
	    	// 5. ���ϰ�� 
	    	pimage = file.toURI().toString(); // ��� ���м� : /
	    	// 6. �̸����� �̹�����Ʈ�ѿ� ����
	    	Image image = new Image( pimage ); // �ش� �̹����� ��� ���� ��  / ���� �Ǿ� �־���� 
	    	imgview.setImage(image); // ImageView �� �ش� �̹��� �־��ֱ�
	    	
	    	// * ������ ������ ���� ������Ʈ ������ ����(�̵�) �ؿ���
	    	try {
	    	// 1. ���� �Է� ��Ʈ��[ �̵� ���� : ����Ʈ ]
	    		FileInputStream inputStream = new FileInputStream(file); // file : fileChooser���� ���õ� ���� ��ü
	    	// 2. ���� ��� ��Ʈ��
	    		// 1. ���ο� ��� ����
	    		File copyfile = new File("C:/Users/504/Desktop/java2022wed/FXJAVA/src/img/" +file.getName() );
	    		FileOutputStream outputStream = new FileOutputStream( copyfile );
	    	// 3. ����Ʈ �迭 ���� 
	    		byte[] bytes = new byte[1024*1024*50]; // 1����Ʈ -> 1024����Ʈ -> 1Ű�ι���Ʈ -> 1024Ű�ι���Ʈ-> 1�ް�����Ʈ
	    	// 4. �ݺ����� �̿��� inputStream�� ���� ��Ʈ�� ��� �о���� 
	    		int size;
	    		while(  ( size = inputStream.read( bytes ) ) > 0 ) { // �о�� ����Ʈ�� 0���� ������ �ݺ��� ���� [ �о�� ����Ʈ�� ���������� �ݺ� ]
	    			outputStream.write(bytes , 0 , size ); // �о�� ����Ʈ��ŭ ��������
	    		}
	    	// 5. �뷮 ū ��쿡�� ��Ʈ�� ���� �ʼ�!!!
	    		inputStream.close();
	    		outputStream.close();
	    	// * ����� ������ ��θ� db ����
	    		pimage = copyfile.toURI().toString();
	    	}catch (Exception e) {System.out.println(e);}
	    }

}
