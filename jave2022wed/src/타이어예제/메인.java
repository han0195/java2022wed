package 타이어예제;

import java.util.Scanner;

public class 메인 {
	public static void main(String[] args) {
		
		원정대 원정대 = new 원정대();
		
		Scanner s = new Scanner(System.in);
		System.out.println("다구리횟수: ");
		int hit = s.nextInt();
		for(int i = 0; i < hit ; i++) {
			int 사망 = 원정대.사냥시작();
			switch (사망) {
			case 1:
				System.out.println("새로운 전사투입");
				원정대.선봉 = new 전사(50, 15);
				break;
			case 2:
				System.out.println("새로운 힐러투입");
				break;
			case 3:
				System.out.println("새로운 궁수투입");
				break;
			}
		}
		
		
	}	
}
