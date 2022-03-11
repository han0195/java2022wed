package Day08;

import java.util.Arrays;
import java.util.Scanner;

//대출통장// 5.대출: 1.대출가입 2. 대출상환 3.남은대출금 4.뒤로가기
		//1. 
public class Long {
	//필드 1.name 2.잔액
		private String name = "캐피탈";
		private int balance;
		private String id; // 비교를 위해
	
	//생성자
		public Long() {
			
		}
		public Long(String name, int balance, String id) {
			this.name = name;
			this.balance = balance;
			this.id = id;
		}
	//메소드
		public void Management(String[] result) {
			System.out.println("---------------------------------대출가입----------------------------------");
			System.out.println(name + "무한한도");
			// pw 확인
			System.out.println("비밀번호: "); String pw = Day08_05.scanner.next();
			//비밀번호 확인작업
			boolean pwch = false;
			if(result[3].equals(pw)) {
				pwch = true;
			}else {
				System.out.println("비밀번호가 동일하지 않습니다.");
				return;
			}
			if(pwch == true) {// 비밀번호확인이 완료되면
				System.out.println("대출금액: "); int br = Day08_05.scanner.nextInt();
				//4 객체생성
				Long long2 = new Long(name, br, result[0]);
				// 저장
				int i = 0;
				for(Long temp : Day08_05.longs) {// null 확인
					if(temp == null) {// null이 확인되면
						Day08_05.longs[i] = temp;
						System.out.println("대출상품 가입성공");
						return;
					}
					i++;
				}
			}
			
			
			
		}//대출가입 end
		//대출상환
		public void Repayment() {
			
			
		}
		//남은 대출금
		public void LoanAmount() {
			
		}
	
}
