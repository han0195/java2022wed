package 인터페이스예제;

import java.util.Random;

public class 캐릭터 {
	//1.필드
	private String name;
	private int 공격력;
	private int 방어력;
	//2.생성자
	public 캐릭터(String name, int 공격력, int 방어력) {
		super();
		this.name = name;
		this.공격력 = 공격력;
		this.방어력 = 방어력;
	}
	//3.메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int get공격력() {
		return 공격력;
	}
	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
	}
	public int get방어력() {
		return 방어력;
	}
	public void set방어력(int 방어력) {
		this.방어력 = 방어력;
	}
	public static 캐릭터 매칭() {
		Random random = new Random();
		int 공격력 = random.nextInt(40) + 1;
		int 방어력 = random.nextInt(150) + 1;
		캐릭터 com = new 캐릭터("com", 공격력, 방어력);
		return com;	
	}
	
	
}
