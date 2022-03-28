package Day19;

import java.util.TreeSet;

public class Day19_5 {
	public static void main(String[] args) {
	
		// p.753 : TreeSet 클래스
			// 1. 하나의 객체 = 노드
			// 2. 각 노드는 2개의 자식 노드를 가질수 있다.
			// 3. 부모보다 작으면 왼쪽 자식 / 부모보다 크면 오른쪽 자식
			// 4. 트리구조에서 가장 왼쪽에 있는 노드가 작은값 가장 오른쪽은 가장큰값
			// 5. TreeSet< 기존자료형클래스 > :
			// 6. TreeSet< 사용자정의클래스 > :  
		// 1. treeset 클래스의 객체 선언
		TreeSet<Integer> scores = new TreeSet<>();
		// 2. treeset 객체에 객체
		scores.add(87); System.out.println("확인: " + scores);
		scores.add(89);	System.out.println("확인: " + scores);
		scores.add(75);	System.out.println("확인: " + scores);
		scores.add(12);	System.out.println("확인: " + scores);
		scores.add(64);	System.out.println("확인: " + scores);
		scores.add(98);	System.out.println("확인: " + scores);
		// 3.
		
		System.out.println( scores.first() ); // 가장 왼쪽 노드 호출
		System.out.println( scores.last() );  // 가장 오른쪽 노드 호출
		System.out.println( scores.lower(64) ); // 64보다 작은 노드 호출
		System.out.println( scores.higher(12) ); // 12 노드보다 호출 
		System.out.println( scores.floor(98) ); // 64포함 왼쪽 노드
		System.out.println( scores.ceiling(64)); // 64포함 오른쪽 노드
		// 4. 삭제
		System.out.println( scores.pollFirst()); // 가장 왼쪽노드 삭제
		System.out.println( scores.pollLast()); // 가장 오른쪽 노드 삭제
		System.out.println("확인: " + scores); 
		// 5. 오름차순 vs 내림차순
		// * 오름차순 [기본값]
		System.out.println("기본[오름차순] : " + scores);
		// *내림차순 [ .descendingSet() : 내림차순]
		System.out.println("확인: " + scores.descendingSet()+"\n");
		
		// 오름차순 하나씩 출력
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		System.out.println();
		// 내림차순 하나씩 출력
		for(Integer temp : scores.descendingSet()) {
			System.out.println(temp);
		}
	}
}
