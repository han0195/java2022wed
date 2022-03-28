package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	// set 중복불가능
		// 객체내 모든 필드가 동일하면 중복불가능
	
	public static void main(String[] args) {
		
		// 로또 프로그램
			// set 컬렉션
		
		Scanner s = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>(); // set 컬렉션 HachSet 클래스 객체 선언
		
		while(true) {// 무한루프 [ 종료조건: set객체내 객체수가 6이면 break]
			System.out.println("1~45 숫자 선택(중복불가) : ");
			int num = s.nextInt();
			
			if(num < 1 || num > 45) {// 1 ~ 45 사이가 아니면
				System.out.println("선택할수없는 번호");
			}else {
				set.add(num);	// 저장
				System.out.println("확인: " + set);
			}
			if(set.size() == 6) {break;}// 6개의 번호가 저장되면
			
			
		}//w e
	}
}
