package Day15;

import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
	
	private LocalDate ��¥;
	private String ������ȣ;
	private LocalTime �����ð�;
	private LocalTime �����ð�;
	private int �ݾ�;
	
	//������
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(LocalDate ��¥, String ������ȣ, LocalTime �����ð�, LocalTime �����ð�, int �ݾ�) {
		super();
		this.��¥ = ��¥;
		this.������ȣ = ������ȣ;
		this.�����ð� = �����ð�;
		this.�����ð� = �����ð�;
		this.�ݾ� = �ݾ�;
	}
	//�޼ҵ�

	public LocalDate get��¥() {
		return ��¥;
	}

	public void set��¥(LocalDate ��¥) {
		this.��¥ = ��¥;
	}

	public String get������ȣ() {
		return ������ȣ;
	}

	public void set������ȣ(String ������ȣ) {
		this.������ȣ = ������ȣ;
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

	public int get�ݾ�() {
		return �ݾ�;
	}

	public void set�ݾ�(int �ݾ�) {
		this.�ݾ� = �ݾ�;
	}
	
}