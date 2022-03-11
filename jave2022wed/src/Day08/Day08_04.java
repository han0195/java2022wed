package Day08;

public class Day08_04 {

	//p.267~268 : Setter , Getter 메소드
		//필드는 private 사용되는 경우가 많다
		//외부에서 필드에 접근할수 없다
		//목적: 외부에서 필드에 직접접근 제한하고 메소드를 통한 필드 접근
		//Setter 메소드 : 필드 데이터 변경
		//Getter 메소드 : 필드 데이터 호출
	
	public static void main(String[] args) {
		
		//1. 객체생성
		Car car = new Car();
		//2. 객체내 메소드 호출
		car.setSpeed(-50);
		//3.
		System.out.println("현재속도: " + car.getSpeed());
		//4.
		car.setSpeed(60);
		System.out.println("현재속도: " + car.getSpeed());
		
		if(!car.isStop()) { // 정지상태가 아니면
			// ! : 부정연산자
			car.setStop(true);
		}
		System.out.println("현재속도: " + car.getSpeed());
	}
	
}
