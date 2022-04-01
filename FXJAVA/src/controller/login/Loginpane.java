package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) { // 액션버튼 아이디
    	System.out.println(" 아이디찾기 페이지로 이동 ");
    	Login.instance.loadpage("/view/login/findid.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" 패스워드찾기 페이지로 이동 ");
    	Login.instance.loadpage("/view/login/findpw.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" 회원가입 페이지로 이동 ");
    	// *회원가입 버튼을 누르면 login컨트롤클래스 내 borderpane 컨테이너 center 페이지 변경
    	// 문제 : 다른 클래스내 컨테이너 호출 
//    		Login login = new Login(); // 새로운 컨테이너 생성 [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// 해결방안 : 기존 컨테이너 가져오는 방법 !!!! -> this
    	Login.instance.loadpage("/view/login/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	String id = txtid.getText();
    	String pw = txtpassword.getText();
    	
    	login(id, pw);
    	
    	System.out.println(" 로그인처리");
    }
    
    public boolean login(String id, String password) {
		// 1. 컨트롤에 입력된 값 가져오기
    	String txid = txtid.getText();
		// 2. db객체내 메소드 호출
		String txpw = txtpassword.getText();
		// 3. 결과 확인
		boolean result2 = MemberDao.memberDao.login(txid, password);
		if(result2) {
			//페이지 전환 [다음시간]
			// * 테스트
			lblconfirm.setText("로그인성공");
		}else {
			lblconfirm.setText("실패] 일치하는 회원정보가 없습니다");
		}
		return false;
	}
	
	
}










