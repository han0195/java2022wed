package 회원제프로그램;

import java.util.Scanner;

import 엘베.Main;

public class 회원제프로그램 {

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
		
		Scanner s = new Scanner(System.in); //입력객체 선언
		Member[] mem = new Member[100]; // mem 배열
		
		while (true) {
			System.out.println("***** 회원제 프로그램 *****");
			System.out.println("1. 회원가입 2. 로그인 3.아이디찾기, 4. 비밀번호찾기"); int ch = s.nextInt(); // 선택입력받기
			
			if(ch == 1) {
				System.out.println("*** 회원가입 ***"); 
				System.out.println("아이디: "); 	String id = s.next(); //id 입력받기
				//중복체크
				boolean pass = true; // 통과여부
				for(Member temp : mem) {	// mem 배열 반복
					if(temp != null && temp.id.equals(id)) { // null이 아니고 id가 중복되면
						pass = false;	//불통과
						break;			// 빠져나오기
					}
				}		
				if(pass) {// 통과면 저장
					System.out.println("pw: ");		String pw = s.next(); /// pw 입력받기
					System.out.println("이름: ");		String name = s.next();	// 이름 입력받기
					System.out.println("폰번호: ");	String phone = s.next();	//전화번호 입력ㅂ다기
					Member t = new Member();	// 객체 생성	
					t.id = id;	//id 저장
					t.pw = pw;	// pw 저장
					t.name = name;	//이름 저장
					t.phone = phone;	// 전화번호 저장
					for(int i = 0; i < mem.length ; i++) { // 반복문돌리기
						if(mem[i] == null) {	// 널이면 저장
 							mem[i] = t;	// 객체배열의 객체 저장
 							System.out.println("회원가입성공");
 							break;	//저장했으면 빠져나오기
						}				
					}
				}else {
					System.out.println("아이디 중복"); 
				}			
			}else if(ch == 2){//로그인
				System.out.println("**** 로그인 ****");
				System.out.println("id: "); String id = s.next(); // id 입력받기
				System.out.println("pw: ");	String pw = s.next();	// pw 입력받기
				for(Member temp : mem) {	//for문 돌려 하나씩 빼기
					if(temp != null && temp.id.equals(id)) {	// 널이아니고 id 값이같으면
						if(temp != null && temp.pw.equals(pw)) {	// pw 같으면
							System.out.println("로그인성공");			
							break;	// 빠져나오기
						}
					}
				}
				
			}else if(ch == 3){// 아이디 찾기
				System.out.println("***** 아이디 찾기 *****");
				System.out.println("이름: "); String name = s.next(); //이름입력받기
				System.out.println("전화번호: ");	String pho = s.next();	// 폰입력받기
				
				for(Member temp : mem) { //mem 배열 뒤져보기
					if(temp != null && temp.name.equals(name)) { //이름 / 폰번호 같으면 아이디값 출력
						if(temp != null && temp.phone.equals(pho)) {
							System.out.println("아이디: " + temp.id);
							break;
						}
					}
				}
			}else if(ch == 4){// 비밀번호 찾기
				System.out.println("***** 비밀번호 찾기 *****"); 
				System.out.println("아이디: "); String id = s.next();
				System.out.println("전화번호: ");	String pho = s.next();
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						if(temp != null && temp.phone.equals(pho)) {// 아이디 폰 같으면 비밀번호 출력
							System.out.println("비밀번호: " + temp.pw);
							break;
						}
					}
				}
			}else {// 그외
				System.out.println("알수없는 행동");
			}
			
		}// 프로그래실행 end
		
		
		
	}// ms
	
}// cs
