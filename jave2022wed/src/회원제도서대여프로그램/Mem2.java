package 회원제도서대여프로그램;

public class Mem2 {
	private int num;
	private String id;
	private String pw;
	private String name;
	private String phone;
	
	public Mem2() {
		// TODO Auto-generated constructor stub
	}

	public Mem2(int num, String id, String pw, String name, String phone) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
	
	public static boolean 회원가입() {
		System.out.println("id: "); String id = app.s.next();
		for(Mem2 temp : app.m) {
			if(temp != null && temp.getId().equals(id)) {
				return false;
			}
		}
		System.out.println("pw: "); String pw = app.s.next();
		System.out.println("name: "); String name = app.s.next();
		System.out.println("phone: "); String phone = app.s.next();
		
		for(int i = 0 ; i < app.m.length ; i++) {
			if(app.m[i] == null) {
				app.m[i] = new Mem2(i,id,pw,name,phone);
				return true;
			}
		}
		
		return false;
	}
	public static String 로그인() {
		System.out.println("id: "); String id = app.s.next();
		System.out.println("pw: "); String pw = app.s.next();
		
		for(Mem2 temp : app.m) {
			if(temp != null && temp.getId().equals(id)) {
				if(temp.getPw().equals(pw)) {
					return id;
				}
			}
		}
		return null;
	}
	public static void 아이디찾기() {
		System.out.println("name: "); String name = app.s.next();
		System.out.println("phone: "); String phone = app.s.next();
		
		for(Mem2 temp : app.m) {
			if(temp.getName().equals(name)) {
				if(temp.getPhone().equals(phone)) {
					System.out.println("당신의 아이디: " + temp.getId());
					break;
				}
			}
		}
	}
	public static void 비밀번호찾기() {
		System.out.println("id: "); String id = app.s.next();
		System.out.println("phone: "); String phone = app.s.next();
		
		for(Mem2 temp : app.m) {
			if(temp.getId().equals(id)) {
				if(temp.getPhone().equals(phone)) {
					System.out.println("당신의 비밀번호: " + temp.getPw());
					break;
				}
			}
		}
	}

	
}
