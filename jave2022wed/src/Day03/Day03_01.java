package Day03;

public class Day03_01 {

	public static void main(String[] args) { // me
		
		// 1���� : ��� , �Է�
		// 2���� : ���� , ���(����)
		// ���
			// ��ǻ���� �Ǵܷ�
			// ���ǽ��� true �̸� ���๮ ó��
			// ����
				// 1. IF( ����[true/false] ) ���๮;
				// 2. IF( ���ǽ�) ���๮;
				// 	  ElSE ���๮[����];
				// 3. ���๮�� 2�� �̻��� { } ����
				// 4. ����Ǽ� �ټ��϶� [ ������ �ټ��϶� ]  
				//    IF( ����1 ) { ���๮ } ;
				//	  ELSE IF( ����2 ) { ���๮[��2] }
				// 	  ELSE IF( ����3 ) { ���๮[��3] }
				//	  ELSE IF( ����4 ) { ���๮[��4] }
				//	  ELSE IF( ����5 ) { ���๮[��5] }
				//    ELSE { ���๮[����]; }
				// 5. if ��÷
				//		IF(���ǽ�) {
				//			IF(���ǽ�) { ���๮ };
				//			ELSE {���๮};
				//		}ELSE{
				//			IF(���ǽ�) {���๮};
				//			ELSE {���๮};
				//		}
		
		// ����1 
		if( 3>1 ) System.out.println("��) 3�� 1���� ũ��.");
			// ���࿡ 3 �� 1���� ũ�� ��� �ƴϸ� ���x
			// true �̸� ����
		// ����2
		if( 3>5 ) System.out.println("��) 3�� 5���� ũ��.");
			// ���࿡ 3�� 5���� ũ�� ��� �ƴϸ� ���x
		// ����3
		if ( 3>1 ) System.out.println("��) 3�� 1���� ũ��");
		else System.out.println("��) 3�� 1���� �۴�.");
			// ���࿡ 3�� 1���� ũ�� ��3_1 ���
			// �ƴϸ� ( 3�� �� ������ ) �� 3_2 ���
		if( 3>5 ) { // true ���๮ ����
			System.out.println("true"); System.out.println("3�� 2���� ũ��");
		} // true ���๮ ��
		else {
			System.out.println("false");
			System.out.println("3�� 2���� �۴�.");
		}
		//���� 5
		if( 3>5 ) System.out.println("��) 3�� 5���� ũ��"); //x
		else if( 3>4 ) System.out.println("��) 3�� 4���� ũ��"); //x
		else if ( 3>3) System.out.println("��) 3�� 3���� ũ��"); //x
		else if ( 3>2) System.out.println("��) 3�� 2���� ũ��"); //true
		else System.out.println("true�� ����"); // x
		
		if( 3>5 ) System.out.println("��) 3�� 5���� ũ��"); //x
		if( 3>4 ) System.out.println("��) 3�� 4���� ũ��"); //x
		if ( 3>3) System.out.println("��) 3�� 3���� ũ��"); //x
		if ( 3>2) System.out.println("��) 3�� 2���� ũ��"); //true
		else System.out.println("true�� ����"); // x
		
	}// m c

}// c e
