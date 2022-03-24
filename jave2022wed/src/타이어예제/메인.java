package 타이어예제;

import java.util.Scanner;

public class 메인 {
	public static void main(String[] args) {
		
		원정대 원정대 = new 원정대();
		int 사망수 = 0; // 사망자
		int hp1 = 10; // 전사hp
		int hp2 = 10; // 힐러hp
		int hp3 = 10; // 궁수hp
		int lv = 6;   // 전사레벨
		int lv1 = 6;  // 힐러레벨
		int lv2 = 6;  // 궁수레벨
		Scanner s = new Scanner(System.in);
		System.out.println("적HP: ");
		int hp = s.nextInt();
		
		for(int i = 0; i < hp ; i++) {
			int 사망 = 원정대.사냥시작();
			switch (사망) {
			case 1:
				System.out.println("새로운 전사투입");
				원정대.선봉 = new 전사(hp1, lv);
				hp1 += 3;
				lv++;
				사망수++;
				break;
			case 2:
				System.out.println("새로운 힐러투입");
				원정대.서포터 = new 힐러(hp2, lv1);
				hp2 += 2;
				lv1++;
				사망수++;
				break;
			case 3:
				System.out.println("새로운 궁수투입");
				원정대.딜러 = new 궁수(hp3, lv2);
				hp3 += 1;
				lv2++;
				사망수++;
				break;	
			}
		}
		System.out.println("토벌종료 => 적 Hp: " + hp +" | " + "사망자수: " + 사망수);
	}	
}
