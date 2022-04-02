package 도서검색프로그램;

import java.io.IOException;

public class 도서검색2 {
	public static void main(String[] args) throws IOException { // 13 : 52 // 1
	
		String[] books = {"타코야끼교본", "이것이자바다", "JavaFX정석"};
		
		while(true) { // 프로그램 시작
			System.out.println("**** 도서대여 프로그램 ****");
			System.out.println("1.검색 2.수정");
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes);
			String ch = new String(bytes, 0 , count - 2);
			
			if(ch.equals("1")) {
				System.out.println("검색");
				count = System.in.read(bytes);
				String str = new String(bytes, 0, count - 2);
				
				for(String temp : books) {
					if(temp.contains(str)) {
						System.out.println(temp);
					}
				}
			}else if(ch.equals("2")) {
				System.out.println("검색");
				count = System.in.read(bytes);
				String str = new String(bytes, 0, count - 2);
				int i = 0;
				for(String temp : books) {
					if(temp.contains(str)) {
						System.out.println( i +"\t"+temp);
						i++;
					}
				}
				System.out.println("수정할 인덱스");
				count = System.in.read(bytes);
				String index = new String(bytes, 0, count - 2);
				
				if(Integer.parseInt(index) < books.length) {				
					System.out.println("기존문자");
					count = System.in.read(bytes);
					String a = new String(bytes, 0, count - 2);
					System.out.println("새로운문자");
					count = System.in.read(bytes);
					String b = new String(bytes, 0, count - 2);
					books[Integer.parseInt(index)] = books[Integer.parseInt(index)].replace(a, b);
					System.out.println("변경완료");
					System.out.println(books[Integer.parseInt(index)]);
				}else {
					System.out.println("에러");
				}
			
			}
			
		}
		
	}
}
