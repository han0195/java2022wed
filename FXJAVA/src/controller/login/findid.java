package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class findid implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			
		    	
	}
	@FXML
    private Button btnfindid;

    @FXML
    private Button btnback;

    @FXML
    private Label findiderr;

    @FXML
    private TextField findidmail;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("아이디찾기에서 뒤로가기");
    	Login.instance.loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println("아이디찾기 버튼");
    }
}
