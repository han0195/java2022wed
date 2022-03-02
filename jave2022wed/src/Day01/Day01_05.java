package Day01;

import java.util.Scanner;

public class Day01_05 {

	public static void main(String[] args) {
		//입력객체 선어
		Scanner san = new Scanner(System.in);
		
		//입력객체 가져오기 - > String 클래스에 저장
		System.out.println("이름: ");		String id = san.next();
		System.out.println("아이디: ");		String pw = san.next();
		System.out.println("비밀번호: ");		String name = san.next();
		System.out.println("이메일: ");		String m = san.next();
		
		//출력
		System.out.println(">>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>");
		System.out.println("아이디\t\t비밀번호\t\t성명\t\t이메일");
		System.out.println(name + "\t\t" + id + "\t\t"  + pw + "\t\t" + m);
	
		
	}

}
