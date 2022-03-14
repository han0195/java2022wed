package Day09;

public class Day09_05 {
	public static void main(String[] args) {
		
		//1. 객체 생성 [ 자동차 1대 생성 ]
		Car mycar = new Car();
			// 클래스내 타이어객체가 4개 -> mycar 포함
		// 2. 메소드 호출
		for(int i = 1; i <= 5; i++) {
			int problemLocation = mycar.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어 교체");
				mycar.frontLeftTire = new HankookTire("앞왼쪽", 15);
				// mycar.frontLeftTire = new Tire 이라서 부모 즉[Tire = HankookTire]
				// [부모 = 자식] 이라서 가능 한것 /자식 = 부모였으면 불가능
				// 슈퍼클래스 객체명 = new 서브클래스();
				// 상속을 받으면 가능 !!!!!!!!
				Object object = new Tire("asd", 13);
				break;
			case 2:
				System.out.println("앞오른쪼 금호타이어 교체");
				mycar.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
				
			case 3:
				System.out.println("뒤왼쪽 한국타이어 교체");
				mycar.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
				
			case 4:
				System.out.println("뒤오른쪽 금호타이어 교체");
				mycar.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			
			}
			System.out.println("--------------------------------------------------");
		}
		
	
		
	}//me
}//ce
