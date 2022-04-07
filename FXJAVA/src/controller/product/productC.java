package controller.product;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.productdao;
import dto.product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class productC implements Initializable{
	
	  @FXML
	  private Button btn;

	  @FXML
	  private ScrollPane scrollpane;

	  @FXML
	  private VBox vbox;
	  @FXML
	  private TextField txtsearch;

	  @FXML
	  private Button btnsearch;

	
	  public static product selet;
	  @FXML
	   void search(ActionEvent event) { // 검색 버튼을 눌렀을때
		  String search = txtsearch.getText();
		  listview(search);// 검색String 넘김
	   }
    @FXML
    void add(ActionEvent event) {
    	Home.home.loadpage("/view/product/productadd.fxml");
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listview(null); // 초기값 null
	}
	void listview(String search) {
		//if (vbox.getChildren().isEmpty() == false) {
			vbox.getChildren().clear();
		//}
		
		ArrayList<product> productlist = productdao.productdao.list( Home.category, search);
		//2. 그리드 클래스
		GridPane gridPane = new GridPane();
			// * 그리드간 여백
		 gridPane.setPadding(new Insets(10));
		 	// * 버튼들 여백
		 gridPane.setHgap(20); // 세로여백
		 gridPane.setVgap(20); // 가로여백
		//3. 반복문
		int i = 0;
		for(int row = 0; row < productlist.size() / 3 ; row++){ // 행
			for( int col = 0; col < 3 ;col++){// 열
				//1. 이미지
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
					imageView.setFitWidth(250);
					imageView.setFitHeight(200);
				//2.
				Button button = new Button(null, imageView);
					//버튼배경제거
				button.setStyle("-fx-background-color:transparent");
				//버튼의 아이디값넣기
				button.setId(i + "");
				// * 버튼 클릭이벤트
				button.setOnAction( e -> { 
					// 1. 클릭한 버튼의 id 가져오기
					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
					// 2. 크릭한 제품 번호 저장
					selet = productlist.get(id);
					Home.home.loadpage("/view/product/productview.fxml");
				} );
				
				gridPane.add(button, col, row);
				i++;
			}
		}
		// * 3배수의 나머지값
		int row =  productlist.size() / 3; // 마지막행
		int remain = productlist.size() % 3;
		if(remain != 0) {
			for( int col = 0; col < remain ;col++){// 열
				//1. 이미지 // 여기서 멈춤
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
					imageView.setFitWidth(250);
					imageView.setFitHeight(200);
				//2.
				Button button = new Button(null, imageView);
					//버튼배경제거
				button.setStyle("-fx-background-color:transparent");
				//버튼의 아이디값넣기
				button.setId(i + "");
				// * 버튼 클릭이벤트
				button.setOnAction( e -> {
					// 1. 클릭한 버튼의 id 가져오기
					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
					// 2. 크릭한 제품 번호 저장
					selet = productlist.get(id);
					Home.home.loadpage("/view/product/productview.fxml");
				} );
				
				gridPane.add(button, col, row + 1); // 마지막행에 나머지 값만 버튼 추가해서 그리드에 추가
				i++;
			}
		}
		
		//4. vbox 추가
		vbox.getChildren().add(gridPane);
	}
	   
}
