package Day06;

public class Board {
	// * Board 클래스 선언
	
	// 1. 필드
	String title;
	String content;
	String writer;
	String passwerd;
	
	// 2. 생성자
		// 자동 : 오른쪽코드 sorus
	
		// 1. 빈생성자
	Board() {}
	
		// 2. 1개 필드를 받는 생성자
	Board( String title ){
		this.title = title;
		//this.필드명 => 내부변수
		// * 외부로부터 들어온 제목을 내부변수에 저장
	}
	
		// 3. 2개 필드를 받는 생성자
	Board( String title, String content){
		this.title = title;
		this.content = content;
	}
	
		// 4. 3개 필드를 받는 생성자
	Board( String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
		// 5. 4개 필드를 받는 생성자
	Board( String title, String content, String writer, String passwerd){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.passwerd = passwerd;
	}
	
	// 3. 메소드
		
}
