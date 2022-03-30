package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day21_2 extends Application{ // 1. Application 클래스로부터 상속
	@Override
	public void start(Stage stage) throws Exception { //2. start 메소드 오버라이딩
		// TODO Auto-generated method stub
		// 1. fxnk 파일 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("text.fxml"));
				//Parent : fxml파일(씬빌더파일)을 객체화 
				//FXMLLoader.load(getClass().getResource("경로/fxml파일명"));
		// 2. 씬 객체 생성
		Scene scene = new Scene(parent);
		// 3. 스테이지에 씬 넣기
		stage.setScene(scene);
		// 4. 스테이지 시작
		stage.show();
	}
	public static void main(String[] args) { // 3. 메인스레드 -> start메소드 호출
		launch(args);
	}
 
}
