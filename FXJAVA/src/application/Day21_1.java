package application;

import java.awt.Button;

// javafx�� ���[ awt, swing ��]
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
					// extends : ��� [ Application : JAVAFX GUI ���� Ŭ���� ]
						// ��ӹ����� ����Ŭ������ ����� ����Ҽ� �ִ�.
	@Override
	public void start(Stage ��������) throws Exception {
		// javafx�� �����ϴ� �޼ҵ�[ �߻� -> ���� ]
			// Start (stage �������� �̸�)
		
		//1. �����̳� �����
		VBox box = new VBox();
			//2. ��Ʈ�Ѹ����
			Button button = new Button();
		// 3. �����̳ʿ� ��Ʈ�� �ֱ�
			box.getChildren().add(button);
		��������.show();
	}
	public static void main(String[] args) { // ���� ������ ������ �ִ� �޼ҵ�
		launch(args); // start �޼ҵ� ȣ��
		
	}
}
