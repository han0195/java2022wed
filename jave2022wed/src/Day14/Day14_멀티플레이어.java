package Day14;

import java.util.Scanner;

public class Day14_��Ƽ�÷��̾� {
	// ���� [1.�Ҹ����/���� 2.�������/����]
	// ���� : �Ҹ� or ���� ����ÿ� �� ����� ����
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean soundsw = true; //���������� üũ
		boolean moviesw = true;
	
		while (true) {
			System.out.println("1.�Ҹ���� 2.�������");
			int ch = s.nextInt();		
			Sound sound = new Sound();
			if(ch == 1) {
				if(soundsw) {
					sound.Soundsw(true);
					sound.start();
					soundsw = false; // �Ҹ�����
				}else {
					sound.Soundsw(false);
					soundsw = true; // �Ҹ����
				}
				
			
			}else if(ch == 2) {
				Movie movie = new Movie();
				if(moviesw) {
					movie.Moviestop(true);
					movie.start();
					moviesw = false;
				}else {
					movie.Moviestop(moviesw);
					moviesw = false;
				}
			}
		}
	}
}


		
		

