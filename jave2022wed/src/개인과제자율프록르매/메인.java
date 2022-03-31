package 개인과제자율프록르매;

import java.io.IOException;
import java.util.Scanner;

public class 메인 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		controller remo = new controller();
		try {
			remo.파일불러오기();
			remo.메모장파일불러오기();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		while(true) {
			
			System.out.println("***** todolist *****");
			System.out.println("1.회원가입 2.로그인"); int ch = s.nextInt();
			if(ch == 1) {//회원가입
				System.out.println("------ 회원가입 ------");
				System.out.println("id입력: "); String id = s.next();
				System.out.println("pw입력: "); String pw = s.next();
				System.out.println("name: "); String name = s.next();
				boolean result = remo.회원가입(id, pw, name);
				if(result) {
					System.out.println("가입성공");
				}else {
					System.out.println("에러)) 가입실패");
				}
			}else if(ch == 2) {//로그인
				System.out.println("------ 로그인 ------");
				System.out.println("id입력: "); String id = s.next();
				System.out.println("pw입력: "); String pw = s.next();
				String result = remo.로그인(id, pw);
				if(result != null) {
					while(true) {// 로그인 창			
						System.out.println("*****"+ result +"님 ToDoList *****");
						System.out.println("내용\t완료여부");
						remo.목록출력(result);
						System.out.println("1.메모작성 2.메모완료 3.메모삭제 4.나가기"); int ch2 = s.nextInt();
						if(ch2 == 1) {//메모작성
							System.out.println("내용"); String cen = s.next();
							boolean result2 = remo.메모작성(result, cen);
							if(result2) {
								System.out.println("작성 성공");
							}else{
								System.out.println("에러)) 작성 실패");
							}
						}else if(ch2 == 2) {// 메모완료
							System.out.println("알림)) false => true / true => false");
							System.out.println("완료한내용: "); String cen = s.next();
							remo.메모완료(cen, result);
						}else if(ch2 == 3) {//메모삭제
							System.out.println("삭제할 내용: "); String cen = s.next();
							remo.메모삭제(cen, result);
						}else if(ch2 == 4) {// 로그아웃
							break;
						}else {
							System.out.println("잘못된입력");
						}
					}//로그인 창 end
				}else {
					System.out.println("에러)) 로그인실패");
				}
			}else {
				
			}//첫번쨰 메뉴 end
		}//프로그램 종료
		
	}	
}
