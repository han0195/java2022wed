package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // 처음 실행시 문구 x
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtaddress;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("뒤로가기 버튼을 눌렀습니다.");
    	Login.instance.loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void signup(ActionEvent event) {
    	// * 컨트롤에 입력된 데이터 가져오기
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	String passwordconfirm = txtpasswordconfirm.getText();
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	
    	//현재날짜 가져오기 [ SimpleDateFormat : 날짜 모양(형식) 변환 클래스 ]
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String cine = format.format( new Date() );
    	
    	// * 유효성 검사
    		//1. id 중복 체크
    		boolean result2 = MemberDao.memberDao.idcheck(id);
    		if(result2) {
    			lblconfirm.setText("사용중인 아이디");
    			return;
    		}
    		//2. id 형식 체크
    		if(id.length() < 4 || id.length() > 10) {
    			lblconfirm.setText("아이디는 5 ~ 9 글자입니다");
    			return;
    		}
    		//3. 비밀번호 체크
    		if(password.length() < 4 || password.length() > 10) {
    			lblconfirm.setText("비밀번호는 5 ~ 9 글자입니다");
    			return;
    		}
    		//4. 비밀번호 일치 체크
    		if(!password.equals(passwordconfirm)) {// 패스워드랑 패스워드확인이랑 일치하지 않으면
    			lblconfirm.setText("비밀번호가 일치하지 않습니다.");
    			return; // 메소드 종료
    		}
    		//3. 이메일 체크
    		// indexOf(기준) // 기준이없으면 -1 반환 있으면 인덱스 반환
    		if( email.indexOf("@") == -1) {
    			lblconfirm.setText("올바른 이메일이 아닙니다.");
    			return; // 메소드 종료
    		}
    		//4. 주소 체크
    		if( !address.contains("시") && address.contains("구")&& address.contains("동")) {
    			lblconfirm.setText("올바른 주소가 아닙니다.");
    			return; // 메소드 종료
    		}
    	// * 모든 유효성검 통과시 DB에 저장
    		//1. 객체화 [ 회원번호 없음, 아이디, 비밀번호, 이메일, 주소, 포인트, cine]
    		Member member = new Member(0, id, password, email, address, 0, cine);
    		//2. DB 객체내 메소드 호출
    		boolean result = MemberDao.memberDao.signup(member);
    		//3. 확인
    		if(result) {
    			// 1. 메시지창 출력 [ Alert : 메세지(알람) 클래스 ]
    			Alert alert = new Alert( AlertType.INFORMATION);
    			alert.setTitle("알림");
    			alert.setHeaderText("안산시 중고거래에 가입을 축하합니다");
    			alert.setContentText("회원가입 성공");
    			alert.showAndWait();
    			// 2. 화면전화 [로그인페이지 전환]
    			Login.instance.loadpage("/view/login/loginpane.fxml");
    		}else {
    			lblconfirm.setText("실패] DB오류 [ 관리자에게 문의 ]");
    			System.out.println("가입실패");
    		}
    }

}







