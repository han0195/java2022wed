package �ζ��Ǻ���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {//2

	public static void main(String[] args) {
	
		int[] ����ڹ�ȣ = new int[6];// ����ڹ�ȣ ������ int �迭
		int[] ��÷��ȣ = new int[6]; // ��÷��ȣ ������ int �迭
		
		Scanner scan = new Scanner(System.in); // �Է°�ü ����
		Random random = new Random(); // �������� ��ü ����
		
		while (true) { // ���α׷�����
			System.out.println("-----------------------�ζ�--------------------------");
			System.out.println("1.�ζ� ��ȣ�Է� 2.��÷ 3.����");
			System.out.println("�Է�>> ");	int ch = scan.nextInt();
			
			if(ch == 1) { // 1�� ���ý�
				for(int i = 0; i < ����ڹ�ȣ.length ; i++) {// 6�� �ݺ��Ͽ� ����ڹ�ȣ �迭�� ����
					System.out.println((i + 1) + "��° ��ȣ�Է�: "); int temp = scan.nextInt(); //i��° ��ȣ �Է¹ޱ�
					boolean ��� = true; //��� ����Ȯ��
					if(temp >= 1 && temp <= 45) {//��ȿ���˻� 1 ~ 45
						for(int j = 0; j < ����ڹ�ȣ.length; j++) {// �ߺ����� �ݺ���
							if(temp == ����ڹ�ȣ[j]) { // ���࿡ ���ٸ�
								System.out.println("��ȣ�� �ߺ��˴ϴ�");
								��� = false; // ���� x
								i--; //�ݺ��߰�
								break; // ���ٸ� �ٷ� ����������;
							}
						}// �ߺ����� for end
						if(��� = true) {
							����ڹ�ȣ[i] = temp;
						}			
					}else {
						System.out.println("����) 1~45������ �Է����ּ���");
						i--; // �ݺ��ѹ���
					}// if e
				
				}
				
				
			}else if(ch == 2){ // 2�����ý�
				
				for(int i = 0; i < ��÷��ȣ.length; i++) {//���� �ֱ�
					boolean ��� = true; // ��� ����
					int temp = random.nextInt(45) + 1;// ���� �����Ͽ� temp ���� ����
					
					for(int temp2 : ��÷��ȣ) {// �ߺ��˻�
						if(temp == temp2) { // �ߺ��ȴٸ�
							��� = false;
							i--; // �ݺ��߰�
							break;
						}
					}
					
					if(��� == true) {// ����� true ���
						��÷��ȣ[i] = temp; // ����
					}
				}
				
				//��
				System.out.println("-----------���-------------");
				int ���䰳�� = 0; // ���䰳�� �����Һ���
				for(int temp : ����ڹ�ȣ) { // ����� ��ȣ �ϳ��� ����
					for(int temp2 : ��÷��ȣ) { // ��÷��ȣ�� ��
						if(temp == temp2) {// ������
							���䰳��++; // ���䰳�� ++
						}
					}
				}
				System.out.println("���䰳��: " + ���䰳��);
				System.out.println("���ù�ȣ: " + Arrays.toString(����ڹ�ȣ));
				System.out.println("��÷��ȣ: " + Arrays.toString(��÷��ȣ));
				
				
				
				
			}else if(ch == 3){ // 3�����ý�
				System.out.println("����");
				break;// ���α׷� ����������
			}else {// �׿�
				System.out.println("�˼����� �ൿ�Դϴ�");
			}
			
			
		}//���α׷����� end
		
		

	}//me

}//ce
