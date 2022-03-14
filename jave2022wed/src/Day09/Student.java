package Day09;

public class Student extends People{
			//서브클래스 상속  슈퍼클래스
	// 1. 필드
	public int studneNo;  // 학생번호
	// 2. 생성자
	public Student(String name, String ssn, int studenNO) {
		// 부모클래스내 멤버 필드 초기화[값 넣기]
		// 1. 필드에 접근
		//this.name = name;
		//this.ssn = ssn;
		// 2. 생성자의 접근
		super(name, ssn);	
		this.studneNo = studenNO;
	}
	// 3. 메소드

}
