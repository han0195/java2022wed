package 인터페이스;

import java.util.Scanner;

public class 메인 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		인터페이스 car1 = new 낡은차(8, 0);// 다향성
		인터페이스 car2 = new 평범한차(10, 0);
		인터페이스 car3 = new 비싼차(12, 0);
		
		while(true) {
			System.out.println("1.move"); int ch = s.nextInt();
			
			if(ch == 1) {
				car1.move();
				car2.move();
				car3.move();
			}else {
				System.out.println("알수없는행동");
			}
		}
	}
	
}
