package controller.home;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Board implements Initializable{
    @FXML
    private TableView<dto.Board> boardtabel;

    @FXML
    private Button btnwrite;
    
    public static dto.Board board; // ���̺��� ����
   @Override
   public void initialize(URL arg0, ResourceBundle arg1) {
	   // * ObservableList ����ϴ� ���� : TableView �� ����ϱ⶧��
	   // 1. db���� ��� �Խñ� ��������
	   ObservableList<dto.Board> boarlist = BoardDao.boardoao.list();
	   // 2. tableview�� �߰�
	   		// ���� ���̺� �� �� ���� ����Ʈ�� �ʵ� ����
	   TableColumn tc = boardtabel.getColumns().get(0); // ���̺��� ù��°
	   tc.setCellValueFactory( new PropertyValueFactory<>("bnum"));
	   
	   tc = boardtabel.getColumns().get(1);
	   tc.setCellValueFactory( new PropertyValueFactory<>("btitle"));
	   
	   tc = boardtabel.getColumns().get(2);
	   tc.setCellValueFactory( new PropertyValueFactory<>("bwrite"));
	   
	   tc = boardtabel.getColumns().get(3);
	   tc.setCellValueFactory( new PropertyValueFactory<>("bdate"));
	   
	   tc = boardtabel.getColumns().get(4);
	   tc.setCellValueFactory( new PropertyValueFactory<>("bview"));
	   // 3. ����Ʈ ����
	   boardtabel.setItems(boarlist);
	   	//���̺��
	   
	   //* boardtabel.setOnMouseClicked ���콺Ŭ���̺�Ʈ
	   boardtabel.setOnMouseClicked( e -> { 
		   // 1. ���̺��� Ŭ���� ���� ����
		   board = boardtabel.getSelectionModel().getSelectedItem(); // Ŭ���� board ��ü ȣ��
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		   String since = format.format( new Date() ); // ���糯¥�� ���� ��ȯ
		   //��ȸ�� ����
		   BoardDao.boardoao.view(controller.home.Board.board.getBnum(), Login.member.getMnum(),since);
		   // 3. ������ ��ȯ
		   Home.home.loadpage("/view/home/boardview.fxml");
	   } );
	   
	   // -> : ���ٽ� ( �͸��Լ� : �̸��� ���� �Լ� [�μ� �� �����ڵ常 ����] )
	   // vs
	   // void �Լ���( �μ�1 ) { �����ڵ� : �Լ� }
   }
   @FXML // �۾��� ����������
   public void accwrite(ActionEvent event) {
	  Home.home.loadpage("/view/home/boardwrite.fxml");
	  
   }
   
   
}
