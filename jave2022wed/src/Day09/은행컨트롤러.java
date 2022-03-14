package Day09;

import java.util.Random;

public class 은행컨트롤러 {//클래스

	// 해당 클래스는 은행 관련 컨트롤러
	// M : 모델[ 데이터 ]
	// V : 뷰 [ 입출력 ]
	// C : 모델[M]과 뷰[V] 연결 역활
	
	// 뷰에서 요청하는 서비스 [기능] 제공
		//1. 계좌생성 [ C ]
	public String 계좌생성(String pw, String name, int 은행번호) {
		
		// 1. 입력받은 값을 가져온다
			//계좌번호 자동생성
		String 계좌번호 = null;
		while (true) {
			Random random = new Random(); // 랜덤
			//4자리 생성
			int 난수 = random.nextInt(10000); // 0~9999;
				계좌번호 = String.format("%04d", 난수);
							//문자형식 변경
								//%d 정수
								//%d4 정수 4자리 [ 만일 자릿수 없으면 공백처리 ]
										// 15 -> "  "15
								//%04d 정수 4자리 [만일 자릿수 없으면 0처리]
										// 15 -> 0015
			//중복체크			
		
				boolean 계좌번호통과 = true;
				for(Bank temp : Day09_06_은행계좌.banklist) {
					if(temp != null && temp.get계좌번호().equals(계좌번호)) {
						계좌번호통과 = false;
					}
				}
				if(계좌번호통과) {
					break;
				}
		}
												
		// 2. 객체화 [단수의 변수를 하나의 객체로 만들기 ]
			Bank temp = null;
			if(은행번호 == 1) {
				temp = new 국민은행(계좌번호, pw, name, 0);
			}else if(은행번호 == 2) {
				temp = new 신한은행(계좌번호, pw, name, 0);
			}else if(은행번호 == 3) {
				temp = new 하나은행(계좌번호, pw, name, 0);
			}
		// 3. 배열에 저장
		int i = 0;
		for(Bank temp2 : Day09_06_은행계좌.banklist) {
			if(temp2 == null) {
				Day09_06_은행계좌.banklist[i] = temp;
				return 계좌번호;
			}
			i++;
		}
		return null;
	}
		//2. 입금 [ U ] 
	public int 입금(String 계좌번호, int money) {
		//해당계좌 찾기
		for(Bank temp : Day09_06_은행계좌.banklist) {
			if(temp != null && temp.get계좌번호().equals(계좌번호)) {
				temp.set예금액(temp.get예금액() + money);
				return temp.get예금액();
			}
		}
		return 0;
	}
		//3. 출금	[ U ]
	public int 출금(String 계좌번호, String pw, int money) {
		//해당계좌 찾기
				for(Bank temp : Day09_06_은행계좌.banklist) {
					if(temp != null && temp.get계좌번호().equals(계좌번호)) {
						if(temp.get비밀번호().equals(pw)) {
							if(temp.get예금액() > money) {
								temp.set예금액(temp.get예금액() - money);
								return temp.get예금액();
							}else {
								return 1;
							}
						}else {
							return 0;
						}
					}
				}
				return 0;
	}
		//4. 이체	[ U ]
	public int 이체( String 계좌번호, String pw, int money, String 받는계좌) {// 본인 계좌 / 비밀번호 / 이체금액
		//1. 동일한계좌 와 비밀번호를 찾기
		//2. 받는계좌 찾기
		//3. 본인계좌에서 이체금액을 빼기 / 받는계좌에서 이체금액을 더하기
		//리턴경우의 수: 1.성공 2.실패[본인계좌 정보 틀림, 받는 계좌 정보틀림, 잔액 부족]
		int i = 0;
		for ( Bank temp : Day09_06_은행계좌.banklist) {
			if(temp != null && temp.get계좌번호().equals(계좌번호) &&
					temp.get비밀번호().equals(pw)) {
				int j = 0;
				for(Bank temp2 : Day09_06_은행계좌.banklist) {
					if(temp2 != null && temp2.get계좌번호().equals(받는계좌)) {
						
						if(temp.get예금액() < money) {
							return 1;
					}else {
						Day09_06_은행계좌.banklist[i].set예금액(temp.get예금액() - money);
						Day09_06_은행계좌.banklist[j].set예금액(temp2.get예금액() + money);
						return 2;
					}
					
				}
					j++;
			}
		}
			i++;
		}
		return 4;
	}
		//5. 내계좌목록 [ R ]
	public Bank[] 계좌목록(String name) {
		//입력받은 계좌주의 계좌목록 만들어서 반환
								//인수 : 외부로 들어노는 데이터
			//동일한 계좌주의 계좌를 찾아서 내계좌목록의 저장
		Bank[] 내계좌목록 = new Bank[100];
		for(Bank temp : Day09_06_은행계좌.banklist) {
			if(temp != null && temp.get계좌주().equals(name)) {
				//해당 계좌내 계좌주와 인수의 계좌주와 동일하면
				//내계좌목록 배열내 빈공간을 찾아서 내계좌목록에 넣기
				int i = 0;
				for( Bank temp2 : 내계좌목록) {
					if(temp2 == null) {
						내계좌목록[i] = temp; break;
					}
					i++;
				}
			}
		}			
		
		return 내계좌목록;
	}
		//6. 대출 [ U ]
	public boolean 대출() {
		return false;
	}
}	
