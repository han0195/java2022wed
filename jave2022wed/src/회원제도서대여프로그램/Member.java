package 회원제도서대여프로그램;

public class Member {
	//필드
	private int 번호;
	private String id;
	private String pw;
	private String name;
	private String phone;
	//생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(int 번호, String id, String pw, String name, String phone) {
		super();
		this.번호 = 번호;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	public Member(String id, String pw, String name, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	//메소드
	public static boolean 회원가입() {
		System.out.println("id: "); String id = Application.s.next();
		for(int i = 0 ; i < Application.mem.length ; i++) {
			if(Application.mem[i] !=null && Application.mem[i].getId().equals(id)) {
				System.out.println("아이디중복: ");
				return false;
			}
		}
		System.out.println("pw: ");	String pw = Application.s.next();
		System.out.println("name: "); String name = Application.s.next();
		System.out.println("phone: "); String phone = Application.s.next();
		
		for(int i = 0 ; i < Application.mem.length ; i++) {
			if(Application.mem[i] == null) {
				Application.mem[i] = new Member(i, id, pw, name, phone);
				return true;
			}
		}
		
		return false;
	}
	public static String 로그인() {
		System.out.println("id: "); String id = Application.s.next();
		System.out.println("pw: "); String pw = Application.s.next();
		
		for(int i = 0; i < Application.mem.length ; i++) {
			if(Application.mem[i] != null && Application.mem[i].getId().equals(id)) {
				if(Application.mem[i] != null && Application.mem[i].getPw().equals(pw)) {
					return id;
				}
			}
		}
		
		
		return null;
	}
	public static void 아이디찾기() {
		System.out.println("이름: "); String name = Application.s.next();
		System.out.println("전화번호: "); String phone = Application.s.next();
		for(Member temp : Application.mem) {
			if(temp != null && temp.getName().equals(name)) {
				if(temp.getPhone().equals(phone)) {
					System.out.println("아이디: " + temp.getId());
					break;
				}
			}
		}	
	}
	
	public static void 비밀번호찾기() {
		System.out.println("id: "); String id = Application.s.next();
		System.out.println("전화번호: "); String phone = Application.s.next();
		for(Member temp : Application.mem) {
			if(temp != null && temp.getId().equals(id)) {
				if(temp.getPhone().equals(phone)) {
					System.out.println("비밀번호: " + temp.getPw());
					break;
				}
			}
		}	
	}
	public int get번호() {
		return 번호;
	}
	public void set번호(int 번호) {
		this.번호 = 번호;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
