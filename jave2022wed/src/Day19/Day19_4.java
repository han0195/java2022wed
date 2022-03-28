package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {
	public static void main(String[] args) {
		
		// p.747
		// 1.Hashtable Ŭ���� ��ü ����
		Hashtable<String, String> map = new Hashtable<>();
		// 2. map ��ü�� �߰�
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�: "); String id = s.next();
			System.out.println("��й�ȣ: "); String pw = s.next();
			
			// ���࿡ map ��ü�� �ش� key �� �����ϸ� [.contatins(Ű) : map��ü�� �ش� Ű�� �����ϸ� true / �ƴϸ� false]
			if(map.containsKey(id)) {// ���࿡ �Է���id�� map ��ü�� �����ϸ�
				if(map.get(id).equals(pw)) {
					// ���࿡ key �̿��� �� ȣ�� �Է��� �н������ �����ϸ�
					System.out.println("�α��� �Ǿ����ϴ�.");
				}else {
					System.out.println("�Է��Ͻ� ��й�ȣ�� ��ġ�����ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
			
		}// while end
		
	}
}