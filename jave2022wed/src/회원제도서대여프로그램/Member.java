package ȸ���������뿩���α׷�;

public class Member {
	//�ʵ�
	private int ��ȣ;
	private String id;
	private String pw;
	private String name;
	private String phone;
	//������
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(int ��ȣ, String id, String pw, String name, String phone) {
		super();
		this.��ȣ = ��ȣ;
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
	//�޼ҵ�
	public static boolean ȸ������() {
		System.out.println("id: "); String id = Application.s.next();
		for(int i = 0 ; i < Application.mem.length ; i++) {
			if(Application.mem[i] !=null && Application.mem[i].getId().equals(id)) {
				System.out.println("���̵��ߺ�: ");
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
	public static String �α���() {
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
	public static void ���̵�ã��() {
		System.out.println("�̸�: "); String name = Application.s.next();
		System.out.println("��ȭ��ȣ: "); String phone = Application.s.next();
		for(Member temp : Application.mem) {
			if(temp != null && temp.getName().equals(name)) {
				if(temp.getPhone().equals(phone)) {
					System.out.println("���̵�: " + temp.getId());
					break;
				}
			}
		}	
	}
	
	public static void ��й�ȣã��() {
		System.out.println("id: "); String id = Application.s.next();
		System.out.println("��ȭ��ȣ: "); String phone = Application.s.next();
		for(Member temp : Application.mem) {
			if(temp != null && temp.getId().equals(id)) {
				if(temp.getPhone().equals(phone)) {
					System.out.println("��й�ȣ: " + temp.getPw());
					break;
				}
			}
		}	
	}
	public int get��ȣ() {
		return ��ȣ;
	}
	public void set��ȣ(int ��ȣ) {
		this.��ȣ = ��ȣ;
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
