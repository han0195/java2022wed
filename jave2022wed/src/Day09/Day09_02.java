package Day09;

public class Day09_02 {

	public static void main(String[] args) {
		
		// 상속 
			// 부모에게 돌려받는것
			// 현실 : 부모 ----> 자식 // 프로그래밍 : 자식 ---> 부모 선택
			// extends : 연장하다[ 상속하다 ]
			// 목적 : 빠른 설계 [ 기존 있던 클래스를 연장해서 새로운 클래스 설계 ]
			// 부모클래스 1명만 가능
			// 
				
		// p.290~ 292 예제
		// 1. 서브클래스로 객체 생성
		Dmbcellphone dmbcellphone = new Dmbcellphone("자바폰", "검정", 10);
		
		// 2. 서브클래스로 만들어진 객체로 슈퍼클래스내 멤버접근
		System.out.println("모델: " + dmbcellphone.modle);
		System.out.println("생삭: " + dmbcellphone.color);
		
		// 3. 서브클래스로 만들어진 객체로 본인 멤버접근
		System.out.println("채널: " + dmbcellphone.channerl);
		
		// 4. 서브클래스로 만들어진 객체로 슈퍼클래내 멤버[메소드 접근]
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.send("여보세요");
		dmbcellphone.receive("안녕하세요! 저는 홍길동입니다");
		dmbcellphone.send("아 ~ 예 반갑니다");
		dmbcellphone.hangUp();
		
		//5.서브클래스로 만들어진 객체로 본인 멤버접근
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannerlDMB(12);
		dmbcellphone.turnOffDmb();

	}

}
