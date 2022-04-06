package controller.product;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.MemberDao;
import dao.productdao;
import dto.product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class productview implements Initializable{
	
	  	@FXML
	    private Button btndelet;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    private TextField txtname;

	    @FXML
	    private TextArea txttcontent;

	    @FXML
	    private Label lablpass;

	    @FXML
	    private Label lablid;

	    @FXML
	    private Label txtprice;

	    @FXML
	    private Label lablmin;
	    @FXML
	    private ImageView img;
	    @FXML
	    private Label labldate;
	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/product.fxml");
	    }

	    @FXML
	    void delet(ActionEvent event) {
	    	product product = productC.selet;
	    	Alert alert = new Alert(AlertType.CONFIRMATION);
	    	alert.setHeaderText("정말삭제하겠습니까?");
	    	Optional<ButtonType> optional = alert.showAndWait();
	    	if(optional.get() == ButtonType.OK) {
	    		boolean result = productdao.productdao.productdelet(product.getPnum());
	    		if(result) {
	    			Home.home.loadpage("/view/product/product.fxml");
	    		}
	    	}
	    }

	 @FXML
	 void update(ActionEvent event) {
	   Home.home.loadpage("/view/product/productupdate.fxml");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		product product = productC.selet;
		
		img.setImage(new Image(product.getPimg()));
		txtname.setText(product.getPname());
		txttcontent.setText(product.getPcontent());
		txtprice.setText("가격: " + product.getPprice());
			// * 천단위 쉼표
		DecimalFormat decimalFormat = new DecimalFormat("가격: #,##0원");
		txtprice.setText( decimalFormat.format(product.getPprice() )  );
		if(product.getPactivation() == 1) {lablpass.setText("상태: 판매중");}
		if(product.getPactivation() == 2) {lablpass.setText("상태: 거래중");}
		if(product.getPactivation() == 3) {lablpass.setText("상태: 판매완료");}
		labldate.setText("제품 등록일 : " + product.getPdate());
		//* 회원번호로 이용한 회원dkdlel 찾기
		lablid.setText("제품등록회원: " + MemberDao.memberDao.getmid(product.getMnum()));
		// 제품등록 회원번호랑 로그인회원 번호가 동일하지않으면
		txtname.setEditable(false);
		 txttcontent.setEditable(false);
		if(Login.member.getMnum() != product.getMnum()) {
			txtname.setEditable(false);
			txttcontent.setEditable(false);
		}
		
			
		
	}
}
