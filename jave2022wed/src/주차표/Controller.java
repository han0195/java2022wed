package ����ǥ;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	//�ʵ�
	static ArrayList<car> car = new ArrayList<car>();
	
	//�޼ҵ�
	public static boolean ����(String carnum) {
		//������ȣ �Է¹ޱ�
			//*������ȣ �ߺ�üũ
		for(car temp : Controller.car) {
			if(temp.get������ȣ().equals(carnum)) {
				return false;
			}
		}
		//������¥ ����
		LocalDate ��¥ = LocalDate.now();
		//�����ð� ����
		LocalTime �ð� = LocalTime.now();
		//��üȭ�� car list�� ������ true ����
		car car = new car(carnum, ��¥, �ð�, 0);
		Controller.car.add(car);
		return true;
	}
	
	public static boolean ����(String carnum) {
		//������ȣ �Է¹޾�
		//carlist�� �����ѹ� �ߺ�üũ�� �ߺ��Ȱ��� 
		int i = 0;
		for(car temp : Controller.car) {
			if(temp.get������ȣ().equals(carnum)) {
				//�����ð� ����
				LocalTime �����ð� = LocalTime.now();
				//��ݰ�� [���� 30�� �������� 10�д� 1000��][(�� - 30) / 10 * 1000]
				int �������� = (int) ChronoUnit.MINUTES.between(temp.get�����ð�(), �����ð�);
				int ������� = 0;
				if(�������� > 30) {
					������� = (�������� - 30) / 10 * 1000;
				}else {
					������� = 0;
				}
				// �����ð� ������� car list �� ����
				Controller.car.get(i).set�����ð�(�����ð�);
				Controller.car.get(i).set�������(�������);
				return true;
			}
			i++;
		}//f e
		return false;
	}
	
}
