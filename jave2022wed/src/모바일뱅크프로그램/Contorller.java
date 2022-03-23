package 모바일뱅크프로그램;

import java.util.ArrayList;
import java.util.Random;

public class Contorller {
	static int 번호 = 1;
	static ArrayList<Member> member = new ArrayList<Member>(); // Member list 선언
	static ArrayList<은행> bank = new ArrayList<은행>();		   // Bank list 선언
	static ArrayList<대출> didank = new ArrayList<대출>();		// 대출 list 선언
	public static boolean 회원가입(String id, String pw, String name, String phone) {	
		//id pw name phone 받아오기
		//id 중복체크
		for(Member temp : Contorller.member) {
			if(temp.getId().equals(id)) { // id 같이 일치하면
				return false;					// 메소드 종료 false 반환
			}
		}
		//객체화후 저장	
		Contorller.member.add(new Member(id, pw, name, phone, Contorller.번호)); // 객체화후 저장
		Contorller.번호++;	//저장되었으면 번호를 늘려 다음회원가입하는사람은 +1
		return true;		// 트루 반환 메소드종료
	}
	public static int 로그인(String id, String pw) {
		//id pw 받아오기
		//id pw 비교하고 member리스트에 있음 회원번호 값리턴
		for(Member temp : Contorller.member) {
			if(temp.getId().equals(id)) { // 아이디가 같으면
				if(temp.getPw().equals(pw)) {	// 비밀번호가 같으면
					return temp.getBno();	// 회원번호 반환
				}
			}
		}
		return -1; // 실패시 -1 리턴
	}
	public static void 아이디찾기(String name, String phone) {
		//name phone 받아오기
		//두인자비교후 맞는 list안에 id값 출력
		for(Member temp : member) {
			if(temp.getName().equals(name)) { // 이름이 같으면
				if(temp.getPhone().equals(phone)) {	// 폰번호가 같으면
					System.out.println("아이디: " + temp.getId());	//아이디 출력
				}
			}
		}
	}
	public static void 비밀번호찾기(String id, String phone) {
		//id phone 받아오기
		//두인자비교후 맞는 list안 pw값 출력
		for(Member temp : member) {
			if(temp.getId().equals(id)) { // 아이디가 같으면
				if(temp.getPhone().equals(phone)) { // 폰번호가 같으면
					System.out.println("아이디: " + temp.getId()); // 아이디가 같으면
				}
			}
		}
	}
	//////////////////////// 은행업무////////////////////////////////////////////////////////////////////
	public static boolean 계좌생성(int bno, String pw) {
		//회원번호 받아와서
		Random random = new Random();	//난수객체선언
		//계좌번호생성후 중복검사 실행 중복이 아니면 저장
		while(true) {
			int 번호 = random.nextInt(10000)+1;			
			String 번호str = String.format("%04d", 번호);	// %04d == 4자리수가안되면 0으로 채움[String.format]
			bank.add(new 은행(bno, 번호str, 0, pw)); // 객체화동시에 리스트의 저장
			return true;	// 트루 반환
			/////////////////////////////////////////////////////////
			//for(은행 temp : bank) {??????????????? for문실행안됨
			//	if(temp.get계좌번호().equals(번호str) == false) {					
			//		return true;
			//	}
			//}
			/////////////////////////////////////////////////////////
		}	
	}
	public static boolean 입금(String 계좌번호, int mon) {
		//입금할계좌를 받아와서
		//비교
		for(은행 temp : bank) {
			if(temp.get계좌번호().equals(계좌번호)) { //게좌번호가 같은면
				temp.set잔액(temp.get잔액() +  mon);	// 입금
				return true;
			}
		}
		//성공시 true반환
		return false; // 실패 false 반환
	}
	public static boolean 출금(String num,String pw,int mon) {
		//계좌번호 비밀번호를 받아와서 출금액
		//계좌를 찾고 비밀번호 체크후 잔액 > 출금액 여부 확인
		for(은행 temp : bank) {
			if(temp.get계좌번호().equals(num) && temp.get비밀번호().equals(pw) && temp.get잔액() > mon) {// 계좌번호와 비밀번호와 잔액이 출금액보다 크면
						temp.set잔액(temp.get잔액() - mon);	// 잔액에서 빼기
						return true;
					}			
		}
		return false;
	}
    public static boolean 이체(String num, String num2, int mon) {
		//출금계좌, 입금계좌, 이체금 받아오기
    	//출금계좌 찾은후 입금계좌 찾은후 이체금 잔액여부 비교
    	for(은행 temp : bank) {
    		if(temp.get계좌번호().equals(num) && temp.get잔액() > mon) { // 계좌번호가 같고 잔액이 출금액보다 많으면
    				for(은행 temp2 : bank) {
    					if(temp2.get계좌번호().equals(num2)) { // 입급받을 계좌번호가 같으면
    						temp.set잔액(temp.get잔액() - mon);	// 출금계좌 잔액 -
    						temp2.set잔액(temp2.get잔액() + mon); // 입금받을계좌 잔액 +
    						return true;
    					}
    				}	
    		}
    	}
    	return false;
	}
    public static void 계좌목록(int bno) {
		//회원 번호 받아와서
    	//같은회원번호 계좌들 출력
    	System.out.println("계좌번호\t잔액\t회원번호");
    	for(은행 temp : bank) {
    		if(temp.get회원번호() == bno) { // 회원번호가 같으면
    			System.out.println(temp.get계좌번호() +"\t"+ temp.get잔액() +"\t"+ temp.get회원번호()); // 출력
    		}
    	}
	}
    //대출업무//////////////////////////////////////////////////////////////////////////
    public static boolean 대출가입(int money, String pw, int bno) {
		//돈 패스워드 회원번호 입력받아
    	for(Member temp : member) {
    		if(temp.getBno() == bno && temp.getPw().equals(pw)) { //회원번호가 같으면서 비밀번호가 같으면
    				didank.add(new 대출(bno, money)); // 객체생성후 대출리스트에 추가
    				return true;
    			}
    	}
    	return false;
	}
	public static boolean 대출상환(String 출금계좌, String pw, int money, int bno) {
	//출금계좌 상환금 입력받아 빼기 [출금계좌비교 / 비밀번호 비교 / 돈보다 잔액많은지 체크 회원번호비교 값빼기]
		for(은행 temp : bank) {
			if(temp.get계좌번호().equals(출금계좌) && temp.get비밀번호().equals(pw) && temp.get잔액() > money) { // 출금계좌가 같으면서 비밀번호가 같으면서 잔액이 돈보다 많으면
						temp.set잔액(temp.get잔액() - money); // 계좌잔액을 빼고
						for(대출 temp2 : didank) {
							if(temp2.get회원번호() == bno) { // 대출 회원번호와 회원번호가 같으면
								temp2.set남은대출금(temp2.get남은대출금() - money); // 대출상환 
								return true;
							}
						}				
			}
		}
		return false;
		
	
	}
	public static void 남은대출금확인(int bno) {
		System.out.println("회원번호\t남은대출금");
		for(대출 temp : didank) {
			if(temp.get회원번호() == bno) {
				System.out.println(temp.get회원번호()+"\t"+temp.get남은대출금());
			}
		}
	}

	
	
}
