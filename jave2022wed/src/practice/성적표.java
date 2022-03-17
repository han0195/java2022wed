package practice;

import java.util.Scanner;

public class 성적표 {
	
	
	public static void main(String[] args) {
		
		
		
		학생[] stulist = new 학생[100];
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("--------------------------------------------------------------");
				System.out.println("\t\t\t성적표\t\t\t");
				System.out.println("--------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("--------------------------------------------------------------");
				//석차별로 출력하기
				//석차 구하기
				for(int i = 0; i < stulist.length ; i++) {				
					if(stulist[i] != null) {
						stulist[i].set석차(1); 
						for(int j = 0 ; j < stulist.length; j++) {
							if(stulist[j] != null && stulist[i].get총점() < stulist[j].get총점()) {
								stulist[i].set석차(stulist[i].get석차() + 1);
							}
						}
					}
				}
				//석차 순서대로 새로운 배열의 정리해서담기
				학생[] stutmep2 = new 학생[100];
				for(int i = 1 ; i < stulist.length ; i++) {// 석차
					
						for(int j = 0 ; j < stulist.length ; j++) {
							if(stulist[j] != null && stulist[j].get석차() == i) {
								stutmep2[i - 1] = stulist[j];
								break;
							}
						}
					
				}
				
				//정렬한 배열을 출력
				for(int i = 0; i < stutmep2.length ; i++) {
					if(stutmep2[i] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n", i + 1 ,stutmep2[i].get이름(),stutmep2[i].get국어(),stutmep2[i].get영어(),stutmep2[i].get수학(),stutmep2[i].get총점(),stutmep2[i].get평균(),stutmep2[i].get석차());
					}
				}
				
				System.out.println("--------------------------------------------------------------");
				System.out.print("메뉴 : 1. 학생점수 등록 2. 학생점수 삭제 선택> \n"); int ch = sc.nextInt();
				
				if(ch == 1) {// 학생점수 등록
					System.out.println("--------------------------------------------------------------");
					System.out.println("이름: "); String name = sc.next();
					System.out.println("국어: "); int 국어 = sc.nextInt();
					System.out.println("영어: "); int 영어 = sc.nextInt();
					System.out.println("수학: "); int 수학 = sc.nextInt();
					int 총점 = 국어 + 영어 + 수학;
					double 평균 = (double)총점 / 3.0;
					학생 stutemp = new 학생(name, 국어, 영어, 수학, 총점, 평균); 
					
					//저장
					for(int i = 0; i < stulist.length ; i++) {
						if(stulist[i] == null) {
							stulist[i] = stutemp;
							break;
						}
					}
														
					
				}else if(ch == 2) {// 삭제
					System.out.println("삭제시킬번호: "); int index = sc.nextInt();
					stutmep2[index - 1] = null;
					
					for(int i = index - 1; i < stutmep2.length - 1; i++) {
						if(i == stutmep2.length - 1) {
							stutmep2[i] = null;
						}else {
							stutmep2[i] = stutmep2[i + 1];
						}
					}
				
					
					
				}
		
				
				
				
				
				
				
				
				
			}catch(Exception e) {
				System.out.println("에러)) 알수없는 행동입니다" + e);
			}
			
			
			
			
		}
		
	}//ms
}// cs			
