package Day07;

public class Car {
	// 클래스선언
	
	// 1. 필드
	int gas; // 가스변수
	
	// 2. 생성자
		// 생성자 없으면 기본생성자
	
	// 3. 메소드
		//1. gas를 외부로부터 받아서 내부에 gas 저장하는 메소드 역활
	void setGas(int gas) { // 인수o반환x
	// 리턴x 메소명(인수 1) {내부변수 = 외부변수}
		this.gas = gas;
	// 내부변수와 외부변와 이름이 동일할때 구별하는 방법!!!!
		//this.필드명 : 내부(현클래스파일)변수;
	}
		//2. 내부변수 gas에 데이터 확인 [ 0 = 가스없다 ] [ 1이상 = 가스있다]
	boolean isLeftGas() { // 인수x 반환0
	// 논리반환 메소명() {}
		if( gas == 0 ) {
			System.out.println("gas가 없습니다");
			return false;
		}else {
			System.out.println("gas가 있습니다");
			return true;
		}			
	}
	void run() { // 인수x 반환x [ 종료: 1.break 2.return 3.스위치변수]
		while( true ) {
			if( gas > 0 ) {
			System.out.println("달립니다. (gas: " + gas);
			gas--;
			}else {
				System.out.println("멈춤니다. (gas: " + gas);
				return;
			}
			
		}
	}
	
}
