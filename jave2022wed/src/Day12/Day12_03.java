package Day12;

import java.io.IOException;

public class Day12_03 {
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
			
	public static void main(String[] args) throws IOException {
		
		String[] 도서목록 = {"된다! 네이버 블로그&포스트", "스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"};	
		
		
		while (true) {
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes); 
			
			String ch = new String(bytes, 0 , count - 2); // 바이트배열 -- > 문자열 변환 [ -2 = \n\r 제거]
			
			if(ch.equals("1")) {
			System.out.println("검색: ");
			count = System.in.read(bytes); 
			String search = new String(bytes, 0 , count -2);
			
			for(String tmep : 도서목록) {
				//방법1
//				if(tmep.indexOf(search) != -1) {
//					//indexOf 메소드 -1 반환되는경우는 동일한 단어가 없을경우 [검색x]
//					System.out.println(tmep); // 해당 문자열내 찾을문자가 존재하면 출력
//				}
				//방법2
				if(tmep.contains(search)) { // 문자열.Contains('찾을문자') : 문자열내 찾을문자가 true
					System.out.println(tmep);
				}
				
				
			}
					
				
			}else if(ch.equals("2")) {
				System.out.println("*** 수정 ***");
				System.out.print("수정할 도서명[일부]");
				count = System.in.read(bytes);
				String search = new String(bytes, 0, count - 2); // 0번 인덱스 바이트부터 -2 제외한 인덱스까지
				int i = 0;
				for(String temp : 도서목록) {
					if(temp.contains(search)) {
						System.out.println("도서번호" + i + "번 교재명 : " + temp);
					}
					i++;
				}
				//도서번호 [ 인덱스 ] 입력받아 수정하기
				System.out.println("도서번호 선택: ");
				count = System.in.read(bytes);
				String ch2 = new String(bytes , 0 , count-2);
				int index = Integer.parseInt(ch2);
				
				// ch2 문자열로 입력받음 ---> 인덱스[숫자] 변환
				System.out.println("기존 문자");
				count = System.in.read(bytes);
				String a = new String(bytes, 0 , count - 2 );
				System.out.println("새로운 문자");
				count = System.in.read(bytes);
				String d = new String(bytes, 0 , count - 2 );
				// 수정처리
				도서목록[index].replace( a,d);
				// 배열내 도서명 = 수정된 도서명
				System.out.println("변경 되었습니다");
				
				
				
			}
		}
		
	}
}
