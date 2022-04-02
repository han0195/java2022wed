package 도서검색프로그램;

import java.io.IOException;

public class 도서검색 {
	// 도서 검색 프로그램
			// [조건]
			// 1. 입력받기 [ System.in.read() ]
			// 2. String 배열내 여러 도서가 저장 
				//		String[] 도서목록 = {	
				//			"된다! 네이버 블로그&포스트",
				//			"스프링 부트 실전 활용 마스터",
				//			"Tucker의 Go 언어 프로그래밍",
				//			"혼자 공부하는 C 언어"
				//};
			// 3. 검색기능 , 수정기능 
				// 검색기능 : 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력 
						// '언어' 검색 ->  "Tucker의 Go 언어 프로그래밍" / "혼자 공부하는 C 언어"
					// 수정기능 : 수정할 도서명의 일부를 입력받아 출력된 도서명중 번호를 선택 
						// '수정' 수정 -> 선택된 도서명의 수정할 문자와 새로운 문자 입력받아 ->  수정 완료
	
	public static void main(String[] args) throws IOException { // 16 : 23   // 3
		String[] 도서목록 = {"책1","책2","책3"};
		
		while(true) { 
			
			System.out.println("***** 도서검색 프로그램 *****");
			System.out.println("1.검색 2.수정");
			byte[] bytes = new byte[100]; //바이트배열 선언 
			int count = System.in.read(bytes); // 입력받기		
			String ch = new String(bytes, 0, count - 2); //???
			
			if(ch.equals("1")) {
				System.out.println("검색: ");
				count = System.in.read(bytes);  // 입력받기
				String search = new String(bytes, 0 , count -2); // 입력값 저장
				
				for(String tmep : 도서목록) { // 도서목록 뒤져보기 
					
					if(tmep.contains(search)) { // 도서목록들중 안에 내용에서 입력값이 있음 
						System.out.println(tmep); // 출력
					}
					
				}// for end
			}else if(ch.equals("2")) {
				System.out.println("*** 수정 ***");
				System.out.println("수정할 도서명[일부]");
				count = System.in.read(bytes); // 입력값받기(아스키코드? 숫자로)
				String search = new String(bytes, 0, count - 2); // 입력값 저장 
				int i = 0;
				for(String temp : 도서목록) { // 도서목록 뒤져보기
					if(temp.contains(search)) { // 입력값 출력
						System.out.println("도서번호" + i + "번 교재명 : " + temp);
					}
					i++;
				}
				System.out.println("도서번호 선택: "); // 도서번호 [인덱스]
				count = System.in.read(bytes); // 입력
				String ch2 = new String(bytes , 0 , count-2); // 저장
				int index = Integer.parseInt(ch2);
				

				System.out.println("기존 문자");
				count = System.in.read(bytes);
				String a = new String(bytes, 0 , count - 2 );
				System.out.println("새로운 문자");
				count = System.in.read(bytes);
				String d = new String(bytes, 0 , count - 2 );
				도서목록[index] = 도서목록[index].replace( a,d); // 수정
				System.out.println("변경 되었습니다");
			}
		}// 프로그램 종료 end
		
	}// me
}// ce
