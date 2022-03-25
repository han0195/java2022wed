package 은행계좌프로그램;

import java.awt.dnd.DropTarget;
import java.util.Random;

public class 은행컨트롤러 {

	public static boolean 계좌생성(int 은행선택, String pw, String name) {
		Random random = new Random();
		
		String 계좌번호 = String.format("%04d", random.nextInt(10000) + 1);
		if(은행계좌.bank.size() == 0) { // 첫번째 고객이면 비교검사 x
			
		}else {
			for(은행 temp : 은행계좌.bank) {// 첫번째 고객이 아니라면 중복검사
				if(temp.get계좌번호().equals(계좌번호)) {
					계좌번호 = String.format("%04d", random.nextInt(10000) + 1);
				}
			}
		}
	
		if(은행선택 == 1) {//농협은행 선택했으면
			System.out.println("dd");
			은행계좌.bank.add(new 농협은행(계좌번호, pw, name, 0));//생성과동시에 저장
			System.out.println("계좌번호: " + 계좌번호);
			return true;
		}else if(은행선택 == 2) {//신한은행 선택했으면
			은행계좌.bank.add(new 신한은행(계좌번호, pw, name, 0));//생성과동시에 저장
			System.out.println("계좌번호: " + 계좌번호);
			return true;
		}else if(은행선택 == 3) {//하나은행 선택했으면
			은행계좌.bank.add(new 하나은행(계좌번호, pw, name, 0));//생성과동시에 저장
			System.out.println("계좌번호: " + 계좌번호);
			return true;
		}
		return false;
	}
	public static boolean 입금(String 계좌번호, int 입금액) {
		//계좌번호 동일한 객체 찾기
		for(은행 temp : 은행계좌.bank) {
			if(temp.get계좌번호().equals(계좌번호)) {
				//입금
				temp.set예금액(temp.get예금액() + 입금액);
				return true;
			}
		}// for end
		return false;
	}
	public static boolean 출금(String 계좌번호, int 출금액, String 비밀번호) {
		//계좌번호 동일한 객체 찾기
		for(은행 temp : 은행계좌.bank) {
			if(temp.get계좌번호().equals(계좌번호)) {
				if(temp.get비밀번호().equals(비밀번호)) {// 해당계좌 비밀번호가 같은지
					//입금
					temp.set예금액(temp.get예금액() - 출금액);
					return true;
				}		
			}
		}// for end
		return false;
	}
	public static boolean 이체(String 계좌, String pw, String 받는계좌, int 금액) {//계좌번호, 비밀번호, 받는계좌번호, 이체금
		//계좌찾고
		은행 주는계좌 = null;
		은행 받는계좌2 = null; boolean pass = false;
		for(은행 temp : 은행계좌.bank) {
			if(temp.get계좌번호().equals(계좌)) {
				if(temp.get비밀번호().equals(pw)) {//비밀번호 체크
					주는계좌 = temp;	
				}
			}
		}//계좌 찾는 end
		for(은행 temp : 은행계좌.bank) {
			if(temp.get계좌번호().equals(계좌)) {	//받는계좌 찾고
				받는계좌2 = temp;
				pass = true;
			}
		}// 받는계좌 찾는 end 
		//입금출금
		if(pass) {
			주는계좌.set예금액(주는계좌.get예금액() - 금액);// 출금
			받는계좌2.set예금액(받는계좌2.get예금액() + 금액);// 입금
			return true;
		}
		return false;
	}
	public static void 내계좌목록(String name) {
		System.out.println("계좌번호\t잔액\t계좌주");
		for(은행 temp : 은행계좌.bank) {
			if(temp.get계좌주().equals(name)) {
				System.out.println(temp.get계좌번호() +"\t"+ temp.get예금액() +"\t"+ temp.get계좌주());
			}
		}
	}
	public static void 대출() {
		
	}
	
	
}
