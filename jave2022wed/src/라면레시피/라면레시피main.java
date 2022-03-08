package 라면레시피;

import java.util.Scanner;

public class 라면레시피main {
	/*	참조횟수 : 4
	 *
	 *  라면 클래스 만들기
	 * 1. 초기메뉴 (1.라면레시피등록 2.라면목록)
	 * 2. 라면목록 목록 다뜬다음
	 * 		(1.라면레시피 보기 2.라면레시피 삭제 3.라면레시피 수정)
	 * 			
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);// 입력 객체 선언
		
		Recipe[] recipe = new Recipe[100]; // 레시피를 담기위한 배열선언
		int 마스터키 = 1234;
		
		while (true) { // 프로그램 실행
			System.out.println("---------------------------라면 레시피------------------------------");
			System.out.println("1.라면레시피 등록 2.라면목록"); int ch = scanner.nextInt();// 선택 입력받기
			
			if(ch == 1) {// 1번선택시 라면레시피 등록 메뉴
				System.out.println("-----------------------레시피 등록-----------------------");
				System.out.println("레시피의 이름을 입력해주세요: "); 	String name = scanner.next(); // 레시피이름 입력받기
				System.out.println("물양을 입력해주세요: ");		 	String 물양 = scanner.next(); // 물양 입력받기
				System.out.println("몇분조리할지 입력해주세요: ");		String time = scanner.next(); // 시간 입력받기
				System.out.println("추가재료를 입력주세요 없을시 0입력: ");			String add = scanner.next(); // 추가재료 입력받기
				Recipe 레시피 = new Recipe(name, 물양, time, add); // 레시피 객체생성
				for(int i = 0; i < recipe.length; i++) { // 빈 문자열 찾아서 저장
					if(recipe[i] == null) { // 빈문자열이라면
						recipe[i] = 레시피; // recipe[i] 배열에 레시피 저장
						break; // 저장했으면 끝내기
					}
				}// 저장 for end
			}// 1번선택시 라면레시피 등록 메뉴 end
			else if ( ch == 2) {// 2번선택시 라면목록
				System.out.println("-----------------------------------라면 목록-----------------------------------");
				System.out.println("번호\t이름");
				//라면레시피 목록
				for(int i = 0; i < recipe.length; i++) { // 레시피 null 아니라면 전부 뜸
					if(recipe[i] != null) {// recipe[i] null 아니라면
						System.out.printf("%s\t%s\n", i, recipe[i].name);// 레시피 출력
					}
				}// null아닌 찾는 for문 end
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("1.라면레시피 보기 2.라면레시피 삭제 3.라면레시피 수정"); int ch2 = scanner.nextInt(); // 메뉴선택 입력받ㄱ기
				
				if(ch2 == 1){//1, 라면레시피 보기
					System.out.println("보고싶은 인덱스를 입력: "); int index = scanner.nextInt(); // 인덱스 입력받기
					if(recipe[index] != null) {	// 입력받은 인덱스가 null 아니라면
						System.out.println("레시피이름: " + recipe[index].name); //이름 출력
						System.out.println("물양: " + recipe[index].물양);		 //물양 출력
						System.out.println("조리시간: " + recipe[index].시간);  //시간 출력
						System.out.println("추가재료 없을시 0: " + recipe[index].추가재료); //추가재료출력
					}else {// 입력받은 인덱스가 null 라면
						System.out.println("해당 레시피가없습니다.");
					}
				}//1, 라면레시피 보기 end
				else if(ch2 == 2){//2. 라면레시피 삭제
					System.out.println("--------------------------------삭제---------------------------------");
					System.out.println("삭제할 레시피인덱스를 입력: "); int index2 = scanner.nextInt(); // 삭제할 인덱스 입력받기
					System.out.println("마스터키를 입력해주세요: "); int key = scanner.nextInt(); // key 입력받기
					if(마스터키 == key) { // 마스터키랑 키가 번호가 일치하는지
						recipe[index2] = null;	//인덱스 비우고
						System.out.println("삭제 성공");
						if(index2 != recipe.length - 1) { // index2가 recipe길이보다 크지않다면 
							recipe[index2] = recipe[index2 + 1];// 하나를 앞으로 땡기고 
							recipe[index2 + 1] = null;			// 뒤에 인덱스를 삭제
						}else {
							recipe[index2] = null;				// 아니라면 그냥 삭제
						}
					}// if e
					else {// 마스터키가 일치하지않는다면
						System.out.println("마스터키가 일치하지 않습니다");
					}
					
				}//2. 라면레시피 삭제 end
				else if(ch2 == 3){//3. 라면레시피 수정
					System.out.println("---------------------------수정-------------------------------");
					System.out.println("수정할 인덱스를 선택: "); int index = scanner.nextInt(); // 인덱스 입력받기
					if(recipe[index] != null) { // 해당인덱스가 null 값이아니라면
						System.out.println("이름: "); String name = scanner.next();
						System.out.println("물양: ");	 String of = scanner.next();
						System.out.println("시간: "); String time = scanner.next();
						System.out.println("추가재료: "); String add = scanner.next();
						
						Recipe temp = new Recipe(name, of, time, add);
						recipe[index] = temp;
					}else {//해당인덱스가 없다면
						System.out.println("해당 레시피가없습니다.");
					}
					
					
					
				}//3. 라면레시피 수정 end
				else {//그외
					System.out.println("에러))알수없는 행동입니다");
				}//그외 
				
			}// 2번선택시 라면목록 end
			else {//그외
				System.out.println("에러))알수없는 행동입니다");
			}
		}
	}// me	

}// ce
