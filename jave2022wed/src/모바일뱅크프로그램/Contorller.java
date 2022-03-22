package 모바일뱅크프로그램;

import java.util.ArrayList;

public class Contorller {
	ArrayList<Member> member = new ArrayList<Member>();
	ArrayList<은행> bank = new ArrayList<은행>();
	ArrayList<대출> didank = new ArrayList<대출>();
	
	public static boolean 회원가입() {
		//id pw name phone 받아오기
		//id 중복체크
		//객체화후 저장
	}
	public static String 로그인() {
		//id pw 받아오기
		//id pw 비교하고 member리스트에 있음 회원번호 값리턴
	}
	public static void 아이디찾기() {
		//name phone 받아오기
		//두인자비교후 맞는 list안에 id값 출력
	}
	public static void 비밀번호찾기() {
		//id phone 받아오기
		//두인자비교후 맞는 list안 pw값 출력
	}
	// 은행업무///////////////////////////////////////////////
	public static boolean 계좌생성() {
		//회원번호 받아와서
	}
	public static boolean 입금() {
		
	}
	public static boolean 출금() {
		
	}
    public static boolean 이체() {
		
	}
    public static void 계좌목록() {
		
	}
    //대출업무//////////////////////////////////////////////////////////////////////////
    public static boolean 대출가입() {
		
	}
	public static boolean 대출상환() {
	
	}
	public static void 남은대출금확인() {
	
	}
	
	
}
