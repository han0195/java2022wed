package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Boardwrite implements Initializable{
	
    @FXML
    private Button btnback;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnwrtie;

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/home/infolist.fxml");
    }

    @FXML
    void write(ActionEvent event) {
    	String tit = txttitle.getText();
    	String con = txtcontent.getText();
    	String write = Login.member.getMid();
    	Board board = new Board(0, tit, con, write, null, 0);
    	boolean result = BoardDao.boardoao.write(board);
    	if(result) {//성공
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("메세지가 작성되었습니다");
    		alert.showAndWait();
    		Home.home.loadpage("/view/home/infolist.fxml");
    	}else {//실패
    		
    	}
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	
    }
}
