package Day08;

import java.util.Random;

public class Bank { // c s
	Random random = new Random();
	//필드
	private String bNum; // bank number
	private String name; // 이름
	private String hNum; // human number
	private String money;
	//생성자
	
		//빈 생성자
	public Bank() {}
	
		//[필드 2개] 생성자
	public Bank(String name, String money) {
		super();
		this.name = name;
		this.money = money;
	}
	
		//[필드 4개] 풀 생성자
	public Bank(String bNum, String name, String hNum, String money) {
		this.bNum = bNum;
		this.name = name;
		this.hNum = hNum;
		this.money = money;
	}
	//메소드
		//	- 1. 계좌 생성
	void 계좌생성() { // 계좌생성 s
		System.out.println("-----계좌 생성 페이지-----");
		System.out.println("이름을 입력해주세요 : "); String name = Day08_05.scanner.next();
		System.out.println("비밀번호를 입력해주세요 : "); String pw = Day08_05.scanner.next();
		for(Member temp : Day08_05.member) { // for s
			if (temp != null && temp.name.equals(name) && temp.pw.equals(pw)) { // 대충 확인되면
				
				
				
				System.out.println(" 계좌 생성이 완료되었습니다. ");
				return; 
			}
		} // for e
		System.out.println(" 계좌 생성 실패. 다시 시도해주세요. ");
	} // 계좌생성 e
		//	- 2. 입금
	void 입금() { // 입금 s
		System.out.println(" 입금 페이지 ");
		System.out.println(" 금액을 넣어주세요 "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // 금액이 양수면
		for ( Member temp : Day08_05.member) {
			if (temp != null && temp.bNum.equals(bNum) && money>=0) { // 계좌번호 일치하면
				temp.money+=money; System.out.println("입금이 완료되었습니다. 잔액 : " + temp.money); return;
				}
			}
		} System.out.println("오류. 재시도");
	} // 입금 e
		//	- 3. 출금
	void 출금() { // 출금 s
		System.out.println(" 출금 페이지 ");
		System.out.println(" 출금할 금액을 입력해주세요 "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // 금액이 양수면
		for ( Member temp : Day08_05.member) {						// 계좌번호 일치하면
			if (temp != null && temp.bNum.equals(bNum) && money>=0 && (temp.money-money)>=0) { 
				temp.money-=money; System.out.println("출금이 완료되었습니다. 잔액 : " + temp.money); return;
				}
			}
		}
	} // 출금 e
		//	- 4. 이체
	void 이체() { // 이체 s
		System.out.println(" 이체 페이지 ");
		System.out.println(" 이체할 금액을 입력해주세요 "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // 금액이 양수면
			System.out.println(" 이체할 계좌번호를 입력해주세요 "); int bNum = Day08_05.scanner.nextInt();
			for ( Member temp : Day08_05.member) { // for s	
				if(temp != null && (temp.money>=money)) { //돈이 충분하면
					 for(Member oppo : Day08_05.member) { //for2 s
						
					} // for2 e
					System.out.println("이체가 완료되었습니다.");
				}
			} // for e
		}// if end
	} // 이체 e
		//	- 5. 대출
		//	- 6. 계좌목록
		//	    - 계좌 번호와 잔액만 표기
			
	
	
} // c e
