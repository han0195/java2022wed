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
	private Label labltotal; // fxid ��üȭ
	@FXML
	private Label lablptotal; // fxid ��üȭ
	@FXML
	private Label lablbtotal; // fxid ��üȭ
	@FXML
	private BarChart<String, Integer> mbc; // fxid ��üȭ
	@FXML
	private BarChart<String, Integer> bbc; // fxid ��üȭ
	@FXML
	private BarChart<String, Integer> pbc; // fxid ��üȭ
	@FXML
	private PieChart filechart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ��ü ȸ���� 
		int mtotal = MemberDao.memberDao.membertotal();
		labltotal.setText( mtotal+" ��");
		// ��ü ��ǰ�� 
		int ptotal = ProductDao.productDao.membertotal();
		lablptotal.setText( ptotal+" ��");
		// ��ü �Խù��� 
		int btotal = BoardDao.boardDao.membertotal();
		lablbtotal.setText( btotal+" ��");
		
		// ��¥���� ȸ�� ���� �� 
		// 1. xy�� �迭 ����
		XYChart.Series series = new XYChart.Series<>(); 
			// XYChart.Series : �迭 Ŭ����
				// XYChart.Data : �迭������ Ŭ���� [ x���� �� , y���ǰ� ]
		// 2. DB���� ������ �������� 
			// ��¥���� ȸ������ ��üũ [ 2022-04-11  ,  3 ]
			// Map �÷��� => Ű(��¥) , ��(������ ��) ���� �ϳ��� ��Ʈ�� ���� 
		Map<String, Integer> map 
		= MemberDao.memberDao.datetotal2("msince","member");
		// 3. �����͸� �迭�� �߰� 
			for( String key : map.keySet() ) { // �ݸ� 
				// 3-1 : ������ �迭 ���� ( ������ : key=��¥ , value=�����ڼ� )
				XYChart.Data data = new XYChart.Data<>( key , map.get(key) );
				// 3-2 : �ش� ������ ��ü�� �迭�� �߰�
				series.getData().add(data);
			}
		// 4. �ش� �迭�� ������Ʈ�� �߰� 
		mbc.getData().add(series);
		
		// 1. �迭 ����
		XYChart.Series series2 = new XYChart.Series<>();
		Map<String, Integer> map2 
					= MemberDao.memberDao.datetotal2("bdate","board");
		for( String key : map2.keySet() ) {
			// 2. ������ ���� 
			XYChart.Data data 
				= new XYChart.Data<>( key , map2.get(key) );
			// 3. �迭�� ������ �߰� 
			series2.getData().add(data);
		}
		// 4. ��Ʈ�� �迭 �߰� 
		bbc.getData().add(series2);
		
		// 1. �迭 ����
		XYChart.Series series3 = new XYChart.Series<>();	
		// �޼ҵ�ȣ��
		Map<String, Integer> map3 
				= MemberDao.memberDao.datetotal2("pdate","product");
		for( String key : map3.keySet() ) {
		// 2. ������ ���� 
			XYChart.Data data 
			= new XYChart.Data<>( key , map3.get(key) );
			// 3. �迭�� ������ �߰� 
			series3.getData().add(data);
		}
			// 4. ��Ʈ�� �迭 �߰� 
		pbc.getData().add(series3);
		// ��Ʈ �ִ¼���
		// 1. �迭 �� �޼ҵ� ȣ��
		// 2. ��ȯ���� HashMap �� ���� �ݺ����� ������ XYChart.date �� �̿��ؼ� ��ü�� �����Ѵ�
		// 3. �������� ����Ʈ�� �迭�� ����
		// 4. �迭�� ��Ʈ�� �߰��Ѵ�
		
		// ������Ʈ : ī�װ��� ����				
		ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
		// 2. db���� ī�װ��� ����
		Map<String, Integer> cmap = MemberDao.memberDao.countcategory();

		for(String key : cmap.keySet()) {
			PieChart.Data temp = new PieChart.Data(key, cmap.get(key));
			list.add(temp);
		}
		// 4. ����Ʈ�� ������Ʈ�� �߰�
		filechart.setData(list);
		
	}
	
	
	
	
	
	
}