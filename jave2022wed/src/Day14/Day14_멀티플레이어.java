package Day14;

import java.util.Scanner;

public class Day14_멀티플레이어 {
	// 예제 [1.소리재생/중지 2.영상재생/중지]
	// 조건 : 소리 or 영상 재생시에 재 재생시 중지
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean soundsw = true; //실행중인지 체크
		boolean moviesw = true;
	
		while (true) {
			System.out.println("1.소리재생 2.영상재생");
			int ch = s.nextInt();		
			Sound sound = new Sound();
			if(ch == 1) {
				if(soundsw) {
					sound.Soundsw(true);
					sound.start();
					soundsw = false; // 소리종료
				}else {
					sound.Soundsw(false);
					soundsw = true; // 소리재생
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


		
		

