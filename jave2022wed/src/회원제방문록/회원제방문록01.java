package 회원제방문록;

import java.util.Scanner;

public class 회원제방문록01 {
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
		// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
			// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
			// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
		// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ] => 방문록 출력(번호	작성자	제목	내용)
			// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] 회원 = new String[100][3];
		String[][] 게시판 = new String[100][3];
		
		
		while(true){
			System.out.println("--------------------방문록------------------");
			System.out.println("1.회원가입 2.로그인"); int ch = scan.nextInt();
			
			if(ch == 1) {
				System.out.println("--------------- 회원 가입 --------------");
				System.out.println("아이디: "); String id = scan.next();
				System.out.println("비밀번호: "); String pw = scan.next();
				System.out.println("이름: ");   String name = scan.next();
				
				//중복
				boolean 중복체크 = true;
				for(int i = 0; i < 회원.length; i++) {
					if(회원[i][0] != null && 회원[i][0].equals(id)) {
						System.out.println("아이디 중복");
						중복체크 = false;
					}						
				}
				
				if(중복체크) {
					for(int i = 0; i < 회원.length ; i++) {
						if(회원[i][0] == null) {
							회원[i][0] = id;
							회원[i][1] = pw;
							회원[i][2] = name;
							System.out.println("회원가입성공");
							break;
						}
					}
				}
				
				
			}else if(ch == 2){
				System.out.println("----------------- 로그인 ---------------");
				System.out.println("아이디: "); String id = scan.next();
				System.out.println("비밀번호: ");String pw = scan.next();
				
				boolean 로그인여부 = false;
				
				for(int i = 0; i < 회원.length; i++) {
					if(회원[i][0] != null && 회원[i][0].equals(id)) {
						if(회원[i][0] != null && 회원[i][1].equals(pw)) {
							System.out.println("로그인성공");
							로그인여부 = true;
							break;
						}
					}
				}
				
			
				while(로그인여부) {
					System.out.println("---------------------회원 메뉴------------------");
					System.out.println("번호\t제목\t내용\t작성자");
					for(int i = 0; i < 게시판.length; i++) {
						if(게시판[i][0] != null) {
							System.out.println(i+"\t"+게시판[i][0]+"\t"+게시판[i][1]+"\t"+게시판[i][2]);
						}
					}
					System.out.println("1. 방문록쓰기 2. 로그아웃"); int ch2 = scan.nextInt();
					
					if(ch2 == 1) {
						System.out.println("------ 글쓰기 ------");
						System.out.println("제목: "); String 제목 = scan.next();
						System.out.println("내용: "); String 내용 = scan.next();
						
						for(int i = 0; i < 게시판.length ; i++) {
							if(게시판[i][0] == null) {
								게시판[i][0] = 제목;
								게시판[i][1] = 내용;
								게시판[i][2] = id;
								break;
							}
						}
						
					}else if(ch2 == 2){
						break;
					}else {
						System.out.println("알수없는 행동입니다");
					}
					
					
				}
			}else {
				System.out.println("알수없는 행동");
			}
					
			
			
			
			
		}
		
		
		
		
	}

}
