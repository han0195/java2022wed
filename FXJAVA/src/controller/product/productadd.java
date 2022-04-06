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
	    	// 1. 컨트롤에 입력된 데이터 가져오기
	    	String name = txtpname.getText();
	    	String content = txtpcontent.getText();
	    	int price = Integer.parseInt(txtpprice.getText());
	    		// * 카테고리
	    	String category = null;
	    	if(opt1.isSelected()) { // 만약에 opt1라는 fxid의 컨트롤이 선택되었으면
	    		category = "남성의류";  	
	    	}
	    	if(opt2.isSelected()) {	category = "여성의류";}
	    	if(opt3.isSelected()) {	category = "게임기기";	}
	    	if(opt4.isSelected()) { category = "생활용품"; }
	    	int mnum = Login.member.getMnum();
	    	String img = pimge;
	    	// 2. 객체화
	    	product temp = new product(0,name, img,content,category, price,1,null , mnum);
	    	// 3. DB처리
	    	boolean result = productdao.productdao.add(temp);
	    	// 4. 결과처리
	    	if( result ) {
	    		Alert alert = new Alert(AlertType.INFORMATION ); // 메시지 
	    			alert.setHeaderText("제품 등록 완료");
	    		alert.showAndWait();	
	    		Home.home.loadpage("/view/product/product.fxml"); // 화면전화
	    		
	    	}else {
	    		Alert alert = new Alert(AlertType.INFORMATION );
					alert.setHeaderText("제품 등록 실패 [ 관리자에게 문의]");
				alert.showAndWait();
	    	}
	    }
	    
	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/product.fxml");
	    }
	    
	    private String pimge = null; // 메소드 빡에서 선언하는 이유 : imgadd메소드
	    @FXML
	    void img(ActionEvent event) {
	    	// 1. 파일 선택클래스
	    	FileChooser chooser = new FileChooser();
	    	
	    	// 2. 파일 형식 선택
	    	chooser.getExtensionFilters().add( new ExtensionFilter("이미지파일: image file" , "*png", "*jpeg", "*gif"));
	    	
	    	// 3. 새로운 stage(윈도우창)
	    	File file = chooser.showOpenDialog(new Stage());
	    		// 파일선택객체.showDpenDialog( 스테이지 이름 );
	    	
	    	// 4. 선택한 파일의 경로
	    	imgpath.setText("파일경로: " + file.getPath());
	    	
	    	// 5.
	    	pimge = file.toURI().toString();
	    	// 6. 미리보기 이미지컨트롤에 띄우기
	    	Image image = new Image(pimge);
	    	imgview.setImage(image);
	    	 //* 선택한 파일을 현재 프로젝트 폴더로 복사(이동) 해오기
	    	try {
	    	    // 1. 파일 입력 스트림 [ 이동 단위 : 바이트 ]
	    	    FileInputStream InputStream = new FileInputStream(file); // file : fileChooser에서 선택된 파일 객체
	    	   // 2. 파일 출력 스트림
	    	    // 1. 새로운 경로 설정
	    	    File copyfile = new File("C:/Users/504/Desktop/java2022wed/FXJAVA/src/img/" + file.getName());
	    	    FileOutputStream outputStream = new FileOutputStream(copyfile);
	    	   // 3. 바이트 배열 선언
	    	    byte[] bytes = new byte[1024 * 1024 * 1024];
	    	    // 4. 반복문을 이용한 InputStream의 파일 스트림 모두 읽어오기
	    	    int size;
	    	    while( (size = InputStream.read(bytes)) > 0 ) { // 읽어온 바이트가 0 보다 작으면 반복문 종료
	    	    	outputStream.write(bytes);
	    	    	
	    	    }
	    	    // 5. 용량 큰 경우에는 스트림 종료 필수!!
	    	    InputStream.close();
	    	    outputStream.close();
	    	    // * 파일명 db 저장
	    	    pimge = copyfile.toURI().toString();
	    	} catch (Exception e) {
				// TODO: handle exception
			}
	    }

}
