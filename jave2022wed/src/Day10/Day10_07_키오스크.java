package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_07_Ű����ũ {
			//��� : ����
			//Ŭ���� : �Ե�����, ����ŷ
			//�������̽� : Ű����ũ
			//����ó�� : ��ǰ��� ����
	public static void main(String[] args) {
		
	
		//Ű����ũ �Ե����� = new �Ե�����(); // �Ե����� Ű����ũ ����
		Scanner scan = new Scanner(System.in); // �Է°�ü
		ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<��ǰ>();		
		
		// ��ǰ��� �о����
		//* ���� �Է�
		// 1. ���� �Է°�ü
		try { // try {} �ȿ� ����[����] �߻��ҰͰ��� �ڵ� �ֱ�(����)
			FileInputStream inputStream = new FileInputStream("C:/Users/504/Desktop/�Ե��������.txt");
			// 2. ���� �о���� [ ���� ---> ��Ʈ��(����Ʈ) ---> �ڹ� ]
			// 1. ����Ʈ�迭 ����
			byte[] bytes = new byte[1024];// bit -> byte -> kb
			// 2. �о�ͼ� ����Ʈ �迭 ����
			inputStream.read(bytes);
			// 3. [, : �ʵ� ���� \n : ��ü(��ǰ ����)]
			String ���ϳ��� = new String( bytes ); // ����Ʈ�� -> ���ڿ�
				// String ���� �޼ҵ� = split("����");
			String[] ��ǰ��� = ���ϳ���.split("\n");
			
			for(String temp : ��ǰ���) {
				String[] �ʵ��� = temp.split(",");
				��ǰ ��ǰ = new ��ǰ(�ʵ���[0], Integer.parseInt(�ʵ���[1]), Integer.parseInt(�ʵ���[2]));
								// ���ڿ� --> ������ ��ȯ [ Integer.parseInt] // �޾ƿ� ���� ������ ���ڿ��̱⶧���� ���������� ��ȯ
				// ����Ʈ ����
				��ǰ����Ʈ.add(��ǰ);
			}
				
			
		}catch(Exception e) {// ������ ������ �߻�ȭ�� {} ���� -> Exception Ŭ������ ��ü�� ����
			
		}
		
		Ű����ũ �Ե����� = new �Ե�����("���缮", ��ǰ����Ʈ);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		while(true) {//���α׷�����
			
			�Ե�����.��ǰ���();
			int ch = scan.nextInt();
			
			if(ch == -1) {
				�Ե�����.��ǰ�߰�();
			}else {
				�Ե�����.��ٱ���();
			}
			
		}
		
		
		
	}

}
