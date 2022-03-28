package 인터페이스예제;

import java.util.Scanner;

public class 게임기 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {// 프로그램실행
			System.out.println("텍스트결투게임");
			조이스틱 조이스틱 = new 텍스트결투();
			System.out.println("1.캐릭터생성 2.준비중"); int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("name: "); String name = s.next();
				캐릭터 my = new 캐릭터(name, 10, 10);
				while(true) {
					System.out.println("----- 현재나의 캐릭터 ------");
					System.out.println("공격력: "+ my.get공격력() +"\t"+"방어력: " + my.get방어력());
					System.out.println("1.대결상대 찾기 2.성장"); int ch2 = s.nextInt();
					if(ch2 == 1) {
						System.out.println("--- 매칭 ---");
						캐릭터 com = 캐릭터.매칭();
						System.out.println("상대스펙");
						System.out.println("공격력: "+ com.get공격력() +"\t"+"방어력: " + com.get방어력());
						while(true) {
							System.out.println("조이스틱 : 1.공격 2.럭키공격 3.도망"); int ch3 = s.nextInt();
							if(ch3 == 1) {
								조이스틱.A버튼(my, com);
							}else if(ch3 == 2) {
								
							}else if(ch3 == 3) {
								
							}
							else {	
								System.out.println("알수없는 선택");
							}
						}	
					}else if(ch2 == 2) {
						
					}else {
						System.out.println("알수없는 선택");
					}
				}
			}else if(ch == 2) {
				System.out.println("추후업데이트예정");
			}else {
				System.out.println("알수없는 선택");
			}
			
			
		}
		
		
	}
}
