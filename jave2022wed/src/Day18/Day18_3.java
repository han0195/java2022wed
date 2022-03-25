package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {
	
	//p.731~732 : LinkedList Ŭ����
	// 				ArrayList 		vs		LinkedList
	// 		   			�迭			vs 			��ũ
	// ���α������� 	�ε����������ο���	vs		���� �ٸ� �޸��ּ� ����
	// �ӵ�					
	// add[�߰�]			����
	// add[����=�߰�] 							����
	// �˻�				����
	// ����										����
	public static void main(String[] args) {
		// 1. Arraylist ��ü ���� [ ���׸� : String ]
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList ��ü ���� [ ���׸� : String ]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. �ð�����
		long startime; // ���� �ð�
		long endtime;  // ������ �ð�
		
		// 4. arraylist��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��½ð� üũ
			startime = System.nanoTime();
			for(int i = 0; i < 10000 ; i++) {
				list1.add(0, i+""); // ���� -> ���ڿ� ��ȯ : 1. String.valueOf(����) 2.����+""
									// ���ڿ� -> �μ� ��ȯ Integer.parseInt(��ȯ)
			}
				endtime = System.nanoTime();
			System.out.println("Arraylist �� 10000�� �����ϴ� �ɸ��� �ð�: " + (endtime - startime) + "ns");
			
			// 4. arraylist��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��½ð� üũ
					startime = System.nanoTime();
					for(int i = 0; i < 10000 ; i++) {
						list2.add(0, i+""); // ���� -> ���ڿ� ��ȯ : 1. String.valueOf(����) 2.����+""
											// ���ڿ� -> �μ� ��ȯ Integer.parseInt(��ȯ)
					}
						endtime = System.nanoTime();
					System.out.println("Linklist �� 10000�� �����ϴ� �ɸ��� �ð�: " + (endtime - startime) + "ns");
	}
}
