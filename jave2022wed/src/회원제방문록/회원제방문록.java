package 회원제방문록;

import java.util.Scanner;

public class 회원제방문록 {
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
		// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
			// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
			// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
		// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ] => 방문록 출력(번호	작성자	제목	내용)
			// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//입력객체선언
		
		String[][] memberlist = new String[100][3]; // 멤버 2차원배열선언 [1]아이디 [2]비밀번호 [3]이름
		String[][] boardlist = new String[100][3];  // 방문록 2차원배열선언[1]제목 [2]내용 [3]글쓴이
		
		while (true) {//프로그램실행 무한루프
			System.out.println("-----------회원제-----------");
			System.out.println("1.회원가입 2.로그인"); int ch = scan.nextInt();
			
			if(ch == 1) {
				System.out.println("-------------------회원가입-----------------");
				System.out.println("아이디를 입력해주세요: "); String id = scan.next(); // id 입력받기
				System.out.println("비밀번호를 입력해주세요: "); String pw = scan.next(); // pw 입력받기
				System.out.println("이름을 입력해주세요: ");	String name = scan.next(); // 이름 입력받기
				boolean idcheck = true; // 아이디 중복체크 
				// id 중복체크
				for(int i = 0; i < boardlist.length; i++) { // boardlist 길이만큼 반복
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) { // id 같이 동일한것을 찾았으면
						System.out.println("아이디가 중복되었습니다");
						idcheck = false;				// 아이디체크 false
						break;							// 반복문 빠져나오기
					}
				}//for end
				
				if(idcheck) { // id = true 라면
					for(int i = 0; i < memberlist.length; i++) { // // boardlist 길이만큼 반복
						if(memberlist[i][0] == null) {	// null이 아니라면
							memberlist[i][0] = id; // i 인덱스 0값에 저장
							memberlist[i][1] = pw; // i 인덱스 1값에 저장
							memberlist[i][2] = name; // i 인덱스 2값에 저장
							System.out.println("회원가입 성공!!!!");
							break;// 성공하면 빠져나오기
						}
						i++;// null이 없으면 반복
					}// null 찾는 for end
				}// if end															
				
			}else if(ch == 2){
				System.out.println("---------------로그인----------------");
				System.out.println("아이디: "); String id = scan.next(); // id 입력받기
				System.out.println("비밀번호: "); String pw = scan.next();// pw 입력받기
				boolean 로그인체크 = false; // 로그인 성공여부
				for(int i = 0; i < memberlist.length; i++) {// 배열길이만큼 반복
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) { // 아이디가 동일하면
						if(memberlist[i][0] != null && memberlist[i][1].equals(pw)) {//비밀번호가 동일하면
							로그인체크 = true; //로그인 체크 true
							System.out.println("로그인 성공");
							break; // 성공이면 빠져나오기
						}
					}
				} // for end
				
				if(로그인체크 == false) {
					System.out.println("로그인실패");
				}
				
				while(로그인체크){
					System.out.println("-----------------------회원 메뉴------------------------");
					
					//방문록 출력
					System.out.println("번호\t제목\t내용\t작성자");
					for(int i = 0; i < boardlist.length; i++) { // boardlist 길이만큼 반복
						if(boardlist[i][0] != null) {	// null 이 아니라면
							System.out.println(i +"\t"+ boardlist[i][0] +"\t"+ boardlist[i][1] +"\t"+ boardlist[i][2]); // 방문록 출력
						}
					}
					System.out.println("1.방문록쓰기 2.로그아웃"); 
					int ch2 = scan.nextInt(); // 선택 입력받기
					
					if(ch2 == 1) {
						System.out.println("----------------글쓰기------------------");
						System.out.println("제목: "); String 제목 = scan.next(); //제목입력받기
						System.out.println("내용: "); String 내용 = scan.next(); // 내용입력받기
						
						for(int i = 0; i < boardlist.length; i++) { // boar길이만큼 반복
							if(boardlist[i][0] == null) { //null 이라면
								boardlist[i][0] = 제목; // 제목값넣기
								boardlist[i][1] = 내용;	// 내용값넣기
								boardlist[i][2] = id;	// id값넣기
								System.out.println("작성완료");
								break; // 저장완료되면 반복문 빠져나오기
							}
						}
						
						
					}else if(ch2 == 2) { // 2번 선택했으면
						break; // 회원 메뉴 빠져나오기
					}
					
				}
				
				
				
				
			}else {// 그외
				System.out.println("알수없는 행동");
			}
			
		}
 		
		
	}//me
}//cs
