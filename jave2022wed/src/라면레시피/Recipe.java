package 라면레시피;

public class Recipe {
	//1. 필드
		String name = " ";
		String 물양 = " "; // 물양을 저장할수있는 필드 선언
		String 시간 = " ";	// 시간을 저장할수있는 필드 선언
		String 추가재료 = " ";
	//2. 생성자
		public Recipe(String name, String 물양, String 시간, String 추가재료) { // 3개의 인자를 받을수있는 생성자 생성
			this.name = name;// 인자와 필드를 구분하기위해 this로 선언
			this.물양 = 물양;// 인자와 필드를 구분하기위해 this로 선언
			this.시간 = 시간;// 인자와 필드를 구분하기위해 this로 선언
			this.추가재료 = 추가재료; // 인자와 필드를 구분하기위해 this로 선언
		}
}// ce
