package Day11;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		student[] st = new student[100];
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("-----------성적표------------------");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
			System.out.println("----------------------------------");
			for(int i = 0 ; i < st.length ; i++) {
				if(st[i] != null) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", i+1, st[i].get이름(), st[i].get국어(), st[i].get영어(), st[i].get수학(),st[i].get총점(),st[i].get평균(), i+1);
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
				
				//비교
//				student temp = null;
//				for(int i = 0; i < st.length ; i++) {
//					if(st[i] != null) {
//						for(int j = 1; j < st.length ; j++) {
//							if(st[j] != null && st[i].get총점() < st[j].get총점()) {
//								temp = st[i];
//								st[i] = st[j];
//								st[j] = temp;		
//							}
//						}
//					}			
//				}
				
				
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
			
			
			
		}
		
	}
	
	
}
