package �ζ��Ǻ���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto05 {
	//���� 1.����ڹ�ȣ[] 2,��÷��ȣ[]
			//���α׷�����
				//1.�ζ� ��ȣ�Է� 2.��÷ 3.����
					//1.��ȿ�� �˻�
						// �ߺ��˻�
				
				//��÷
					//1.����
					//2.�ߺ�üũ
					//���
	public static void main(String[] args) {
		
		int[] ����ڹ�ȣ = new int[6];
		int[] ��÷��ȣ = new int[6];
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("------------------------�ζ�--------------------------");
			System.out.println("1.�ζ� ��ȣ�Է� 2.��÷ 3.����");
			System.out.println("����>> "); int ch = scan.nextInt();
			
			if(ch == 1) {
				for(int i = 0; i < ����ڹ�ȣ.length; i++) {
					System.out.println((i + 1) + "���� ��ȣ�� �Է��ϼ���"); int temp = scan.nextInt();
					boolean ��� = true;
					if(temp >= 1 && temp <= 45){						
						for(int temp2 : ����ڹ�ȣ) {
							if(temp2 == temp) {
								System.out.println("�ߺ�");
								��� = false;
								break;
							}
						}
					}else {
						System.out.println("����)) 1~45���� �Է����ּ���");
						i--;
					}
					
					
					if(���) {
						����ڹ�ȣ[i] = temp;
					}else {
						i--;
					}
					
				}
			}else if(ch == 2) {
				for(int i = 0; i < ��÷��ȣ.length; i++) {
					boolean ��� = true;
					int temp = random.nextInt(45) + 1;
					
					for(int temp2 : ��÷��ȣ) {
						if(temp == temp2) {
							��� = false;
							break;
						}
					}
					
					if(���) {
						��÷��ȣ[i] = temp;
					}else {
						i--;
					}
					
				}
				
				
				int �������� = 0;
				for(int temp : ����ڹ�ȣ) {
					for(int temp2 : ��÷��ȣ) {
						if(temp == temp2){
							��������++;
						}
					}
				}
				
				
				
				System.out.println("---------------���---------------");
				System.out.println("��������: " + ��������);
				System.out.println("���ù�ȣ: " + Arrays.toString(����ڹ�ȣ));
				System.out.println("��÷��ȣ: " + Arrays.toString(��÷��ȣ));
				
				
			}else if(ch == 3) {
				System.out.println("����");
				break;
			}else {
				System.out.println("�˼����� �ൿ�Դϴ�");
			}
			
			
			
		}
 
	}

}
