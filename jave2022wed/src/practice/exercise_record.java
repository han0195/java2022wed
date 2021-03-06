package practice;
import java.util.Scanner;

public class exercise_record {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);// 입력객체 받기
		
		String[][] mem = new String[100][4];// id /pw /이름 /불륨  : 회원 2차원배열
		String[][] bor = new String[100][5];// id / 이름 / 횟수 / 세트 / 무게 : 기록 2차원배열 
		int 이전불륨 = 0;
		
		while (true) {// 프로그램실행
			try {
				System.out.println("운동하자!! 어플");
				System.out.println("1.회원가입 2.로그인"); int ch = s.nextInt();
				
				if(ch == 1) {
					System.out.println("***** 회원가입 *****");
					System.out.println("아이디: ");		String id = s.next(); // id 입력받기
					System.out.println("비밀번호: ");		String pw = s.next();	// pw 입력받기
					System.out.println("이름: ");			String name = s.next(); // name 입력받기
					boolean pass = true;
					//중복체크
					for(int i = 0; i < mem.length ; i++) { // mem 길이만큼 반복하면서
						if(mem[i][0] != null && mem[i][0].equals(id)) {			// id 같다면
							System.out.println("아이디 중복"); 
							pass = false;					// 저장 x
							break;							// 중복체크 반복문 빠져나오기
						}
					}
					// 저장
					if(pass) {// 만약 pass true라면
						for(int i = 0; i < mem.length ; i++) { // mem 길이만큼반복
							if(mem[i][0] == null) {				// mem이 null 이라면
								mem[i][0] = id;				//3개값 저장
								mem[i][1] = pw;
								mem[i][2] = name;
								mem[i][3] = "0";
								System.out.println("회원가입 성공");
								break;						// 반복문 빠져나오기
							}
						}
						
					}// 저장 if 문 end
				}else if(ch == 2) {
					System.out.println("아이디: ");   	String id = s.next(); // id 입력받기
					System.out.println("비밀번호: ");		String pw = s.next(); // pw 입력받기
					boolean pass = false; // pass 값 등록
					//중복체크
					for(int i = 0; i < mem.length ; i++) { // mem 배열길이만큼 반복
						if(mem[i][0] != null && mem[i][0].equals(id)) {// 아이디가 같으면
							if(mem[i][0] != null && mem[i][1].equals(pw)) { // 비밀번호가 같으면
								pass = true; // 로그인 통과 true
							}
						}
					}// 중복체크 for문 종료
					if(pass == false) {System.out.println("로그인실패");}
					while (pass) {// 로그인시 메뉴 무한반복
						System.out.println("***** 운동기록 *****");
						//출력
						System.out.println("이름\t\t횟수\t\t세트\t\t1회무게");
						for(int i = 0; i < bor.length ; i++) { // bor길이 만큼 반복
							if(bor[i][0] != null && bor[i][0].equals(id) ) { // id 값이 일치하면 기록 보여주기
								System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", bor[i][1],bor[i][2],bor[i][3],bor[i][4]);
							}
						}// 출력 for문 end
						System.out.println("-------------------");
						System.out.println("1.운동추가 / 2.운동삭제 / 3.운동종료 / 4.로그아웃"); int ch2 = s.nextInt();
						
						if(ch2 == 1) { // 운동 추가
							System.out.println("***** 운동추가 *****");
							System.out.println("운동이름: "); String name = s.next(); // 이름입력받기
							System.out.println("횟수: ");	String count = s.next();// 횟수입력받기
							System.out.println("세트: ");	String set = s.next();// 세트입력받기
							System.out.println("1회무게: ");  String weight = s.next();// 무게입력받기
							//기록저장 총합 무게를 정하기 위해 int형으로 변환
							int 횟수 = Integer.parseInt(count);
							int 세트 = Integer.parseInt(set);
							int 무게 = Integer.parseInt(weight);
							int 총합 = (무게 * 횟수) * 세트;
							
							for(int i = 0; i < bor.length ; i++) { // bor 길이만큼 반복
								if(bor[i][0] == null) { // null 이라면
									bor[i][0] = id;	//저장
									bor[i][1] = name;
									bor[i][2] = count;
									bor[i][3] = set;
									bor[i][4] = weight;
									
									break;
								}
							}// 기록저장 end
							for(int i = 0; i < bor.length ; i++) {
								if(mem[i][0] != null && mem[i][0].equals(id)) {
									mem[i][3] = Integer.toString(총합);
								}
							}
						}else if(ch2 == 2) {// 운동 삭제
							System.out.println("***** 운동삭제 *****");
							System.out.println("운동이름: "); String name = s.next(); // 이름입력받기
							//기록삭제
							for(int i = 0; i < bor.length ; i++) { // bor 길이만큼 반복
								if(bor[i][0] != null && bor[i][1].equals(name) && bor[i][0].equals(id)) { // 동일한 id 의 운동이있으면
									
									bor[i][0] = null; //초기화
									bor[i][1] = null;
									bor[i][2] = null;
									bor[i][3] = null;
									bor[i][4] = null;
									break;
								}
							}// 기록삭제 end
						}else if(ch2 == 3) {// 운동 종료
							System.out.println("***** 운동 종료 *****");
							
							for(int i = 0; i < mem.length ; i++) { // mem 길이만큼 반복
								if(mem[i][0] != null && mem[i][0].equals(id)) { // 동일한 id 같 찾기
									System.out.println(mem[i][2] + "님의 총운동 불륨은 : " + mem[i][3] + "Kg"); // 출력
									int 현재불륨 = Integer.parseInt(mem[i][3]); // int형변환 
									if(현재불륨 > 이전불륨) {
										System.out.println("어제보다" +(현재불륨 - 이전불륨)+"kg 성장하셨습니다");
									}else if(현재불륨 < 이전불륨) {
										System.out.println("어제보다" +(현재불륨 - 이전불륨)+"kg 도태되셨습니다");
									}
									
									이전불륨 = Integer.parseInt(mem[i][3]); //현재불륨과 이전 불륨을 비교하기우ㅣ해 저장
									mem[i][3] = null;						//다음에 현재불륨 의 저장하기위해 무게의 해당하는ㄴ 인덱스 초기화
									// 얼마나 성장했는지 뜨고 bor 배열 초기화 
									for(int j = 0; j < bor.length ; j++) { // bor 길이만큼 반복
										if(bor[j][0] != null && bor[j][0].equals(id)) { // 동일한 id 의 운동이있으면
											
											bor[j][0] = null; //초기화
											bor[j][1] = null;
											bor[j][2] = null;
											bor[j][3] = null;
											bor[j][4] = null;
		
										}
									}
								}					
							}// 운동종료 for 문 end
							
						}else if(ch2 == 4) {// 로그아웃
							break;
						}else {
							System.out.println("알수없는 행동입니다");
						}
						
						
						 
					}//로그인시 메뉴 무한반복 end
				
				}else {
					System.out.println("알수없는 행동");
				}
				
				
				
				
			}catch(Exception e) {
				System.out.println("시스템 에러 [관리자 호출]요망" + e);
			}	
		}// while end
		
		
		

	}// me

}// ce
