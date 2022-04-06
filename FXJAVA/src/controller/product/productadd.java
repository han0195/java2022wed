package controller.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import controller.home.Home;
import controller.login.Login;
import dao.productdao;
import dto.product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class productadd {
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

	    @FXML
	    void add(ActionEvent event) {
	    	// 1. ��Ʈ�ѿ� �Էµ� ������ ��������
	    	String name = txtpname.getText();
	    	String content = txtpcontent.getText();
	    	int price = Integer.parseInt(txtpprice.getText());
	    		// * ī�װ�
	    	String category = null;
	    	if(opt1.isSelected()) { // ���࿡ opt1��� fxid�� ��Ʈ���� ���õǾ�����
	    		category = "�����Ƿ�";  	
	    	}
	    	if(opt2.isSelected()) {	category = "�����Ƿ�";}
	    	if(opt3.isSelected()) {	category = "���ӱ��";	}
	    	if(opt4.isSelected()) { category = "��Ȱ��ǰ"; }
	    	int mnum = Login.member.getMnum();
	    	String img = pimge;
	    	// 2. ��üȭ
	    	product temp = new product(0,name, img,content,category, price,1,null , mnum);
	    	// 3. DBó��
	    	boolean result = productdao.productdao.add(temp);
	    	// 4. ���ó��
	    	if( result ) {
	    		Alert alert = new Alert(AlertType.INFORMATION ); // �޽��� 
	    			alert.setHeaderText("��ǰ ��� �Ϸ�");
	    		alert.showAndWait();	
	    		Home.home.loadpage("/view/product/product.fxml"); // ȭ����ȭ
	    		
	    	}else {
	    		Alert alert = new Alert(AlertType.INFORMATION );
					alert.setHeaderText("��ǰ ��� ���� [ �����ڿ��� ����]");
				alert.showAndWait();
	    	}
	    }
	    
	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/product.fxml");
	    }
	    
	    private String pimge = null; // �޼ҵ� ������ �����ϴ� ���� : imgadd�޼ҵ�
	    @FXML
	    void img(ActionEvent event) {
	    	// 1. ���� ����Ŭ����
	    	FileChooser chooser = new FileChooser();
	    	
	    	// 2. ���� ���� ����
	    	chooser.getExtensionFilters().add( new ExtensionFilter("�̹�������: image file" , "*png", "*jpeg", "*gif"));
	    	
	    	// 3. ���ο� stage(������â)
	    	File file = chooser.showOpenDialog(new Stage());
	    		// ���ϼ��ð�ü.showDpenDialog( �������� �̸� );
	    	
	    	// 4. ������ ������ ���
	    	imgpath.setText("���ϰ��: " + file.getPath());
	    	
	    	// 5.
	    	pimge = file.toURI().toString();
	    	// 6. �̸����� �̹�����Ʈ�ѿ� ����
	    	Image image = new Image(pimge);
	    	imgview.setImage(image);
	    	 //* ������ ������ ���� ������Ʈ ������ ����(�̵�) �ؿ���
	    	try {
	    	    // 1. ���� �Է� ��Ʈ�� [ �̵� ���� : ����Ʈ ]
	    	    FileInputStream InputStream = new FileInputStream(file); // file : fileChooser���� ���õ� ���� ��ü
	    	   // 2. ���� ��� ��Ʈ��
	    	    // 1. ���ο� ��� ����
	    	    File copyfile = new File("C:/Users/504/Desktop/java2022wed/FXJAVA/src/img/" + file.getName());
	    	    FileOutputStream outputStream = new FileOutputStream(copyfile);
	    	   // 3. ����Ʈ �迭 ����
	    	    byte[] bytes = new byte[1024 * 1024 * 1024];
	    	    // 4. �ݺ����� �̿��� InputStream�� ���� ��Ʈ�� ��� �о����
	    	    int size;
	    	    while( (size = InputStream.read(bytes)) > 0 ) { // �о�� ����Ʈ�� 0 ���� ������ �ݺ��� ����
	    	    	outputStream.write(bytes);
	    	    	
	    	    }
	    	    // 5. �뷮 ū ��쿡�� ��Ʈ�� ���� �ʼ�!!
	    	    InputStream.close();
	    	    outputStream.close();
	    	    // * ���ϸ� db ����
	    	    pimge = copyfile.toURI().toString();
	    	} catch (Exception e) {
				// TODO: handle exception
			}
	    }

}
