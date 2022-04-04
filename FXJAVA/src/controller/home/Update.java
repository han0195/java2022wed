package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import controller.login.Login;
import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Update implements Initializable{
	@FXML
	private TextField fdemail;
	@FXML
	private TextField fdaddress;
	@FXML
	private Label lblchange;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	//변경 레이블 클릭 이벤트
	public void infochange( MouseEvent e ) {
		System.out.println("D");
		String email = fdemail.getText();
		String address = fdaddress.getText();
		boolean result = MemberDao.memberDao.updata(Login.member.getMnum(),email, address);
		if(result) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("변경성공");
			alert.showAndWait();
			Main.instance.loadpage("/view/home/home.fxml");
		}else {
			System.out.println("실패");
		}
	}
	
	
	
}
