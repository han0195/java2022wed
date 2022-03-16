package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_07_키오스크 {
			//상속 : 점포
			//클래스 : 롯데리아, 버거킹
			//인터페이스 : 키오스크
			//파일처리 : 제품재고 관리
	public static void main(String[] args) {
		
	
		//키오스크 롯데리아 = new 롯데리아(); // 롯데리아 키오스크 생성
		Scanner scan = new Scanner(System.in); // 입력객체
		ArrayList<상품> 상품리스트 = new ArrayList<상품>();		
		
		// 제품목록 읽어오기
		//* 파일 입력
		// 1. 파일 입력객체
		try { // try {} 안에 예외[오류] 발생할것같은 코드 넣기(예상)
			FileInputStream inputStream = new FileInputStream("C:/Users/504/Desktop/롯데리아재고.txt");
			// 2. 파일 읽어오기 [ 파일 ---> 스트림(바이트) ---> 자바 ]
			// 1. 바이트배열 선언
			byte[] bytes = new byte[1024];// bit -> byte -> kb
			// 2. 읽어와서 바이트 배열 저장
			inputStream.read(bytes);
			// 3. [, : 필드 구분 \n : 객체(상품 구분)]
			String 파일내용 = new String( bytes ); // 바이트열 -> 문자열
				// String 분해 메소드 = split("기준");
			String[] 상품목록 = 파일내용.split("\n");
			
			for(String temp : 상품목록) {
				String[] 필드목록 = temp.split(",");
				상품 상품 = new 상품(필드목록[0], Integer.parseInt(필드목록[1]), Integer.parseInt(필드목록[2]));
								// 문자열 --> 정수형 변환 [ Integer.parseInt] // 받아온 재고와 가격은 문자열이기때문에 정수형으로 변환
				// 리스트 저장
				상품리스트.add(상품);
			}
				
			
		}catch(Exception e) {// 실제로 오류가 발생화면 {} 실행 -> Exception 클래스의 객체에 저장
			
		}
		
		키오스크 롯데리아 = new 롯데리아("유재석", 상품리스트);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		while(true) {//프로그램실행
			
			롯데리아.제품목록();
			int ch = scan.nextInt();
			
			if(ch == -1) {
				롯데리아.상품추가();
			}else {
				롯데리아.장바구니();
			}
			
		}
		
		
		
	}

}
