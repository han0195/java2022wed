package application.Day22_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day22_1 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// 5. �����̳� �ҷ�����
				// Parent : ��� ���̾ƿ��� �θ�
				Parent parent = 
						FXMLLoader.load(getClass().getResource("�����ͺ��̽�fx����.fxml"));
																		//  /��Ű����(����)/���ϸ�.Ȯ����
				// 6. �� ��ü -> �����̳� 
				Scene scene = new Scene(parent);
				// 7. �� -> �������� 
				stage.setScene(scene);
				stage.show(); // 1. �������� ���� 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
