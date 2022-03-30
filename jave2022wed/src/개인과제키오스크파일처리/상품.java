package 개인과제키오스크파일처리;

public class 상품 {
	//필드
	private String name; // 이름
	private String 점포; // 파일처리시 연결시킬것
	private int price; // 가격
	private int 재고;
	//생성자
	public 상품() {
		// TODO Auto-generated constructor stub
	}
	public 상품(String name, String 점포, int price, int 재고) {
		super();
		this.name = name;
		this.점포 = 점포;
		this.price = price;
		this.재고 = 재고;
	}
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String get점포() {
		return 점포;
	}
	public void set점포(String 점포) {
		this.점포 = 점포;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int get재고() {
		return 재고;
	}
	public void set재고(int 재고) {
		this.재고 = 재고;
	}
}
