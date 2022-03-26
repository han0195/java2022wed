package 인터페이스;

public class 스포츠카 implements 잍너{

	//1.필드
	private int 위치 = 0;
	private int 비용 = 0;
	
	
	public int get위치() {
		return 위치;
	}
	public void set위치(int 위치) {
		this.위치 = 위치;
	}
	public int get비용() {
		return 비용;
	}
	public void set비용(int 비용) {
		this.비용 = 비용;
	}
	
	
	@Override
	public void move() {
		위치 += 4;
		비용 += 5000;
	}
	
}
