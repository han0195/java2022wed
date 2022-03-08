package Day06;

import java.util.Scanner;

public class Day06_03 {

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
		
		// 위에 선언하는 이유 : 지역변수되서 소멸 방지
		Scanner scanner = new Scanner(System.in);
		Member[] memberslist = new Member[100];
		// Member 클래스로 만들어진 객체(id, pw, name, phone) 100개 저장할수 있는 배열 선언
		
		
		
		while(true) {
			System.out.println("-------------------------------- 회원제[ 클래스 버전 ]----------------------------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			System.out.println("선택: "); int ch = scanner.nextInt();
			
			if( ch == 1) {
				// 1. id, password, name, phone 입력받기 => 변수4개
				System.out.println("----------------------------회원가입 페이지-------------------------------");
				System.out.println("id를 입력해주세요: "); String id = scanner.next();
				System.out.println("password 입력해주세요: "); String pw = scanner.next();
				System.out.println("이름: "); String name = scanner.next();
				System.out.println("연락처: "); String phone = scanner.next();
				// 2. 객체 생성
				Member member = new Member();
				
				// 3. 입력받은 변수 4개를 객체내 필드에 저장하기
				member.id = id;
				member.password = pw;
				member.name = name;
				member.phone = phone;
				
				// * 아이디 중복체크
					// 1. 배열내 객체중 입력한 아이디와 동일한 아이디 찾기
				boolean idcheck = false;
				for( Member temp : memberslist) {
					// * memberlist 배열내 객체들을 하나씩 temp에 대입 반복
					if( temp != null && temp.id.equals(id))	{
						// 만약에 해당 객체내 id 가 입력받은 id와 같으면
						System.out.println("알림)) 사용중인 아이디 입니다");
						idcheck = true; // 중복이면 true;
						break;
					}
				}
				
				// 4. 여러개 객체를 저장하는 배열에 저장
				// 아이디가 중복이 없을경우 저장
				if(idcheck == false) {
					int i = 0;
					for( Member temp : memberslist) {
						// * memberlist 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복
						// 2. 공백에 인덱스에 저장하기
						if( temp == null )  {// 1. 공백인덱스 찾기[ 공백이 아니면 기존회원이 존재 ]
							memberslist[i] = member; // 해당 인덱스에 새로 만들어진 객체 저장
							System.out.println("회원가입 성공");
							break; // for 나기기 [ 안나가면 모든 공백에 동일한 객체 저장되기 때문에 ]
						}
						i++; // 인덱스 증가
					} // for 문 and
				}// 아이디 체크 여부 확인 if
				
				
					
				
				
			} // 회원가입 end
			else if(ch == 2) { // 로그인
				
				//1. 입력받기
				System.out.println("-----------------------------로그인 페이지--------------------------------------");
				System.out.println("아이디: ");	String loginid = scanner.next();
				System.out.println("비밀번호: ");	String loginpw = scanner.next();
				
				// 2. 기본 배열 [회원 리스트 ] 내 입력받은 값과 비교
				boolean logincheck = false; // true : 로그인성공	false: 로그인실패 으로 사용될 목적
				for( Member temp : memberslist) {
					// * memberslist내 0번 인덱스부터 끝 인덱스까지 하나씩 temp에 대입
					if( temp != null &&temp.id.equals(loginid) && temp.password.equals(loginpw)) {
						System.out.println("로그인 성공");
						logincheck = true; // 로그인 성공했다는 표시 남기기
						break;
					}
				}
				
				//로그인 성공여부
				if(logincheck == false) {
					System.out.println("알림)) 동일한 회원정보가 없습니다.");
				}
				
			} // 로그인 end
			else if(ch == 3) {// 아이디 찾기
				// 1. 이름 과 연락처를 입력받는다.
				System.out.println("-------------------------------아이디찾기 페이지--------------------------------------");
				System.out.println("이름을 입력해주세요: ");		String name = scanner.next();
				System.out.println("연락처를 입력해주세요: ");		String phone = scanner.next();
				// 2. 배열내 동일한 이름과 연락처가 있는지 확인한다.
				boolean findid = false; // 아이디를 찾았는지
				for (Member temp : memberslist) {
					if(temp != null && temp.name.equals(name) && temp.name.equals(phone)) {
						System.out.println("알림)) 아이디 찾기 성공");
						// 3. 동일한 객체가 있으면 해당 아이디 출력
						System.out.println("회원님의 아이디:" + temp.id);
						findid = true;
						break;
					}
				}
				// 4. 없으면 없다고 출력
				if(findid == false) {
					System.out.println("알림)) 아이디를 찾지못했습니다. [ 찾기실패 ]");
				}
				
				
			} // 아이디 찾기 end
			else if(ch == 4) {// 비밀번호찾기
				System.out.println("------------------------비밀번호 찾기 페이지-------------------------------");
				System.out.println("아이디: "); String id = scanner.next();
				System.out.println("전화번호: "); String phone = scanner.next();
				boolean findpw = false;
				for(Member temp : memberslist) {
					if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.out.println("알림)) 비밀번호 찾기 성공");
						System.out.println("회원님의 비밀번호: " + temp.password);
						findpw = true;
						break;
					}
				}
				
				if(findpw == false) {
					System.out.println("알림)) 비밀번호를 찾지못했습니다. [ 찾기실패 ]");
				}
			} // 비밀번호 찾기 end
			else { System.out.println("알림)) 알수없는 번호입니다"); } // 그외 end
			
		}//  프로그램 실행 while end
		
		
		
	}// m e
}// c e
