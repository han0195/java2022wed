package 회원제프로그램;

import java.util.Scanner;

public class 회원제프로그램3 {
	// 회원제 프로그램 [ 클래스 버전 ]
	
				//0. 회원 설계 => 회원 클래스 만들기
					// 1. 설계
						// 1. 아이디 2. 비밀번호 3. 이름 4. 전화번호
				// 1. 초기메뉴 [1. 회원가입 2. 로그인 3.아이디찾기, 4. 비밀번호찾기]
					// 1. 회원가입시 입력받아 저장
					// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리
					// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
					// 4. 비밀번호찾기는 아이디와 전화번호 동일하면 비밀번호 출력
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Member[] mem = new Member[100];
		
		while (true) {
			System.out.println("*** ㅇ회원제 프로그램 ***");
			System.out.println("[1. 회원가입 2. 로그인 3.아이디찾기, 4. 비밀번호찾기]"); int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("****회원가입****");
				System.out.println("id: "); String id = s.next();
				boolean pass = true;
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						pass = false;
					}
				}
				if(pass) {
					System.out.println("pw: "); String pw = s.next();
					System.out.println("name: "); String name = s.next();
					System.out.println("phone: "); String phone = s.next();
					
					Member t = new Member();
					t.id = id;
					t.pw = pw;
					t.name = name;
					t.phone = phone;
					int i = 0;
					for(Member tmep : mem) {
						if(tmep == null) {
							mem[i] = t;
							System.out.println("회원가입성공");
							break;
						}
						i++;
					}
				}
				
				
				
			}else if(ch == 2) {
				System.out.println("로그인");
				System.out.println("id: "); String id =s.next();
				System.out.println("pw: ");	String pw = s.next();
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						if(temp != null && temp.pw.equals(pw)) {
							System.out.println("로그인성공");
							break;
						}
					}
				}
				
				
			}else if(ch == 3) {
				System.out.println("아이디 찾기");
				System.out.println("name: "); String name =s.next();
				System.out.println("phone: ");	String phone = s.next();
				for(Member temp : mem) {
					if(temp != null && temp.name.equals(name)) {
						if(temp != null && temp.phone.equals(phone)) {
							System.out.println("아이디: " + temp.id);
							break;
						}
					}
				}
				
			}else if(ch == 4) {
				System.out.println("비밀번호 찾기");
				System.out.println("id: "); String id =s.next();
				System.out.println("phone: ");	String phone = s.next();
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						if(temp != null && temp.phone.equals(phone)) {
							System.out.println("비밀번호: " + temp.pw);
							break;
						}
					}
				}
			}else {
				System.out.println("알수없는 행동");
			}
			
		}
		
		
		
		
	}
}
