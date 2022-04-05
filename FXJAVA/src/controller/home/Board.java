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
    
    public static dto.Board board; // 테이블에서 저장
   @Override
   public void initialize(URL arg0, ResourceBundle arg1) {
	   // * ObservableList 사용하는 이유 : TableView 가 사용하기때문
	   // 1. db에서 모든 게시글 가져오기
	   ObservableList<dto.Board> boarlist = BoardDao.boardoao.list();
	   // 2. tableview에 추가
	   		// 현재 테이블 각 열 마다 리스트내 필드 선정
	   TableColumn tc = boardtabel.getColumns().get(0); // 테이블의 첫번째
	   tc.setCellValueFactory( new PropertyValueFactory<>("bnum"));
	   
	   tc = boardtabel.getColumns().get(1);
	   tc.setCellValueFactory( new PropertyValueFactory<>("btitle"));
	   
	   tc = boardtabel.getColumns().get(2);
	   tc.setCellValueFactory( new PropertyValueFactory<>("bwrite"));
	   
	   tc = boardtabel.getColumns().get(3);
	   tc.setCellValueFactory( new PropertyValueFactory<>("bdate"));
	   
	   tc = boardtabel.getColumns().get(4);
	   tc.setCellValueFactory( new PropertyValueFactory<>("bview"));
	   // 3. 리스트 연결
	   boardtabel.setItems(boarlist);
	   	//테이블명
	   
	   //* boardtabel.setOnMouseClicked 마우스클릭이벤트
	   boardtabel.setOnMouseClicked( e -> { 
		   // 1. 테이블에서 클릭한 정도 저장
		   board = boardtabel.getSelectionModel().getSelectedItem(); // 클릭된 board 객체 호출
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		   String since = format.format( new Date() ); // 현재날짜를 형식 변환
		   //조회수 증가
		   BoardDao.boardoao.view(controller.home.Board.board.getBnum(), Login.member.getMnum(),since);
		   // 3. 페이지 전환
		   Home.home.loadpage("/view/home/boardview.fxml");
	   } );
	   
	   // -> : 람다식 ( 익명함수 : 이름이 없는 함수 [인수 와 실행코드만 존재] )
	   // vs
	   // void 함수명( 인수1 ) { 실행코드 : 함수 }
   }
   @FXML // 글쓰기 선택했을때
   public void accwrite(ActionEvent event) {
	  Home.home.loadpage("/view/home/boardwrite.fxml");
	  
   }
   
   
}
