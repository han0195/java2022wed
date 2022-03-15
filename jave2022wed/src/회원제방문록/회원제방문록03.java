package 회원제방문록;

import java.util.Scanner;

public class 회원제방문록03 {
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
		// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
			// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
			// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
		// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ] => 방문록 출력(번호	작성자	제목	내용)
			// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] mem = new String[100][3];
		String[][] bor = new String[100][3];
		
		
		while(true) {
			System.out.println("--------방문록------");
			System.out.println("1. 회원가입 2.로그인"); int ch = scan.nextInt();
			
			if(ch == 1) {
				System.out.println("-------------회원가입--------------");
				System.out.println("id: "); String id = scan.next();
				System.out.println("pw: "); String pw = scan.next();
				System.out.println("name: "); String name = scan.next();
				
				boolean idck = true;
				for(int i=0; i < mem.length; i++) {
					if(mem[i][0] != null && mem[i][0].equals(id))  {
						System.out.println("아이디중복 실패");
						idck = false;
						break;
					}
				}
				
				if(idck) {
					for(int i =0; i < mem.length ; i++) {
						if(mem[i][0] == null) {
							mem[i][0] = id;
							mem[i][1] = pw;
							mem[i][2] = name;
							System.out.println("회원가입 성공");
							break;
						}
					}
				}
				
				
				
			}else if(ch == 2) {
				System.out.println("---------------로그인---------");
				System.out.println("id: "); String id = scan.next();
				System.out.println("pw: "); String pw = scan.next();
				
				boolean 로그인 = false;
				
				for(int i = 0 ; i < mem.length ; i++) {
					if(mem[i][0] != null && mem[i][0].equals(id)) {
						if(mem[i][0] != null && mem[i][1].equals(pw)) {
							로그인 = true;
							System.out.println("로그인성공");
							break;
						}
					}
				}
				
				
				while(로그인) {
					System.out.println("------회원 메뉴-------");
					System.out.println("번호\t제목\t내용\t작성자");
					for(int i = 0 ; i < bor.length ; i++) {
						if(bor[i][0] != null) {
							System.out.println(i +"\t"+ bor[i][0] +"\t"+ bor[i][1] +"\t"+ bor[i][2]);
						}
					}
					System.out.println("1. 방문록쓰기 2. 로그아웃 "); int ch2 = scan.nextInt();
					
					if(ch2 == 1) {
						System.out.println("--방문록쓰기--");
						System.out.println("제목: "); String tit = scan.next();
						System.out.println("내용: "); String con = scan.next();
						
						for(int i = 0; i < bor.length ; i++) {
							if(bor[i][0] == null) {
								bor[i][0] = tit;
								bor[i][1] = con;
								bor[i][2] = id;
								break;
							}
						}
						
					}else if(ch2 == 2) {
						break;
					}else {
						System.out.println("알수없는 행동입니다");
					}
					
					
				}
				
				
			}else {
				System.out.println("알수없는 행동입니다");
			}
			
			
			
			
		}
		
		

	}

}
