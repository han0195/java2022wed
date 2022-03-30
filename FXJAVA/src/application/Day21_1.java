package application;

import java.awt.Button;

// javafx만 사용[ awt, swing ㄴ]
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
					// extends : 상속 [ Application : JAVAFX GUI 관련 클래스 ]
						// 상속받으면 슈퍼클래스내 멤버를 사용할수 있다.
	@Override
	public void start(Stage 스테이지) throws Exception {
		// javafx를 실행하는 메소드[ 추상 -> 구현 ]
			// Start (stage 스테이지 이름)
		
		//1. 컨테이너 만들기
		VBox box = new VBox();
			//2. 컨트롤만들기
			Button button = new Button();
		// 3. 컨테이너에 컨트롤 넣기
			box.getChildren().add(button);
		스테이지.show();
	}
	public static void main(String[] args) { // 메인 스레드 가지고 있는 메소드
		launch(args); // start 메소드 호출
		
	}
}
