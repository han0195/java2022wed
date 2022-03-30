package 개인과제키오스크파일처리;

import java.io.IOException;
import java.util.Scanner;

public class 키오스크 {
	// 상속 : 점포
		// 클래스 : 롯데리아, 버거킹 , 컨트롤러
		// 인터페이스 : 키오스크
		// 파일처리 : 제품재고 관리
		// 1.제품목록 2.상품추가 3.결제 [파일처리]
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String[] 점포종류 = {"버거킹", "롯데리아"};
		점포 버거킹 = new 버거킹();
		
		//롯데리아 자리
		while(true) {	
			s = new Scanner(System.in);
			try {		
				버거킹.파일불러오기();
				System.out.println("----- 종합 버거집 주문 프로그램 -------");
				System.out.println("1.버거킹 2.롯데리아"); int 점포선택 = s.nextInt();
				
				if(점포선택 < 점포종류.length && 점포선택 < 0) {// 1 ~ 2 까지만
					System.out.println("해당선택지는 존재하지않습니다");
				}else {
					System.out.println("**** "+점포종류[점포선택 - 1]+" *****");
					System.out.println("1.제품목록 2.장바구니 3.결제 4.상품추가[관리자전용]");
					int ch = s.nextInt();
					if(ch == 1) { // 제품목록
						버거킹.제품목록(점포종류[점포선택 - 1]);
					}else if(ch == 2){// 장바구니
						버거킹.제품목록(점포종류[점포선택 - 1]);
						System.out.println("제품명: "); String tit = s.next();
						boolean result = 버거킹.장바구니(tit, 점포종류[점포선택 - 1]);
						if(result) {
							System.out.println("담기성공");
						}else {
							System.out.println("담기실패");
						}
					}else if(ch == 3) {// 결제
						
					}else if(ch == 4) {// 상품추가
						System.out.println("**** " + 점포종류[점포선택 - 1] + " 상품추가 ****");
						System.out.println("상품명: "); String name = s.next();
						System.out.println("가격: "); int price = s.nextInt();
						System.out.println("재고: "); int 재고 = s.nextInt();
						boolean result;	
								result = 버거킹.상품추가(name, 점포종류[점포선택 - 1], price, 재고);
								if(result) {// 결과
									System.out.println("상품추가성공");
								}else {
									System.out.println("상품추가실패 [관리자문의]");
								}			
					
					}else {
						System.out.println("알수없는 선택");
					}
				}// 점포들어온거 end
			} catch (Exception e) {
				System.out.println("에러" + e);
			}
				
		}//program end
		
		
	}// me
}// ce
