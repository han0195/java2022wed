package ����ǥ;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class park {

	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			while (true) {
				System.out.println("----------------------------- ���� ��Ȳǥ ---------------------------------");
				//���� ���
				System.out.println("\t\t    " + LocalDate.now() +" "+ LocalTime.now().getHour()+":"+LocalTime.now().getMinute());
				System.out.println("��¥\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");		
				for(car temp : Controller.car) { // �����ð� null �̸� ������ ��� + �����ð����� �ݾ� ������ ���
					if(temp.get�����ð�() == null) {
						//��¥
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");// ��� ����Ұ���
						String ��¥ = temp.get������¥().format(formatter);	// formatter ���Ǵ�� ��¥ ���
						DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
						String �����ð� = temp.get�����ð�().format(formatter2);
						System.out.println(��¥ +"\t"+ temp.get������ȣ() +"\t\t"+ �����ð� +"\t\t"+ "������" +"\t\t"+ "������");
					}else {
						DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
						String �����ð� = temp.get�����ð�().format(formatter2);
						String �����ð� = temp.get�����ð�().format(formatter2);
						System.out.println(temp.get������¥() +"\t"+ temp.get������ȣ() +"\t\t"+ �����ð� +"\t\t"+ �����ð� +"\t\t"+ temp.get�������());
					}
				}
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t1.���� 2.����"); int ch = s.nextInt();
				 
				if(ch == 1) {
					//����
					System.out.println("������ȣ: "); String carnum = s.next();
					boolean pass = Controller.����(carnum); // ����ȣ �ѱ��
					if(pass) { // ��������
						System.out.println("��������");
					}else {// ��������
						System.out.println("��������");
					}
				}else if(ch == 2) {
					//����
					System.out.println("������ȣ: "); String carnum = s.next();
					boolean pass = Controller.����(carnum);
					if(pass) { // ��������
						System.out.println("��������");
					}else {// ��������
						System.out.println("��������");
					}
				}else {
					System.out.println("�߸��� ����");
				}

				
			}// we
		} catch (Exception e) {
			System.out.println("����)) ������ ����" + e);
		}
		
		
		
	}// me
}// ce
