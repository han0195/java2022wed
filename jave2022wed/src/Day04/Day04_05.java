package Day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day04_05 {

	public static void main(String[] args) {
		// �غ�
				int[] ����ڹ�ȣ = new int[6]; // ����ڰ� ������ ��ȣ ��� 
				int[] ��÷��ȣ = new int[6];	// ��ǻ�Ͱ� ���� ��ȣ ���
				Scanner scanner = new Scanner(System.in);
				
				// 1. ����ڿ��� �Է¹ޱ� 
				for( int i = 0 ; i<6 ; i++ ) {
					// i�� 0���� 5���� 1�������ݺ� => 6ȸ�ݺ�
					System.out.print(" 1~45 ���� �Է� : ");
					int ��ȣ = scanner.nextInt();
					
					boolean ��� = true; // ���� �Ǵ� ���� ����
					
					// ����1 : ��ȿ���˻� 
					if( ��ȣ < 1 || ��ȣ > 45 ) { // 1���� �۰ų� 45���� ũ�� �����Ҽ� ���� ��ȣ�Է½� ���Է� 
						System.out.println(" �˸�)) �����Ҽ� ���� ��ȣ �Դϴ�.[���Է�] ");
						i--; // ���� i�� �����Է�x
						��� = false; // ���� x 
					}// if end 
					
					// ����2 : �ߺ�üũ 
						// 1. �迭�� ��� �ε��� ȣ��
					for( int j = 0 ; j<6 ; j++ ) {
						if( ��ȣ == ����ڹ�ȣ[j] ) {
							System.out.println(" �˸�)) �̹� ������ ��ȣ �Դϴ�.[���Է�]");
							i--; // ���� i�� �����Է�x
							��� = false; // ����x
						} // if end 
					} // for2 end 
					// �����Է�[����� true] �̸� �迭�� �����ϱ� 
					if( ��� == true) ����ڹ�ȣ[i] = ��ȣ;
					
				} // for end 
				
				System.out.print("\n����ڰ� ������ ��ȣ : ");
				// * ����� �迭�� ��� �ε��� ��� 
				for( int temp : ����ڹ�ȣ ) {
					System.out.print( temp +"\t");
				}
				
				
				// 2. ��ǻ�Ͱ� �������� 
				for(int i = 0; i < 6; i++) {
					Random random = new Random(); // 1. ������ü
					int ��÷ = random.nextInt(45) + 1; // 2. ������ int������ ��������
												// random.nextInt() : +- 20�� ������ ���� �߻�
												// random.nextInt(��) : 0~�� ������ ������ 
												// random.nextInt(��)+���۹�ȣ : ���۹�ȣ ~ �� ����
					//����1. �ߺ�üũ
					boolean ��� = true;
					for( int temp : ��÷��ȣ ) {
						if( ��÷ == temp ) { // �ߺ��� ��츦 ã����
							i--; // �ߺ��� ������� ���� i
							��� = false; // ���� x
						}
					}
					
					if (���) ��÷��ȣ[i] = ��÷;
						
					} //for e
					
				System.out.print("\n\t��÷ ��ȣ : ");
				// * ����� �迭�� ��� �ε��� ��� 
				for( int temp : ��÷��ȣ ) {
					System.out.print( temp +"\t");
				}
				
				
				// 3. �� = �� �迭�� ������ �� ã��
				int count = 0;
				for(int i = 0; i < ����ڹ�ȣ.length; i++) { 	
					for(int j = 0; j < ��÷��ȣ.length; j++) { //[i] �ϳ��� ����ε����� ���ϱ����� ��øfor��
						if(����ڹ�ȣ[i] == ��÷��ȣ[j]) {
							count++;							
						}// if e	
					}// f2 e
				}// f1 e
				
				// ���2
				for(int �񱳱��� : ����ڹ�ȣ) {
					// ����ڹ�ȣ �迭�� �ϳ��� �񱳱��� ����
					for(int �񱳴�� : ��÷��ȣ) {
						// ��÷��ȣ �迭�� �ϳ��� �񱳴�� ����
						if(�񱳱��� == �񱳴��) count++;
					}
				}
				
				System.out.println("\n\t  ��������: " + count);
	
	}// m e

}// c e
