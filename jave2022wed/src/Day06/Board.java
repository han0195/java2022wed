package Day06;

public class Board {
	// * Board Ŭ���� ����
	
	// 1. �ʵ�
	String title;
	String content;
	String writer;
	String passwerd;
	
	// 2. ������
		// �ڵ� : �������ڵ� sorus
	
		// 1. �������
	Board() {}
	
		// 2. 1�� �ʵ带 �޴� ������
	Board( String title ){
		this.title = title;
		//this.�ʵ�� => ���κ���
		// * �ܺηκ��� ���� ������ ���κ����� ����
	}
	
		// 3. 2�� �ʵ带 �޴� ������
	Board( String title, String content){
		this.title = title;
		this.content = content;
	}
	
		// 4. 3�� �ʵ带 �޴� ������
	Board( String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
		// 5. 4�� �ʵ带 �޴� ������
	Board( String title, String content, String writer, String passwerd){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.passwerd = passwerd;
	}
	
	// 3. �޼ҵ�
		
}
