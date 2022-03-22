package 주차표;

import java.time.LocalDate;
import java.time.LocalTime;

public class car {
	//1.필드
	private String 차량번호;
	private LocalDate 입차날짜;
	private LocalTime 입차시간;
	private LocalTime 출차시간;
	private int 주차비용;
	//2. 생성자
	public car() { // 빈생성자
		// TODO Auto-generated constructor stub
	}
	public car(String 차량번호, LocalDate 입차날짜, LocalTime 입차시간, int 주차비용) {
		this.차량번호 = 차량번호;
		this.입차날짜 = 입차날짜;
		this.입차시간 = 입차시간;
		this.주차비용 = 주차비용;
	}
	//3.메소드
	public String get차량번호() {
		return 차량번호;
	}
	public void set차량번호(String 차량번호) {
		this.차량번호 = 차량번호;
	}
	public LocalDate get입차날짜() {
		return 입차날짜;
	}
	public void set입차날짜(LocalDate 입차날짜) {
		this.입차날짜 = 입차날짜;
	}
	public LocalTime get입차시간() {
		return 입차시간;
	}
	public void set입차시간(LocalTime 입차시간) {
		this.입차시간 = 입차시간;
	}
	public LocalTime get출차시간() {
		return 출차시간;
	}
	public void set출차시간(LocalTime 출차시간) {
		this.출차시간 = 출차시간;
	}
	public int get주차비용() {
		return 주차비용;
	}
	public void set주차비용(int 주차비용) {
		this.주차비용 = 주차비용;
	}
	
		
	
}
