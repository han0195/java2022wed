package ȸ���������뿩���α׷�;

public class Book {
	//1. �ʵ�
	private int ISBN;
	private String ������;
	private String �۰�;
	private boolean �����뿩����;
	private String �뿩ȸ��;
	
	//2. ������
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int iSBN, String ������, String �۰�, boolean �����뿩����, String �뿩ȸ��) {
		super();
		ISBN = iSBN;
		this.������ = ������;
		this.�۰� = �۰�;
		this.�����뿩���� = �����뿩����;
		this.�뿩ȸ�� = �뿩ȸ��;
	}
	//�޼ҵ�
	public static void �����˻�() {
		
	}
	public static void �������() {
		for(Book temp : Application.b) {
			if(temp != null) {
				System.out.println(temp.getISBN() +"\t"+ temp.get������() +"\t"+ temp.get�۰�() +"\t"+ temp.is�����뿩����()+"\t"+temp.get�뿩ȸ��());
			}
		}
	}
	public static boolean �����뿩(String id) {
		System.out.println("IBSN: "); int ibsn = Application.s.nextInt();
		for(Book temp : Application.b){
			if(temp != null && temp.getISBN() == ibsn && temp.is�����뿩����() == false) {
				temp.set�����뿩����(true);
				temp.set�뿩ȸ��(id);
				return true;
			}
		}
		return false;
	}

	public static boolean �����ݳ�(String id) {
		System.out.println("IBSN: "); int ibsn = Application.s.nextInt();
		for(Book temp : Application.b){
			if(temp != null && temp.getISBN() == ibsn && temp.get�뿩ȸ��().equals(id)) {
				temp.set�����뿩����(false);
				temp.set�뿩ȸ��(null);
				return true;
			}
		}
		return false;
	}
	public static boolean �������() {
		System.out.println("ISBN: "); int isbn = Application.s.nextInt();
		System.out.println("������: "); String name = Application.s.next();
		System.out.println("�۰�: ");  String wr = Application.s.next();
		boolean pass = true;
		for(Book temp : Application.b) {
			if(temp != null && temp.getISBN() == isbn) {
				return false;
			}
		}
		for(int i = 0; i < Application.mem.length ; i++) {
			if(Application.b[i] == null) {
				Application.b[i] = new Book(isbn, name, wr, false, null);
				return true;
			}
		}
		return false;
		

	}
	public static void ��������() {
		System.out.println("������ isbn"); int isbn = Application.s.nextInt();
		int i = 0;
		for(Book temp : Application.b) {
			if(temp != null && temp.getISBN() == isbn) {
				Application.b[i] = null;
			}
			i++;
		}
		
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public String get�۰�() {
		return �۰�;
	}

	public void set�۰�(String �۰�) {
		this.�۰� = �۰�;
	}

	public boolean is�����뿩����() {
		return �����뿩����;
	}

	public void set�����뿩����(boolean �����뿩����) {
		this.�����뿩���� = �����뿩����;
	}

	public String get�뿩ȸ��() {
		return �뿩ȸ��;
	}

	public void set�뿩ȸ��(String �뿩ȸ��) {
		this.�뿩ȸ�� = �뿩ȸ��;
	}
	
	
	
	
	
}
