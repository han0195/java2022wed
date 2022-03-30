package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class findpw implements Initializable {
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	 @FXML
	    private TextField findpwid;

	    @FXML
	    private Button btnfindpw;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label fintpwerr;

	    @FXML
	    private TextField findpwmail;

	    @FXML
	    void back(ActionEvent event) {
	    	System.out.println("아이디찾기에서 뒤로가기");
	    	Login.instance.loadpage("/view/login/loginpane.fxml");
	    }

	    @FXML
	    void accfindpw(ActionEvent event) {
	    	System.out.println("비밀번호찾기 버튼");
	    }
}
