package �ζ��Ǻ���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottos {

	public static void main(String[] args) {
		
		int[] ����ڹ�ȣ = new int[6]; // ����ڹ�ȣ �����ų �迭 ����
		int[] ��÷��ȣ = new int[6];	//��÷��ȣ �����ų �迭����
		
		Scanner scan = new Scanner(System.in); // �Է°�ü����
		Random random = new Random();//������ü ����
		
		while(true) {// ���α׷����� [���ѹݺ�]
			System.out.println("------------------- �ζ� --------------------");
			System.out.println("1.�ζǻ�� 2.��÷ 3.����");
			System.out.println("����>> ");	int ch = scan.nextInt(); // �����Է¹ޱ�
			
			if(ch == 1) {// ������ 1�̸�
				for(int i = 0; i < ����ڹ�ȣ.length; i++) {//6�� ��ȣ �޾ƿ��� for�� ����
					System.out.println((i + 1) + "��° ��ȣ�� �Է����ּ���");	int temp = scan.nextInt(); // ��ȣ�Է¹޾� �ӽ÷�����
					boolean ��� = true;// ���ǵ��� �������
					if(temp >= 1 && temp <= 45) {		//��ȿ���˻�				
						for(int temp2 : ����ڹ�ȣ) {		//�ߺ��˻縦 ���� ����ڹ�ȣ temp2 �ӽú����� ����
							if(temp == temp2) {			// ��
								System.out.println("�ߺ�"); 
								��� = false;				// ���ٸ� ��� false;
								break;					// �ݺ��� ����������
							}
						}//for end
					}else {//��ȿ���˻縦 �����������
						System.out.println("����)) �˼����� ��ȣ");
						��� = false; // ������� false
					}
					
					if(��� == true) {// ���ǵ��� true���
						����ڹ�ȣ[i] = temp; //����
					}else {//�ƴ϶��
						i--;// �ݺ�Ƚ�� �߰�
					}
					
					
				}
				
				
			}else if(ch == 2) {// ������ 2���
				//���� 6�� 
				for(int i = 0; i < ��÷��ȣ.length; i++) {// ��÷��ȣ���̸�ŭ �ݺ�
					boolean ��� = true;	//�����������
					int temp = random.nextInt(45) + 1; //��������
					for(int temp2 : ��÷��ȣ) { // �ߺ��˻�
						if(temp == temp2) {		//���ٸ�
							��� = false;			// ��� false;
						}
					}//�ߺ��˻� end
					
					if(���) { // ����� true���
						��÷��ȣ[i] = temp; //����
					}else {// �ƴ϶��
						i--; //�ݺ�Ƚ�� �߰�
					}
					
				}
				
				
				int �������� = 0; // �������� �����Һ��� 
				for(int temp : ����ڹ�ȣ) { // ����ڹ�ȣ �ϳ��� �ӽú����� ����
					for(int tmep2 : ��÷��ȣ) {// ��÷��ȣ �ϳ��� �ӽú����� ����
						if(temp == tmep2) { // ����ڹ�ȣ �ӽú������� ��÷��ȣ �ӽú��� �� ���ٸ�
						��������++;	//�������� ++
						}
					}
				}//�� for �� end
				
				System.out.println("-----------���-------------");
				System.out.println("��������: " + ��������); // �������� ���
				System.out.println("���ù�ȣ: " + Arrays.toString(����ڹ�ȣ)); // ����ڹ�ȣ �迭 ���
				System.out.println("��÷��ȣ: " + Arrays.toString(��÷��ȣ));	//��÷��ȣ �迭���
				
			}else if(ch == 3) {// ������ 3�̶��
				System.out.println("����");
				break;//���α׷� while �� ����������
			}else {//�׿�
				System.out.println("�˼����� �ൿ");
			}
			
			
			
		}// ���α׷����� end
		
		
		

	}//me
}//cs
