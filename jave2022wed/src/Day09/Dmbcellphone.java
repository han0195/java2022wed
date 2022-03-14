package Day09;

public class Dmbcellphone extends callphone{
	// 서브클래스 슈퍼클래스 선택 => extends
		// 서브클래스가 슈퍼클래스내 멤버 사용가능
	
	// 1. 필드
	int channerl;
	// 2.생성자
	public Dmbcellphone(String modle, String color, int Channerl) {
		this.modle = modle; // this.필드명
		this.color = color;	// this.필드명
		// * 현재 클래스에 없는 필드 이므로 슈퍼클래스내 멤버 호출
		this.channerl = Channerl;
	}
	// 3.메소드
	void turnOnDmb() {
		System.out.println("채널: " + channerl + "번 DMB 방송 수신을 시작합니다");
	}
	void changeChannerlDMB(int channerl) {
		this.channerl = channerl;
		System.out.println("채널: " + channerl + "번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
