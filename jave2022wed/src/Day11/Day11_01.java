package Day11;

import javax.management.loading.PrivateClassLoader;

public class Day11_01 {

		// p.386 Ȯ�ι���
			// 1. 3 [ �������̽��� ��� : 1.����ʵ� 2.�߻�޼ҵ�* 3.����Ʈ�޼ҵ� 4.�����޼ҵ�]
			// 2. 4 [ �������̽� ���� = ������ü ]
				// ������ü = Ŭ������ implements �� ��ü
		
		private static void printSound ( Soundable soundable) { 
//	    ���������� 	����		��ȯ �޼ҵ�� 		�μ�
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
						// ������ü
			
			Soundable soundable = new Cat();
			Soundable[] soundables = new Cat[100];
			
			//4.
				//Dao : DB���ٰ�ü 	Dto : �������̵�
			
			dbWork( new OracleDao());
			dbWork( new MysqlDao());
			
			//5. �͸�ü [ �������̽��� ���� ���� ]
				// ������ü : �������̽� ��ü�� = new Ŭ������();
				// �͸�ü : �������̽� ��ü�� = new �������̽�( {�����ϱ�} );
			Action action = new Action() {
				@Override
				public void work() {
					System.out.println("���縦 �մϴ�");
					
				}
			}; // ������
			
			action.work();
			
			
		}
			



}
