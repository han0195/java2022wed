package �����˻����α׷�;

import java.util.Random;
import java.util.Scanner;

public class ������ȣ�й����α׷�2 {
	// ������ȣ �й� ���α׷�
	// ���� 
		// 1. ���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ���� 
		// 2. ��� ���� ��ȣ�� �迭�� ���� 
		// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
		// 4. ���� ��¥���� ��ȣ�� Ȧ�� ���� �迭�� ����  
		// 5. ���� ��¥���� ��ȣ�� ¦�� ���� �迭�� ���� 
		// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
public static void main(String[] args) { // 9 : 12
		
		Scanner s = new Scanner(System.in);
		String[] carnum = new String[10];
		String[] evencar = new String[10];
		String[] oddcar = new String[10];
		Random random = new Random();
		
		while(true) {
			System.out.println("��â���� ���� ��ȣ");
			for(String temp : carnum) {
				if(temp != null) {
					System.out.print(temp+"\t");
				}
			}
			System.out.println("\n�������� ¦�� ��ȣ");
			for(String temp : evencar) {
				if(temp != null) {
					System.out.print(temp+"\t");
				}
			}
			System.out.println("\n�������� Ȧ�� ��ȣ");
			for(String temp : oddcar) {
				if(temp != null) {
					System.out.print(temp+"\t");
				}
			}
			System.out.println("\n1.����"); int ch = s.nextInt();
			if(ch == 1) {
				String carstr = String.format("%04d", random.nextInt(10000)+1);
				boolean pass = false; 
				for(int i = 0 ; i < carnum.length ; i++) {
					if( carnum[i] == null) { 
						carnum[i] = carstr; 
						pass = true;		
						break;				
					}
				}
				if(pass) {
					for(int i = 0; i < carnum.length ; i++) {
						if(Integer.parseInt(carstr) % 2 == 0 && evencar[i] == null) {
							evencar[i] = carstr;
							break;
						}else if(oddcar[i] == null){
							oddcar[i] = carstr;
							break;
						}			
					}
				}else {
					System.out.println("****����****");
				}
			}else {
				System.out.println("�˼�����");
			}
		}
		
		
		
	}
}