package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_01 {
	public static void main(String[] args) throws IOException {
		
		// ����Ʈ -> ���� ��ȯ ���� �̤�
			//1. ����Ʈ -> +-127 ǥ�� ����
			//2. �ƽ�Ű�ڵ� => 0 or 1 ���յ� 7�ڸ� => 0101011
			// ����Ʈ -> �ƽ�Ű�ڵ� ��ȯ [����/Ư������ 1����Ʈ, �ѱ� 2����Ʈ]
			
			//���� : 0 or 1
			//7�ڸ� ���� : �ƽ�Ű�ڵ� [ 1000001 => A ]
		
		// p497 ��1
		//1. ������ ����Ʈ�� �����Ҽ� �ִ� ����Ʈ �迭 ����
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		//2. ����Ʈ �迭 -> ���ڿ� ��ȯ
		String str1 = new String(bytes);
		//3. Ȯ��
		System.out.println("����Ʈ�迭 -> ���ڿ� ��ȯ : " + str1);
		
		//4. Ư�� ��ġ���� ��ȯ [new String(�迭��, �����ε���, ����)]
		String str2 = new String(bytes, 6 ,4);
		//5. Ȯ��
		System.out.println("����Ʈ�迭�� 6���ε������� 4�� ��ȯ : " + str2);
		
		//p.498 ����2
			// System.out : �ý���Ŭ������ ����ʵ�
			// System.in : �ý���Ŭ������ �Է��ʵ�
		byte[] bytes2 = new byte[100]; // 100�� ����Ʈ�� �����Ҽ� �ִ� �迭
		
		System.out.println("�Է�: "); // ����ʵ峻 print�޼ҵ� ȣ��
		int readByteNo = System.in.read( bytes2 );
			// �ܺ���� : �ڹ����α׷��� [ Ű����, ����, ��Ʈ��ũ �� ] ����� �Ϲݿ���
		
		//Ű���� �Է� ---��Ʈ��[���:����Ʈ]--> ��ǻ��
		
		System.out.println("�Է¹��� ����Ʈ: " + Arrays.toString(bytes2));
		String str = new String( bytes2 );
		System.out.println("�Է¹��� ����Ʈ -> ���ڿ� ��ȯ: " + str);
		
		
			//Sccanner Ŭ���� [ System.in ���κ��� �Է¹��� ����Ʈ�� ��ü�� ���� ]
		Scanner scanner = new Scanner(System.in);
			//
		scanner.next();
		scanner.nextInt();
		scanner.nextDouble();
		
		
	}
	
}
