package Day10;

public class Day10_02 {
	
	public static void main(String[] args) {
		
		//인터페이스 [ 추상메소드 ]
			//목적 : 동일하 목적하에 동일한 기능 수행
				// 서로 다른 클래스들간의 객체들을 동일한목적으로 조작
			// 추상 : 선언[o] 정의[x]
				// 인터페이스에서 선언하고 각 클래스들이 구현한다. [ 다형성 ]
			// 예) 인터페이스 : 방향키, A버튼, B버튼
			//		철권게임 클래스
					// A버튼 : 공격
					// B버튼 : 방어
			// 		축구게임 클래스
					// A버튼 : 슛
					// B버튼 : 방어
			
		// 1. 인터페이스 객체 선언
		RemoteContor rc;
		// 인터페이스명 객체명
		//2. 인터페이스에 텔리비전 메모리 할당
		rc = new Television();
		rc.turnOn(); // tv 실행
		rc.turnOff(); // tv 종료
		rc.setVolume(10); // tv 사운드
		
		rc = new Audio();
		rc.turnOn(); // tv 실행
		rc.turnOff(); // tv 종료
		rc.setVolume(10); // tv 사운드
		
		//** 익명구현객체 : 클래스없이 추상메소드 정의 ***
		RemoteContor rc2 = new RemoteContor() {
			
			@Override
			public void turnOn() {
				System.out.println("리모콘을 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("리모콘을 끕니다");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재불륨: " + volume);
				
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(10);
		
		// 디폴트 메소드 호출
		rc2.setMute(true); //인터페이스에서 이미 구현되어있는 메소드
		
		// 정적 메소드 호출
		RemoteContor.changeBattery();//객체없이
		
		//메모리 할당 받는 방법
			// 메모리 할당 해야되는 이유 : 필드(저장기능),메소드(저장기능) 사용시
				// 외부 클래스/인터페이스내 필드(저장기능), 메소드(저장기능) 사용시
			//1. new 연산
			//2. static 연산자
		
		
	}
	
}
