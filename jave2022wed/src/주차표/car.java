package ����ǥ;

import java.time.LocalDate;
import java.time.LocalTime;

public class car {
	//1.�ʵ�
	private String ������ȣ;
	private LocalDate ������¥;
	private LocalTime �����ð�;
	private LocalTime �����ð�;
	private int �������;
	//2. ������
	public car() { // �������
		// TODO Auto-generated constructor stub
	}
	public car(String ������ȣ, LocalDate ������¥, LocalTime �����ð�, int �������) {
		this.������ȣ = ������ȣ;
		this.������¥ = ������¥;
		this.�����ð� = �����ð�;
		this.������� = �������;
	}
	//3.�޼ҵ�
	public String get������ȣ() {
		return ������ȣ;
	}
	public void set������ȣ(String ������ȣ) {
		this.������ȣ = ������ȣ;
	}
	public LocalDate get������¥() {
		return ������¥;
	}
	public void set������¥(LocalDate ������¥) {
		this.������¥ = ������¥;
	}
	public LocalTime get�����ð�() {
		return �����ð�;
	}
	public void set�����ð�(LocalTime �����ð�) {
		this.�����ð� = �����ð�;
	}
	public LocalTime get�����ð�() {
		return �����ð�;
	}
	public void set�����ð�(LocalTime �����ð�) {
		this.�����ð� = �����ð�;
	}
	public int get�������() {
		return �������;
	}
	public void set�������(int �������) {
		this.������� = �������;
	}
	
		
	
}
