package Day07;

public class Car2 {
	
	//1.필드
	int speed;
	//2.생성자
		//생성자 없으면 기본생성자 추가
	//3.메소드
	
	//1. 현재 필드값을 반환해주는 메소드
	int getSpeed() { // 인수x 반환o
		return speed;
	}
	
	//2. 출력 메소드
	void keyTurnOn() { // 인수x 반환x
		System.out.println("키를 돌립니다.");
	}
	
	//3. 스피드 증가 메소드 [ 최대 50까지 10씩 증가 ]
	void run() { // 인수x 반환x
		for(int i = 10; i <= 50; i+= 10) {
			//* i 10~50까지 10씩 + 되면서 5번 반복
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "Km");
		}
	}
	
}
