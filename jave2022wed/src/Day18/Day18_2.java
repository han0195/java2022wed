package Day18;

import java.util.Vector;

public class Day18_2 {
	
	public static void main(String[] args) {
		
		// p.730
		// 		Arraylist vs Vector
		// ����ȭ 	x          o
		// ������		�̱۽�����(main)		��Ƽ������(Thread, Runnable)
		
		// Vector Ŭ����
		// 1. Vector ����Ʈ��ü ����
		Vector<Board> list = new Vector<>();
		// 2. ����Ʈ��ü�� �߰�
			//1. ������ ���ÿ� ����
		list.add(new Board("����1", "����1", "�ۼ���1"));
			//2. ������ ����
		Board board = new Board("����2", "����2", "����2");
		list.add(board);
		list.add(new Board("����3", "����3", "�ۼ���3"));
		list.add(new Board("����4", "����4", "�ۼ���4"));
		list.add(new Board("����5", "����5", "�ۼ���5"));
		list.add(new Board("����6", "����6", "�ۼ���6"));
		list.add(new Board("����7", "����7", "�ۼ���7"));
		System.out.println(" Ȯ��: " + list);
		//3. �˻�
		System.out.println(" ��ü �˻�: " + list.contains(board));
		System.out.println(" ��ü �˻� ��ġ: " + list.indexOf(board));
		
		//4. ����
		list.remove(2); System.out.println(" 2�� �ε��� ���� �� : " + list);
		list.remove(2); System.out.println(" 2�� �ε��� ���� �� : " + list);
		//* �ݺ����̿��� ����Ʈ��ü�� ��� ��ü ���
		for(int i = 0; i < list.size() ; i++) {
			Board temp = list.get(i); // i��° �ε����� ��ü ȣ��
			System.out.println(temp.����+"\t"+temp.����+"\t"+temp.�ۼ���);
		}
		// * �ݺ���2
		for(Board temp : list) {
			System.out.println(temp.����+"\t"+temp.����+"\t"+temp.�ۼ���);
		}
		
		
		
	}
	
}
