package Day09;

public class HankookTire extends Tire{
		// 서브클래스 extends 슈퍼클래스
	
	//1.필드
	
	//2.생성자
	public HankookTire (String location, int maxRotation) {
		super(location, maxRotation);
		//super (인수 인수2) // 슈퍼클래스내 [인수2개]생성자 호출
	}
	
	//3.메소드 오버로딩을 통해 부모의 roll()을 재정의 즉 덮어쓴거다
	@Override // 슈퍼클래스내 메소드를 재정의[수정]
	public boolean roll() {
		accumulatedRotaion++;
		if(accumulatedRotaion < maxRotaion) {
			System.out.println(location + "한국타이어 수명: " + (maxRotaion - accumulatedRotaion));
			return true;
		}else {
			System.out.println("****" + location + "한국타이어 [펑크]****" );
			return false;
		}
	}
	//상속받은거
//	// 1.필드
//		public int maxRotaion; // 최대 회전수[ 회전가능수 ]
//		public int accumulatedRotaion; // 누적 회전수
//		public String location; // 타이어 위치
//		
//		// 2.생성자
//		public Tire(String location, int maxRotaion) {
//				//타이어위치 , 최대회전수
//			this.location = location; 		// 외부로부터 전달받은 인수를 내부변수에 대입
//			this.maxRotaion = maxRotaion;	// 
//		}
//		// 3.메소드
//		public  boolean roll() { // 타이어 회전하는 메소드 구현
//			accumulatedRotaion++; // 누적 회전수 1 증가 // 타이어가 회전함
//			if(accumulatedRotaion < maxRotaion) {
//				// 만약에 누적회전수가 최대회전수보다 작으면 [수명 남음]
//				System.out.println(location + "Tire 수명: " + (maxRotaion - accumulatedRotaion) + "회" );
//				return true;
//			}else { // 아니면 [ 수명 없다 ]
//				System.out.println("****" + location + "Tire 펑크 ****");
//				return false;
//			}
//			
//		}
	
	
	
}
