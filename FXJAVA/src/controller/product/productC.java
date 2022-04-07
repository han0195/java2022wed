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
	   void search(ActionEvent event) { // �˻� ��ư�� ��������
		  String search = txtsearch.getText();
		  listview(search);// �˻�String �ѱ�
	   }
    @FXML
    void add(ActionEvent event) {
    	Home.home.loadpage("/view/product/productadd.fxml");
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listview(null); // �ʱⰪ null
	}
	void listview(String search) {
		//if (vbox.getChildren().isEmpty() == false) {
			vbox.getChildren().clear();
		//}
		
		ArrayList<product> productlist = productdao.productdao.list( Home.category, search);
		//2. �׸��� Ŭ����
		GridPane gridPane = new GridPane();
			// * �׸��尣 ����
		 gridPane.setPadding(new Insets(10));
		 	// * ��ư�� ����
		 gridPane.setHgap(20); // ���ο���
		 gridPane.setVgap(20); // ���ο���
		//3. �ݺ���
		int i = 0;
		for(int row = 0; row < productlist.size() / 3 ; row++){ // ��
			for( int col = 0; col < 3 ;col++){// ��
				//1. �̹���
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
					imageView.setFitWidth(250);
					imageView.setFitHeight(200);
				//2.
				Button button = new Button(null, imageView);
					//��ư�������
				button.setStyle("-fx-background-color:transparent");
				//��ư�� ���̵𰪳ֱ�
				button.setId(i + "");
				// * ��ư Ŭ���̺�Ʈ
				button.setOnAction( e -> { 
					// 1. Ŭ���� ��ư�� id ��������
					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
					// 2. ũ���� ��ǰ ��ȣ ����
					selet = productlist.get(id);
					Home.home.loadpage("/view/product/productview.fxml");
				} );
				
				gridPane.add(button, col, row);
				i++;
			}
		}
		// * 3����� ��������
		int row =  productlist.size() / 3; // ��������
		int remain = productlist.size() % 3;
		if(remain != 0) {
			for( int col = 0; col < remain ;col++){// ��
				//1. �̹��� // ���⼭ ����
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
					imageView.setFitWidth(250);
					imageView.setFitHeight(200);
				//2.
				Button button = new Button(null, imageView);
					//��ư�������
				button.setStyle("-fx-background-color:transparent");
				//��ư�� ���̵𰪳ֱ�
				button.setId(i + "");
				// * ��ư Ŭ���̺�Ʈ
				button.setOnAction( e -> {
					// 1. Ŭ���� ��ư�� id ��������
					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
					// 2. ũ���� ��ǰ ��ȣ ����
					selet = productlist.get(id);
					Home.home.loadpage("/view/product/productview.fxml");
				} );
				
				gridPane.add(button, col, row + 1); // �������࿡ ������ ���� ��ư �߰��ؼ� �׸��忡 �߰�
				i++;
			}
		}
		
		//4. vbox �߰�
		vbox.getChildren().add(gridPane);
	}
	   
}
