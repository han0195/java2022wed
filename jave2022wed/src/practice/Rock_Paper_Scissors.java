package practice;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {// ����Ƚ��: 1 | �ð�: x
	// ���������� ����				  
	// ����(0) ����(1) ��(2)	����(3) 
	// �÷��̾� �Է¹ޱ�
	// ��ǻ���� ������ ���� �ޱ�
	// ��
	// �ǵ�
	// ���
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);	// �Է� ��ü ����
		int player_win = 0;
		int computer_win = 0;
		int count = 0;
		
		while(true) {
			System.out.println("-----------------------------����������---------------------------------");
			System.out.println("����(0), ����(1), ��(2)   ����(3)");
			System.out.println("����>>>>");
			int player = scanner.nextInt();	// �÷��̾� �Է¹޾� int�� ����
			
			Random random = new Random();	// ���� ��ü ����
			int computer = random.nextInt(4);	// 0~3 ������ ���� �޾ƿ���
			System.out.println(computer);
			
			if(player >= 0 && player < 3) { // �÷���
				if(player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1) { // �÷��̾ �̰�����
					System.out.println("�¸�");
					System.out.printf("�÷��̾�: %d\n",player);
					player_win++;
				}else if(player == computer){ // ���º�
					System.out.println("���º�");
					System.out.printf("�÷��̾�: %d\n",player);
				}else {	// ��ǻ�Ͱ� �̰�����
					System.out.println("�й�");
					System.out.printf("�÷��̾�: %d\n",player);
					computer_win++;
				}
				count++;
			}else if(player == 3){// ����
				System.out.println("--------------------------------------------------------------");
				System.out.println("��������");
				System.out.printf("�� ���� Ƚ��: %d\n", count);
				if(player_win > computer) {System.out.println("�÷��̾� �¸�");}//�÷��̾� �¸�
				else if(player_win < computer) {System.out.println("��ǻ�� �¸�");}//��ǻ�� �¸�
				else {System.out.println("���º�");} // ���º�
				break;
 			} 
			
			
			}

		
		
		
		
		
		
		
		
	} //m e

} //c e 
