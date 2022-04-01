package application.Day22_1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DB테스트컨트롤러 implements Initializable{
									// fxml이 새로 열렸을때 초기값
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		 Day22_2 DB연동 = new Day22_2(); // 생성자의 DB 연동을 코드를 넣었기 때문에 객체생성할때 DB연동됨
		
		}
	 	@FXML
	    private AnchorPane db;

	    @FXML
	    private TextField textwriter;

	    @FXML
	    private TextField textcontent;

	    @FXML
	    private Button btnget;

	    @FXML
	    private Button btnwriter;

	    @FXML
	    private TextArea contentlist;

	    @FXML
	    void write(ActionEvent event) {
	    	System.out.println("db등록");
	    	String 작성자 = textwriter.getText();
	    	String 내용 = textcontent.getText();
	    	
	    	//1. DB 연동 객체 만들
	    	Day22_2 db연동 = new Day22_2();
	    	boolean result = db연동.write(작성자, 내용);
	    	if(result) {
	    		System.out.println("[db에 데이터 저장 성공]");
	    		
	    		// 성공시 컨트롤에 입력된 데이터 지워주기
	    			// fxid명.setTexet(내용); text안 초기화
	    		textwriter.setText("");
	    		textcontent.setText("");
	    	}else {
	    		System.out.println("[db에 데이터 저장 실패]");
	    	}
	    }

	    @FXML
	    void get(ActionEvent event) {
	    	System.out.println("DB 데이터 호출");
	    	
	    	// 1. db 연동
	    	Day22_2 db연동 = new Day22_2();
	    	// 2. db 객체내 메소드호출
	    	ArrayList<Data> 데이터목록 = db연동.get();
	    	
	    	// 3. 리스트를 컨트롤에 넣어주기
	    	for(Data temp : 데이터목록) {	
	    		//contentlist.appendText contentlist 추가
	    		contentlist.appendText(
	    				temp.get번호() +" , "+
	    				temp.get작성자()+" , "+
	    				temp.get내용()+"\n"
	    				);
	    	}
	    	
	    }
}
