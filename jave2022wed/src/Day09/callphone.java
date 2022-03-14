package Day09;

public class callphone {
	//1.필드
	String modle;
	String color;
	//2.생성자
	
	//3.메소드 [ void : 반환타입없다 ( return 생략가능 ) ]
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 반환타임 메소드면(인수) { 실행코드 } // 반환x 인수 x
	void powerOff() {System.out.println("전원을 끕니다");}
	void bell() {System.out.println("벨이 울립니다");}
	void send(String message) {System.out.println("자기: " + message);}
	//반환x 메소드명(인수o) { } // 반환x 인수o
	void receive(String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊습니다");}
}
