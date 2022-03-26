package 인터페이스;

import java.util.Scanner;

public class run {
	
	public static void main(String[] args) {
		
		옛날차 옛날차 = new 옛날차();
		보통차 보통차 = new 보통차();
		스포츠카 스포츠카 = new 스포츠카();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.move"); int ch = s.nextInt();
			
			옛날차.move(); 	보통차.move();	스포츠카.move();
			
			System.out.println("옛날차 위치: " + 옛날차.get위치() +" | "+ "옛날차 비용: " + 옛날차.get비용());
			System.out.println("보통차 위치: " + 보통차.get위치() +" | "+ "보통차 비용: " + 보통차.get비용());
			System.out.println("스포츠카 위치: " + 스포츠카.get위치() +" | "+ "스포츠카 비용: " + 스포츠카.get비용());
	
		}
	}
}
