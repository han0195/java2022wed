package �������̽�;

import java.util.Scanner;

public class run {
	
	public static void main(String[] args) {
		
		������ ������ = new ������();
		������ ������ = new ������();
		������ī ������ī = new ������ī();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.move"); int ch = s.nextInt();
			
			������.move(); 	������.move();	������ī.move();
			
			System.out.println("������ ��ġ: " + ������.get��ġ() +" | "+ "������ ���: " + ������.get���());
			System.out.println("������ ��ġ: " + ������.get��ġ() +" | "+ "������ ���: " + ������.get���());
			System.out.println("������ī ��ġ: " + ������ī.get��ġ() +" | "+ "������ī ���: " + ������ī.get���());
	
		}
	}
}
