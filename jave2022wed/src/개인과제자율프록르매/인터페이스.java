package 개인과제자율프록르매;

import java.io.FileNotFoundException;

public interface 인터페이스 {
	
	public String 로그인(String id, String pw);
	public boolean 회원가입(String id, String pw, String name);
	public void 목록출력(String id);
	boolean 메모작성(String id, String cen);
	void 메모완료(String cen, String result);
	void 메모삭제(String cen, String result);
}
