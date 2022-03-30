package 개인과제키오스크파일처리;

public class 장바구니 {
	//1. 필드
	private String 제품명;
	private int 수량;
	//2. 생성자
	public 장바구니() {
		// TODO Auto-generated constructor stub
	}
	public 장바구니(String 제품명, int 수량) {
		super();
		this.제품명 = 제품명;
		this.수량 = 수량;
	}
	//3. 메소드
	public String get제품명() {
		return 제품명;
	}
	public void set제품명(String 제품명) {
		this.제품명 = 제품명;
	}
	public int get수량() {
		return 수량;
	}
	public void set수량(int 수량) {
		this.수량 = 수량;
	}
	
}
