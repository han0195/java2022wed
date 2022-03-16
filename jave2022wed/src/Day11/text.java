package Day11;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		
		
		
		student[] st = new student[100]; // 학생 클래스 배열
		
		
		while(true) { // 무한반복
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("---------------------------------");
				System.out.println("-----------성적표------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("----------------------------------");
				//석차 구하기
				for(int i = 0; i < st.length ;i++){ // st 만큼 반복
					if(st[i] != null) { // null 아니면
						st[i].set석차(1); // 석차 1로 초기화
						for(int j = 0; j < st.length ;j++) { // 다시 st 하나씩 비교
							if(st[j] != null && st[i].get총점() < st[j].get총점()) {	// i 총점보다 j 총점 작으면 석차++ 							
									st[i].set석차(st[i].get석차()+ 1);							
							}
						}
					}
					
				}
				student[] ar = new student[100];
				// 석차랑 같으면 배열 순서대로 넣기
				for(int i = 1; i < ar.length ; i++) { // 석차
					for(int j = 0; j < ar.length ; j++) { //배열 정리
						if(st[j] != null && st[j].get석차() == i) {
							ar[i - 1] =  st[j];							
						}
					}
				}
							
				for(int i = 0 ; i < ar.length ; i++) {
					if(ar[i] != null) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", i+1, ar[i].get이름(), ar[i].get국어(), ar[i].get영어(), ar[i].get수학(),ar[i].get총점(),ar[i].get평균(), ar[i].get석차());	
					}
					
				}				
				System.out.println("----------------------------------");
				System.out.println("1.학생점수 등록 2.학생점수 삭제"); int ch = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("----------------학생등록--------------------");
					System.out.println("이름: "); String name = sc.next();
					System.out.println("국어점수: "); int 국어 = sc.nextInt();
					System.out.println("영어점수: "); int 영어 = sc.nextInt();
					System.out.println("수학점수: "); int 수학 = sc.nextInt();
					int 총점 = 국어 + 영어 + 수학;
					double 평균 = 총점 / 3; 
					//객체화
					student st1 = new student(name, 국어, 영어, 수학, 총점, 평균);
					
					//저장
					for(int i = 0; i < st.length ; i++) {
						if(st[i] == null) {
							st[i] = st1;						
							break;
	 					}
					}
					
					
					
				}else if(ch == 2) {
					System.out.println("삭제할 번호 선택: "); int index = sc.nextInt();
					st[index - 1] = null;

					for(int i = index - 1; i < st.length - 1 ; i++) {
						if(i == st.length - 1) {
							st[i] = null;
						}else {
							st[i] = st[i + 1];
						}
					}
				}else {
					System.out.println("알수없는 행동");
				}
			}catch(Exception e){
				System.out.println("알수없는행동입니다 " + e);
			}
			
			
			
			
		}
		
	}
	
	
}
