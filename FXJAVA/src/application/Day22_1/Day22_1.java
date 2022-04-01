package application.Day22_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day22_1 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// 5. 컨테이너 불러오기
				// Parent : 모든 레이아웃의 부모
				Parent parent = 
						FXMLLoader.load(getClass().getResource("데이터베이스fx예제.fxml"));
																		//  /패키지명(폴더)/파일명.확장자
				// 6. 씬 객체 -> 컨테이너 
				Scene scene = new Scene(parent);
				// 7. 씬 -> 스테이지 
				stage.setScene(scene);
				stage.show(); // 1. 스테이지 열기 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
