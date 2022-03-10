package Day07;

import java.util.Scanner;

public class Member {

	// 1.필드
	int mno;	// 회원번호 [ 자동번호, 중복x ]
	String id;	// 아이디 [ 중복x ]
	String pw;	// 비밀번호
	String name;	// 이름
	String phone;	// 연락처
	// 2.생성자 [ 생성자명 == 클래스명 ]
		// 1. 빈생성자[기본생성자]
	public Member( ) {}
		// 2. 모든 필드를 받는 생성자
	public Member(int mno, String id, String pw, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	// 3.메소드
	
	
	boolean 회원가입() {// 1. 회원가입 메소드 [ 인수 x 반환 x]  가입성공 true : false;
		System.out.println("------------------ 회원가입 페이지 ------------------");
		//1. 입력받기
		System.out.println("아이디를 입력: ");  String id = Day07_05Application.scanner.next();
		// * 아이디 중복체크
				for( Member temp : Day07_05Application.members ) {
					if(temp != null && temp.id.equals(id)) {
						// 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
						System.out.println("에러 현재 사용중인 아이디 입니다");
						return false;
					}
				}
		System.out.println("비밀번호를 입력: "); String pw = Day07_05Application.scanner.next();
		System.out.println("이름 입력: "); 	String name = Day07_05Application.scanner.next();
		System.out.println("전화번호 입력: ");	String phone = Day07_05Application.scanner.next();
		
		// * 회원번호 자동주입 [ 가장최근의 회원번호 + 1 ]
		int bno = 0; // 회원번호 저장하는 변수
		int j = 0;	// 반복횟수
		for( Member temp : Day07_05Application.members) {
			
			if (temp == null) { //null 찾기 [ null 찾았을때 null -1 하면 마지막 회원]
				if( j == 0 ) {	//첫번째 인덱스[0번 인덱스]가 null => 첫회원 => 첫회원번호 = 1부여
					bno = 1; // 첫번째 인덱스가 null => 첫회원번호 = 1 부여
					break;
				}
				bno = Day07_05Application.members[j - 1].mno + 1;
					  ///////////마지막회원 찾는거///////////그 회원의 mno 번호의 +1 
											//null 앞 [ 마지막회원 ]번호에 +1 
				break;
			}
			j++;
		}
		
		
		//2. 4개변수 -> 객체화 -> 4개
		Member member = new Member(bno, id, pw, name, phone); // 모든 필드 받는 생성자로 객체생성
		//3. 배열내 빈공간을 찾아서 새로운 회원 객체 넣기
		int i = 0;  
		for(Member temp : Day07_05Application.members) {
			if(temp == null) {
				Day07_05Application.members[i] = member;
				System.out.println("회원님의 회원번호는: " + bno);
				return true; // 성공시 메소드 종료
			}
			i++;
		}// 중복체크 for문 end
		return false; // 실패시 종료
	}// 회원가입 메소드 end
		
	
	
	String 로그인() {// 2. 로그인 메소드 [ 인수x 반환o] 성공시 아이디반환 실패시 null
		System.out.println("------------------ 로그인 페이지 ------------------");
		System.out.println("아이디: ");	String id = Day07_05Application.scanner.next();
		System.out.println("비밀번호: ");	String pw = Day07_05Application.scanner.next();
		for(Member temp : Day07_05Application.members) {
			if(temp !=null && temp.id.equals(id)) {// 일반회원 로그인
				return temp.id; //**1. 여기서 id 값을주고
			}
		}// for end
		return null;
	
	}// 로그인 end
		
	
	
	
	void 아이디찾기() {// 3. 아이디 찾기 메소드
		System.out.println("------------------ 아이디찾기 페이지 ------------------");
		System.out.println("이름: ");  	String name = Day07_05Application.scanner.next();
		System.out.println("전화번호: "); 	String phone = Day07_05Application.scanner.next();
		int i = 0; // 반복횟수
		for( Member temp : Day07_05Application.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {// 이름 전화번호가 동일할때 
				System.out.println("당신의 아이디: " + temp.id);
				return;
			}
		}// for end
		System.out.println("회원이 존재하지않습니다");
		
	}// 아이디찾기 end
		
	
	
	
	void 비밀번호찾기() {// 4. 비밀번호찾기 메소드
		System.out.println("------------------ 비밀번호찾기 페이지 ------------------");
		System.out.println("아이디: ");  	String id = Day07_05Application.scanner.next();
		System.out.println("전화번호: "); 	String phone = Day07_05Application.scanner.next();
		int i = 0; // 반복횟수
		for( Member temp : Day07_05Application.members) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {// 이름 전화번호가 동일할때 
				System.out.println("당신의 비밀번호: " + temp.pw);
				return;
			}
		}// for end
		System.out.println("회원이 존재하지않습니다");
		
	}// 비밀번호찾기 end
		// 5. 회원탈퇴 메소드
		// 6. 회원수정 메소드
}
