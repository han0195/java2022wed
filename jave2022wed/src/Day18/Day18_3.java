package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {
	
	//p.731~732 : LinkedList 클래스
	// 				ArrayList 		vs		LinkedList
	// 		   			배열			vs 			링크
	// 내부구조차이 	인덱스기준으로연결	vs		서로 다른 메모리주소 연결
	// 속도					
	// add[추가]			빠름
	// add[삽입=중간] 							빠름
	// 검색				빠름
	// 삭제										빠름
	public static void main(String[] args) {
		// 1. Arraylist 객체 선언 [ 제네릭 : String ]
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList 객체 선언 [ 제네릭 : String ]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. 시간변수
		long startime; // 시작 시간
		long endtime;  // 끝나는 시간
		
		// 4. arraylist객체에 10000개 객체를 삽입하는데 걸리는시간 체크
			startime = System.nanoTime();
			for(int i = 0; i < 10000 ; i++) {
				list1.add(0, i+""); // 정수 -> 문자열 변환 : 1. String.valueOf(정수) 2.정수+""
									// 문자열 -> 인수 변환 Integer.parseInt(변환)
			}
				endtime = System.nanoTime();
			System.out.println("Arraylist 가 10000개 삽입하는 걸리는 시간: " + (endtime - startime) + "ns");
			
			// 4. arraylist객체에 10000개 객체를 삽입하는데 걸리는시간 체크
					startime = System.nanoTime();
					for(int i = 0; i < 10000 ; i++) {
						list2.add(0, i+""); // 정수 -> 문자열 변환 : 1. String.valueOf(정수) 2.정수+""
											// 문자열 -> 인수 변환 Integer.parseInt(변환)
					}
						endtime = System.nanoTime();
					System.out.println("Linklist 가 10000개 삽입하는 걸리는 시간: " + (endtime - startime) + "ns");
	}
}
