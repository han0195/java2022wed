package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	// set �ߺ��Ұ���
		// ��ü�� ��� �ʵ尡 �����ϸ� �ߺ��Ұ���
	
	public static void main(String[] args) {
		
		// �ζ� ���α׷�
			// set �÷���
		
		Scanner s = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>(); // set �÷��� HachSet Ŭ���� ��ü ����
		
		while(true) {// ���ѷ��� [ ��������: set��ü�� ��ü���� 6�̸� break]
			System.out.println("1~45 ���� ����(�ߺ��Ұ�) : ");
			int num = s.nextInt();
			
			if(num < 1 || num > 45) {// 1 ~ 45 ���̰� �ƴϸ�
				System.out.println("�����Ҽ����� ��ȣ");
			}else {
				set.add(num);	// ����
				System.out.println("Ȯ��: " + set);
			}
			if(set.size() == 6) {break;}// 6���� ��ȣ�� ����Ǹ�
			
			
		}//w e
	}
}
