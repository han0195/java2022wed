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
			//각 컨트롤에 선택된 board의 데이터 설정하기
			lblwrite.setText("작성자: " + board.getBwrite());
			lbldate.setText("작성자: " + board.getBdate());
			lblview.setText("작성자: " + board.getBview());
			txttitle.setText(board.getBtitle());
			txtcontent.setText(board.getBcontent());
			// 만약에 로그인아이디와 작성자가 같지 않다면
			if(! board.getBwrite().equals(Login.member.getMid())) {
				btndelete.setVisible(false);
				btnupdate.setVisible(false);
			}
			//제목과 내용을 수정 못하게 수정
			txttitle.setEditable(false);
			txtcontent.setEditable(false);
			replytableshow();
			
		}
	    
	    //댓글 테이블 메소드
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
	    	// 3. 리스트 연결
	    	replytable.setItems(replylist);
		}

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/home/infolist.fxml");
	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	// 경고메세지
	    	Alert alert = new Alert( AlertType.CONFIRMATION);
	    		alert.setHeaderText("해당 게시물을 삭제할까요? [복구불가]");
	    	Optional<ButtonType> optional = alert.showAndWait();
	    		//Optional 클래스 : null를 객체로 저장하는 클래스
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
	    		alert.setHeaderText("댓글작성완료");
	    		alert.showAndWait();
	    		txtrecontent.setText("");
	    		replytableshow();
	    	}
	    }
	    
	    boolean Upcheck = true;
	    @FXML
	    void update(ActionEvent event) { 	
	    	//경고메세지
	    	Alert alert = new Alert( AlertType.INFORMATION);
	    	if(Upcheck) {
	    		alert.setHeaderText("수정후 수정 버튼 한번더 눌러주세요");
	    		alert.showAndWait();
	    		txttitle.setEditable(true);
	    		txtcontent.setEditable(true);
	    		btnupdate.setText("수정완료");
	    		Upcheck = false;		
	    	}else {
	    		//db 처리
	    		BoardDao.boardoao.update(controller.home.Board.board.getBnum(), txttitle.getText(), txtcontent.getText());
	    		alert.setHeaderText("수정이 완료 되었습니다");
	    		alert.showAndWait();
	    		txttitle.setEditable(false);
	    		txtcontent.setEditable(false);
	    		btnupdate.setText("수정");
	    		Upcheck = true;
	    	}
	    }
	
}
