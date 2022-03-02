package Day01;

import java.util.Scanner;

public class Day01_06 {
	public static void main(String[] args) {
		//문제2
		Scanner cann = new Scanner(System.in);
		
		//입력객체 가져오기 - > String 클래스에 저장
		System.out.println("작성자: ");	String Myname = cann.next();
		System.out.println("내용: ");	String mamo = cann.next();
		System.out.println("날짜: ");	String date = cann.next();
				
				//출력
		System.out.println("* --------------방문록--------------");
		System.out.println("* |순번| 작성자 |내용\t|  날짜  |");
		System.out.println("* | 1 | " + Myname +  " | " + mamo + " | " + date + " |");
		System.out.println("* ---------------------------------");
	}
}
