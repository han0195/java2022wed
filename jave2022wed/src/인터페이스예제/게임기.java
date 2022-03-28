package 인터페이스예제;

import java.util.Scanner;

public class 게임기 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {// 프로그램실행
			System.out.println("텍스트결투게임");
			조이스틱 조이스틱 = new 텍스트결투();
			System.out.println("1.캐릭터생성 2.준비중");
			int ch = s.nextInt();

			if (ch == 1) {
				System.out.println("name: ");
				String name = s.next();
				캐릭터 my = new 캐릭터(name, 10, 50);
				while (true) {
					int 승리수 = 0;
					System.out.println("----- 현재나의 캐릭터 ------");
					System.out.println("공격력: " + my.get공격력() + "\t" + "방어력: " + my.get방어력());
					System.out.println("나의승리수: " + 승리수); // ?? 승리수가 안오름
					System.out.println("1.대결상대 찾기 2.성장");
					int ch2 = s.nextInt();
					if (ch2 == 1) {	
							캐릭터 com = 캐릭터.매칭();	
							System.out.println("--- 매칭 ---");
							while (true) {
							System.out.println("상대스펙");
							System.out.println("공격력: " + com.get공격력() + "\t" + "방어력: " + com.get방어력());
							System.out.println("조이스틱 : 1.공격 2.럭키공격 3.도망");
							int ch3 = s.nextInt();
							if (ch3 == 1) {
								int a = 조이스틱.A버튼(my, com);
								System.out.println(a);
								if (a == 1) {
									System.out.println("승리");
									승리수++; // 승리수안올름
									break;
								} else if (a == 2) {
									System.out.println("사망");
									System.out.println("1.캐릭터생성 2.준비중");
									int ch4 = s.nextInt();

									if (ch4 == 1) {
										System.out.println("name: ");
										String name3 = s.next();
										my = new 캐릭터(name, 10, 30);
										break;
									}
								}
							} else if (ch3 == 2) {
								int a = 조이스틱.B버튼(my, com);
								System.out.println(a);
								if (a == 1) {
									System.out.println("승리");
									승리수++;
									break;
								} else if (a == 2) {
									System.out.println("사망");
									System.out.println("1.캐릭터생성 2.준비중");
									int ch4 = s.nextInt();

									if (ch == 1) {
										System.out.println("name: ");
										String name3 = s.next();
										my = new 캐릭터(name, 10, 30);
										break;
									}
								}
							} else if (ch3 == 3) {
								조이스틱.C버튼(my, com);
								break;
							} else {
								System.out.println("알수없는 선택");
							}
						}
					} else if (ch2 == 2) {
						System.out.println("준비중");
					} else {
						System.out.println("알수없는 선택");
					}

				}
			} else if (ch == 2) {
				System.out.println("추후업데이트예정");
			} else {
				System.out.println("알수없는 선택");
			}

		}

	}
}
