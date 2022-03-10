package Day07;

public class Day07_04 {
	//p.229 : 외부호출
	public static void main(String[] args) {
		
		//1. 객체선언
		Car2 car2 = new Car2();
		//2. 자동차 시동걸기
		car2.keyTurnOn();
		//3. 자동차 전직
		car2.run();
		//4. 현재 스피드 확인 메소드 호출0
		int speed = car2.speed;
		System.out.println("현재속도: " + speed + "km");
		
		
	}// me
}// ce
