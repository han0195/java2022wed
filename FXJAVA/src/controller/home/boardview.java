package controller.home;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import dto.reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class boardview implements Initializable{

		@FXML
		private Button btnback;

		@FXML
		private TextField txttitle;

		@FXML
	    private TextArea txtcontent;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    private Button btndelete;

	    @FXML
	    private Label lblwrite;

	    @FXML
	    private Label lbldate;

	    @FXML
	    private Label lblview;

	    @FXML
	    private TextField txtrecontent;

	    @FXML
	    private Button btnrewrite;

	    @FXML
	    private TableView<reply> replytable;
	    
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {

			Board board = controller.home.Board.board;
			//�� ��Ʈ�ѿ� ���õ� board�� ������ �����ϱ�
			lblwrite.setText("�ۼ���: " + board.getBwrite());
			lbldate.setText("�ۼ���: " + board.getBdate());
			lblview.setText("�ۼ���: " + board.getBview());
			txttitle.setText(board.getBtitle());
			txtcontent.setText(board.getBcontent());
			// ���࿡ �α��ξ��̵�� �ۼ��ڰ� ���� �ʴٸ�
			if(! board.getBwrite().equals(Login.member.getMid())) {
				btndelete.setVisible(false);
				btnupdate.setVisible(false);
			}
			//����� ������ ���� ���ϰ� ����
			txttitle.setEditable(false);
			txtcontent.setEditable(false);
			replytableshow();
			
		}
	    
	    //��� ���̺� �޼ҵ�
	    public void replytableshow() {
			
	    	ObservableList<reply> replylist = BoardDao.boardoao.rlist(controller.home.Board.board.getBnum());
	    	
	    	TableColumn tc = replytable.getColumns().get(0);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
	    	
	    	tc = replytable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
	    	
	    	tc = replytable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));
	    	
	    	tc = replytable.getColumns().get(3);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
	    	

	    	System.out.println("d");
	    	// 3. ����Ʈ ����
	    	replytable.setItems(replylist);
		}

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/home/infolist.fxml");
	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	// ���޼���
	    	Alert alert = new Alert( AlertType.CONFIRMATION);
	    		alert.setHeaderText("�ش� �Խù��� �����ұ��? [�����Ұ�]");
	    	Optional<ButtonType> optional = alert.showAndWait();
	    		//Optional Ŭ���� : null�� ��ü�� �����ϴ� Ŭ����
	    	if(optional.get() == ButtonType.OK) {
	    		boolean result = BoardDao.boardoao.delete(controller.home.Board.board.getBnum());
	    		if(result) {
	    			Home.home.loadpage("/view/home/infolist.fxml");
	    		}
	    	}
	    	
	    }

	    @FXML
	    void rewrite(ActionEvent event) {
	    	String con = txtrecontent.getText();
	    	String write = Login.member.getMid();
	    	int bnum = controller.home.Board.board.getBnum();
	    	reply temp = new reply(0,con,write,null,bnum);
	    	boolean result = BoardDao.boardoao.rwrtite(temp);
	    	if(result) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setHeaderText("����ۼ��Ϸ�");
	    		alert.showAndWait();
	    		txtrecontent.setText("");
	    		replytableshow();
	    	}
	    }
	    
	    boolean Upcheck = true;
	    @FXML
	    void update(ActionEvent event) { 	
	    	//���޼���
	    	Alert alert = new Alert( AlertType.INFORMATION);
	    	if(Upcheck) {
	    		alert.setHeaderText("������ ���� ��ư �ѹ��� �����ּ���");
	    		alert.showAndWait();
	    		txttitle.setEditable(true);
	    		txtcontent.setEditable(true);
	    		btnupdate.setText("�����Ϸ�");
	    		Upcheck = false;		
	    	}else {
	    		//db ó��
	    		BoardDao.boardoao.update(controller.home.Board.board.getBnum(), txttitle.getText(), txtcontent.getText());
	    		alert.setHeaderText("������ �Ϸ� �Ǿ����ϴ�");
	    		alert.showAndWait();
	    		txttitle.setEditable(false);
	    		txtcontent.setEditable(false);
	    		btnupdate.setText("����");
	    		Upcheck = true;
	    	}
	    }
	
}
