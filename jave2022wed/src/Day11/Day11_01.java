package Day11;

import javax.management.loading.PrivateClassLoader;

public class Day11_01 {

		// p.386 확인문제
			// 1. 3 [ 인터페이스의 멤버 : 1.상수필드 2.추상메소드* 3.디폴트메소드 4.정적메소드]
			// 2. 4 [ 인터페이스 변수 = 구현객체 ]
				// 구현객체 = 클래스의 implements 한 객체
		
		private static void printSound ( Soundable soundable) { 
//	    접근제한자 	정적		반환 메소드명 		인수
			System.out.println(soundable.sound());
		}
		
		public static void dbWork (DateAccessObject date) {
			date.delete();
			date.insert();
			date.update();
			date.select();
		}
		
		public static void main(String[] args) {
			
			printSound( new Cat() ); printSound( new Dog() );
						// 구현객체
			
			Soundable soundable = new Cat();
			Soundable[] soundables = new Cat[100];
			
			//4.
				//Dao : DB접근객체 	Dto : 데이터이동
			
			dbWork( new OracleDao());
			dbWork( new MysqlDao());
			
			//5. 익명객체 [ 인터페이스가 직접 구현 ]
				// 구현객체 : 인터페이스 객체명 = new 클래스명();
				// 익명객체 : 인터페이스 객체명 = new 인터페이스( {구현하기} );
			Action action = new Action() {
				@Override
				public void work() {
					System.out.println("복사를 합니다");
					
				}
			}; // 구현끝
			
			action.work();
			
			
		}
			



}
