package 은행계좌프로그램;

public class 신한은행 extends 은행{
	//생성자
	public 신한은행(String 계좌번호, String 비밀번호, String 계좌주, int 예금액) {
		super(계좌번호, 비밀번호, 계좌주, 예금액);// 슈퍼클래스 생성자
	}
}
