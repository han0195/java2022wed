package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Day13_04 {

	public static void main(String[] args) {
		
		// p.544 DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
			// ���� ����
				// 0 : �ڸ��� [ ���ڸ��� 0���� ä�� ]
				// # : �ڸ��� [ ���ڸ��� ä��� ]
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// ***** õ���� ���� ��ǥ *****
		df = new DecimalFormat("#,##0��");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0"); // E : ��������
		System.out.println( df.format(num));
		
		df = new DecimalFormat("+#,### ; -#.###" ); // ��� ; ����
		System.out.println( df.format(num) );
		
		//p.544 : DecimlFormat Ŭ���� : ���� ���� ��ȯ
		//p.545 : SimpleDateFormat Ŭ���� : ��¥ ���� ��ȯ
		//p.547	: MessageFormat Ŭ���� : ���� ���� ��ȯ
		
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID: {0}\nȸ�� �̸�: {1}\nȸ�� ��ȭ: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println( result1 );
		
		// *** �����ͺ��̽����� ����� ���� ***
		//String sql = "insert info member values";
		
		
				
		
		
	}
}
