package �����˻����α׷�;

import java.io.IOException;

public class �����˻�2 {
	public static void main(String[] args) throws IOException { // 13 : 52 // 1
	
		String[] books = {"Ÿ�ھ߳�����", "�̰����ڹٴ�", "JavaFX����"};
		
		while(true) { // ���α׷� ����
			System.out.println("**** �����뿩 ���α׷� ****");
			System.out.println("1.�˻� 2.����");
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes);
			String ch = new String(bytes, 0 , count - 2);
			
			if(ch.equals("1")) {
				System.out.println("�˻�");
				count = System.in.read(bytes);
				String str = new String(bytes, 0, count - 2);
				
				for(String temp : books) {
					if(temp.contains(str)) {
						System.out.println(temp);
					}
				}
			}else if(ch.equals("2")) {
				System.out.println("�˻�");
				count = System.in.read(bytes);
				String str = new String(bytes, 0, count - 2);
				int i = 0;
				for(String temp : books) {
					if(temp.contains(str)) {
						System.out.println( i +"\t"+temp);
						i++;
					}
				}
				System.out.println("������ �ε���");
				count = System.in.read(bytes);
				String index = new String(bytes, 0, count - 2);
				
				if(Integer.parseInt(index) < books.length) {				
					System.out.println("��������");
					count = System.in.read(bytes);
					String a = new String(bytes, 0, count - 2);
					System.out.println("���ο��");
					count = System.in.read(bytes);
					String b = new String(bytes, 0, count - 2);
					books[Integer.parseInt(index)] = books[Integer.parseInt(index)].replace(a, b);
					System.out.println("����Ϸ�");
					System.out.println(books[Integer.parseInt(index)]);
				}else {
					System.out.println("����");
				}
			
			}
			
		}
		
	}
}
