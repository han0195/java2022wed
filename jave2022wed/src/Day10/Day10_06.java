package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_06 {
	// �ֱ����ġ : �޸� : RAM : ���α׷� ����ÿ��� ���� �޸�
	// ���������ġ : c����̺�, USB, CD : (���α׷�) ���� [��������]
	// ����ó�� [ console�� �޸𸮸� --> ���������ġ]
	// DBó�� [ �ڹٳ� �޸� ----> DB ����[PC] ]
		//��Ʈ��(Stream) : ���α׷��� �ܺ� ���
			// ��� ���� : byte
	// FileOutputStream : ������� Ŭ����
		// ��ü��.write( ����Ʈ�� );
	// FileInputStream : �����Է� Ŭ����
		// ��ü��.read( ����Ʈ�� );
	// String Ŭ����
		// ���ڿ�.equals() : ���ڿ� �� �޼ҵ�
		// ���ڿ�.getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		// new String( ����Ʈ�迭 ) : ����Ʈ�迭 -> ���ڿ� ��ȯ
	
	public static void main(String[] args) throws IOException{
		
		// 1.������� [ �ڹ� -> ���� ]
		FileOutputStream ������� = new FileOutputStream("C:/Users/504/Desktop/java.txt");
		//fileInputStream : ��������� Ŭ����
		//FileInputStream(���ϰ��/���ϸ�.Ȯ����); // txt : �޸���
		String ���� = "�ڹٿ��� �Էµ� ������";
		�������.write( ����.getBytes() ); // ����[����]
		
		// 2.�����Է� [ ���� -> �ڹ� ]
		FileInputStream �����Է� = new FileInputStream("C:/Users/504/Desktop/java.txt");
		byte[] bytes = new byte [1000];
		�����Է�.read( bytes );
		System.out.println("���ϳ��� : " + new String(bytes));
		
		
		
	}
}
