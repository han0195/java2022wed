package Day08;

public class Bank { // c s
	//필드
	private int bNum; // bank number
	private String name; // 이름
	private String hNum; // human number
	private int money;
	private String bPw; // Bank password
	//생성자
	
		//빈 생성자
	public Bank() {}
	
		//[필드 2개] 생성자
	public Bank(String name, int money) {
		this.name = name;
		this.money = 0;
	}
	
		//[필드 4개] 풀 생성자
	public Bank(int bNum, String name, String hNum, int money, String bPw) {
		this.bNum = bNum;
		this.name = name;
		this.hNum = hNum;
		this.money = money;
		this.bPw = bPw;
	}
	//메소드
	
		//	- 1. 계좌 생성
	void 계좌생성() { // 계좌생성 s
		System.out.println("-----계좌 생성 페이지-----");
		System.out.println("이름을 입력해주세요 : "); String name = Day08_05.scanner.next();
		System.out.println("비밀번호를 입력해주세요 : "); String pw = Day08_05.scanner.next();
		for(Member temp : Day08_05.member) { // for s
			if (temp != null && temp.name.equals(name)) { // 대충 확인되면
				int bNum =0; // 계좌번호 부여 s
				int i = 0; // 반복횟수
				for(Bank t : Day08_05.bank) {
					if(t == null) {
						if( i == 0) {
							bNum = 1;
							break;
						}
						bNum = Day08_05.bank[i - 1].bNum + 1;
						break;
					}
					i++;
				} // 계좌번호 부여 e
				Bank bank = new Bank(bNum, name, hNum, 0, pw); // 변수를 1개의 배열로 합치기
				System.out.println(" 계좌 생성이 완료되었습니다. ");
				return;} // if 3 e 
		} // for e
		System.out.println(" 계좌 생성 실패. 다시 시도해주세요. ");
	} // 계좌생성 e
		//	- 2. 입금
	void 입금(String[] result) { // 입금 s
		System.out.println(" 입금 페이지 ");
		System.out.println(" 금액을 넣어주세요 "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // 금액이 양수면
		for ( Bank temp : Day08_05.bank) {
			if (temp != null && temp.bNum==(bNum) && money>=0) { // 계좌번호 일치하면
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
		for ( Bank temp : Day08_05.bank) {						// 계좌번호 일치하면
			if (temp != null && temp.bNum==(bNum) && money>=0 && (temp.money-money)>=0) { 
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
			for ( Bank temp : Day08_05.bank) { // for s	
				if(temp != null && (temp.money>=money)) { //돈이 충분하면
					 for(Bank oppo : Day08_05.bank) { //for2 s
						
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

