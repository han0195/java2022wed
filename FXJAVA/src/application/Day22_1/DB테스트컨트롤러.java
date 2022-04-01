package application.Day22_1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DB�׽�Ʈ��Ʈ�ѷ� implements Initializable{
									// fxml�� ���� �������� �ʱⰪ
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		 Day22_2 DB���� = new Day22_2(); // �������� DB ������ �ڵ带 �־��� ������ ��ü�����Ҷ� DB������
		
		}
	 	@FXML
	    private AnchorPane db;

	    @FXML
	    private TextField textwriter;

	    @FXML
	    private TextField textcontent;

	    @FXML
	    private Button btnget;

	    @FXML
	    private Button btnwriter;

	    @FXML
	    private TextArea contentlist;

	    @FXML
	    void write(ActionEvent event) {
	    	System.out.println("db���");
	    	String �ۼ��� = textwriter.getText();
	    	String ���� = textcontent.getText();
	    	
	    	//1. DB ���� ��ü ����
	    	Day22_2 db���� = new Day22_2();
	    	boolean result = db����.write(�ۼ���, ����);
	    	if(result) {
	    		System.out.println("[db�� ������ ���� ����]");
	    		
	    		// ������ ��Ʈ�ѿ� �Էµ� ������ �����ֱ�
	    			// fxid��.setTexet(����); text�� �ʱ�ȭ
	    		textwriter.setText("");
	    		textcontent.setText("");
	    	}else {
	    		System.out.println("[db�� ������ ���� ����]");
	    	}
	    }

	    @FXML
	    void get(ActionEvent event) {
	    	System.out.println("DB ������ ȣ��");
	    	
	    	// 1. db ����
	    	Day22_2 db���� = new Day22_2();
	    	// 2. db ��ü�� �޼ҵ�ȣ��
	    	ArrayList<Data> �����͸�� = db����.get();
	    	
	    	// 3. ����Ʈ�� ��Ʈ�ѿ� �־��ֱ�
	    	for(Data temp : �����͸��) {	
	    		//contentlist.appendText contentlist �߰�
	    		contentlist.appendText(
	    				temp.get��ȣ() +" , "+
	    				temp.get�ۼ���()+" , "+
	    				temp.get����()+"\n"
	    				);
	    	}
	    	
	    }
}
