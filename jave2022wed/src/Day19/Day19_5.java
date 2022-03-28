package Day19;

import java.util.TreeSet;

public class Day19_5 {
	public static void main(String[] args) {
	
		// p.753 : TreeSet Ŭ����
			// 1. �ϳ��� ��ü = ���
			// 2. �� ���� 2���� �ڽ� ��带 ������ �ִ�.
			// 3. �θ𺸴� ������ ���� �ڽ� / �θ𺸴� ũ�� ������ �ڽ�
			// 4. Ʈ���������� ���� ���ʿ� �ִ� ��尡 ������ ���� �������� ����ū��
			// 5. TreeSet< �����ڷ���Ŭ���� > :
			// 6. TreeSet< ���������Ŭ���� > :  
		// 1. treeset Ŭ������ ��ü ����
		TreeSet<Integer> scores = new TreeSet<>();
		// 2. treeset ��ü�� ��ü
		scores.add(87); System.out.println("Ȯ��: " + scores);
		scores.add(89);	System.out.println("Ȯ��: " + scores);
		scores.add(75);	System.out.println("Ȯ��: " + scores);
		scores.add(12);	System.out.println("Ȯ��: " + scores);
		scores.add(64);	System.out.println("Ȯ��: " + scores);
		scores.add(98);	System.out.println("Ȯ��: " + scores);
		// 3.
		
		System.out.println( scores.first() ); // ���� ���� ��� ȣ��
		System.out.println( scores.last() );  // ���� ������ ��� ȣ��
		System.out.println( scores.lower(64) ); // 64���� ���� ��� ȣ��
		System.out.println( scores.higher(12) ); // 12 ��庸�� ȣ�� 
		System.out.println( scores.floor(98) ); // 64���� ���� ���
		System.out.println( scores.ceiling(64)); // 64���� ������ ���
		// 4. ����
		System.out.println( scores.pollFirst()); // ���� ���ʳ�� ����
		System.out.println( scores.pollLast()); // ���� ������ ��� ����
		System.out.println("Ȯ��: " + scores); 
		// 5. �������� vs ��������
		// * �������� [�⺻��]
		System.out.println("�⺻[��������] : " + scores);
		// *�������� [ .descendingSet() : ��������]
		System.out.println("Ȯ��: " + scores.descendingSet()+"\n");
		
		// �������� �ϳ��� ���
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		System.out.println();
		// �������� �ϳ��� ���
		for(Integer temp : scores.descendingSet()) {
			System.out.println(temp);
		}
	}
}
