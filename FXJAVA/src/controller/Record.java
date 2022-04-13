package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import dto.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Record implements Initializable {
	
	@FXML
	private Label labltotal; // fxid 객체화
	@FXML
	private Label lablptotal; // fxid 객체화
	@FXML
	private Label lablbtotal; // fxid 객체화
	@FXML
	private BarChart<String, Integer> mbc; // fxid 객체화
	@FXML
	private BarChart<String, Integer> bbc; // fxid 객체화
	@FXML
	private BarChart<String, Integer> pbc; // fxid 객체화
	@FXML
	private PieChart filechart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 전체 회원수 
		int mtotal = MemberDao.memberDao.membertotal();
		labltotal.setText( mtotal+" 명");
		// 전체 제품수 
		int ptotal = ProductDao.productDao.membertotal();
		lablptotal.setText( ptotal+" 개");
		// 전체 게시물수 
		int btotal = BoardDao.boardDao.membertotal();
		lablbtotal.setText( btotal+" 개");
		
		// 날짜별로 회원 가입 수 
		// 1. xy축 계열 생성
		XYChart.Series series = new XYChart.Series<>(); 
			// XYChart.Series : 계열 클래스
				// XYChart.Data : 계열데이터 클래스 [ x축의 값 , y축의값 ]
		// 2. DB에서 데이터 가져오기 
			// 날짜별로 회원가입 수체크 [ 2022-04-11  ,  3 ]
			// Map 컬렉션 => 키(날짜) , 값(가입자 수) 으로 하나의 엔트리 구성 
		Map<String, Integer> map 
		= MemberDao.memberDao.datetotal2("msince","member");
		// 3. 데이터를 계열에 추가 
			for( String key : map.keySet() ) { // 반목문 
				// 3-1 : 데이터 계열 선언 ( 생성자 : key=날짜 , value=가입자수 )
				XYChart.Data data = new XYChart.Data<>( key , map.get(key) );
				// 3-2 : 해당 데이터 객체를 계열에 추가
				series.getData().add(data);
			}
		// 4. 해당 계열을 막대차트에 추가 
		mbc.getData().add(series);
		
		// 1. 계열 생성
		XYChart.Series series2 = new XYChart.Series<>();
		Map<String, Integer> map2 
					= MemberDao.memberDao.datetotal2("bdate","board");
		for( String key : map2.keySet() ) {
			// 2. 데이터 생성 
			XYChart.Data data 
				= new XYChart.Data<>( key , map2.get(key) );
			// 3. 계열에 데이터 추가 
			series2.getData().add(data);
		}
		// 4. 차트에 계열 추가 
		bbc.getData().add(series2);
		
		// 1. 계열 생성
		XYChart.Series series3 = new XYChart.Series<>();	
		// 메소드호출
		Map<String, Integer> map3 
				= MemberDao.memberDao.datetotal2("pdate","product");
		for( String key : map3.keySet() ) {
		// 2. 데이터 생성 
			XYChart.Data data 
			= new XYChart.Data<>( key , map3.get(key) );
			// 3. 계열에 데이터 추가 
			series3.getData().add(data);
		}
			// 4. 차트에 계열 추가 
		pbc.getData().add(series3);
		// 차트 넣는순서
		// 1. 계열 및 메소드 호출
		// 2. 반환받은 HashMap 을 통해 반복문을 돌려서 XYChart.date 를 이용해서 객체를 생성한다
		// 3. 생성직후 데이트를 계열에 저장
		// 4. 계열을 차트에 추가한다
		
		// 원형차트 : 카테고리별 개수				
		ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
		// 2. db에서 카테고리별 개수
		Map<String, Integer> cmap = MemberDao.memberDao.countcategory();

		for(String key : cmap.keySet()) {
			PieChart.Data temp = new PieChart.Data(key, cmap.get(key));
			list.add(temp);
		}
		// 4. 리스트를 원형차트에 추가
		filechart.setData(list);
		
	}
	
	
	
	
	
	
}