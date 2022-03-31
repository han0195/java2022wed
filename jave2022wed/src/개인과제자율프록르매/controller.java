package 개인과제자율프록르매;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class controller implements 인터페이스{
	
	static ArrayList<메모장> 메모s = new ArrayList<메모장>();
	static ArrayList<회원> 회원 = new ArrayList<회원>();
	
	@Override
	public boolean 회원가입(String id, String pw, String name) {
		//id pw name받아와서 id 중복체크후 저장 통과		
		for(메모장 temp : 메모s) {// 중복체크
			if(temp.id.equals(id)) {
				return false;
			}
		}
		회원 temp = new 회원(id, pw, name); // 넘길거
		회원.add(temp); // 저장
		try {
			회원파일저장(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public String 로그인(String id, String pw) {
		// id pw 받아와서 중복체크
		for(회원 temp : 회원) {
			if(temp.id.equals(id) && temp.pw.equals(pw)) {
				return id;
			}
		}
		return null;
	}
	@Override
	public void 목록출력(String id) {
		for(메모장 temp : 메모s) {
			if(temp.id.equals(id)) {
				if(temp.getContent() != null) {
					System.out.println(temp.getContent() +"\t"+ temp.is완료여부());
				}	
			}
		}
	}
	@Override
	public void 메모삭제(String cen, String result) {
		// id 값 인덱스 받아와서 삭제
		for(int i = 0; i < 메모s.size() ; i++) {
			if(메모s.get(i).id.equals(result)&& 메모s.get(i).getContent().equals(cen)) {
				메모s.remove(i);
			}
		}		
	}
	@Override
	public boolean 메모작성(String id, String cen) {
		//id 값 내용 받아와 처리
		for(회원 temp : 회원) {
			if(temp.id.equals(id)) {
				메모장 temp2 = new 메모장(cen , false , temp.id, temp.pw , temp.name);
				메모s.add(temp2);
				try {
					메모장파일저장(temp2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		}
		return false;
	}
	@Override
	public void 메모완료(String cen, String result) {//내용, 아이디
		// 내용 id 받아와서 비교
		for(메모장 temp : 메모s) {
			if(temp.id.equals(result)&& temp.getContent().equals(cen)) {
				temp.set완료여부(!temp.is완료여부());
			}
		}
	}

	public void 파일불러오기() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:/Users/gks01/Desktop/txtx/회원.txt");
		byte[] beyte = new byte[1024];// 바이트배열선언
		fileInputStream.read(beyte);  // 바이트읽기
		String strall = new String(beyte); // 문자열 전체 저장
		String[] strs = strall.split("\n"); // 구분으로 저장
		for(int i = 0 ; i < strs.length - 1 ; i++) { // 필드 저장
			String[] str = strs[i].split(",");
			회원.add(new 회원(str[0], str[1], str[2]));
		}	
	}
	public void 메모장파일불러오기() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:/Users/gks01/Desktop/txtx/메모장.txt");
		byte[] beyte = new byte[1024];// 바이트배열선언
		fileInputStream.read(beyte);  // 바이트읽기
		String strall = new String(beyte); // 문자열 전체 저장
		String[] strs = strall.split("\n"); // 구분으로 저장
		for(int i = 0 ; i < strs.length - 1 ; i++) { // 필드 저장
			String[] str = strs[i].split(",");
			메모s.add(new 메모장(str[0], Boolean.parseBoolean(str[1]) , str[2], str[3], str[4]));
		}	
	}

	public void 메모장파일저장(메모장 save) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/gks01/Desktop/txtx/메모장.txt", true);
		String str = save.getContent()+","+save.is완료여부()+","+save.id+","+save.pw+","+save.name+"\n";
		fileOutputStream.write(str.getBytes());
		
	}
	public void 회원파일저장(회원 save) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/gks01/Desktop/txtx/회원.txt", true);
		String str = save.id+","+save.pw+","+save.name+"\n";
		fileOutputStream.write(str.getBytes());
	}
	
}
