package ȸ���������뿩���α׷�;

public class Book2 {
	private int ISBN;
	private String bname;
	private String bwr;
	private boolean �����뿵����;
	private String bid;
	
	public void book2() {
		// TODO Auto-generated method stub

	}

	public Book2(int iSBN, String bname, String bwr, boolean �����뿵����, String bid) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.bwr = bwr;
		this.�����뿵���� = �����뿵����;
		this.bid = bid;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBwr() {
		return bwr;
	}

	public void setBwr(String bwr) {
		this.bwr = bwr;
	}

	public boolean is�����뿵����() {
		return �����뿵����;
	}

	public void set�����뿵����(boolean �����뿵����) {
		this.�����뿵���� = �����뿵����;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
	public static void �����˻�() {
		System.out.println("������: "); String name = app.s.next();
		
		for(Book2 temp : app.b) {
			if(temp.getBname().equals(name)) {
				System.out.println("ISBN\t������\t�۰�\t�����뿩����\t�뿩��");
				System.out.println(temp.getISBN() +"\t"+ temp.getBname()+"\t"+temp.getBwr()+"\t"+temp.is�����뿵����()+"\t"+temp.getBid());
				break;
			}
		}
	}
	public static void �������() {
		System.out.println("ISBN\t������\t�۰�\t�����뿩����\t�뿩��");
		for(Book2 temp : app.b) {
			if(temp != null) {
				System.out.println(temp.getISBN() +"\t"+ temp.getBname()+"\t"+temp.getBwr()+"\t"+temp.is�����뿵����()+"\t"+temp.getBid());
			}
		}
	}
	public static boolean ��������() {
		System.out.println("ISBN: "); int isbn = app.s.nextInt();
		
		for(int i = 0; i < app.b.length; i++) {
			if(app.b[i] != null && app.b[i].getISBN() == isbn) {
				app.b[i] = null;
				return true;
			}
		}
		return false;
	}
	public static boolean �����뿩(String id) {
		System.out.println("�뿩�� ISBN: "); int isbn = app.s.nextInt();
		
		for(int i = 0 ; i < app.b.length ; i++) {
			if(app.b[i] != null && app.b[i].getISBN() == isbn && app.b[i].is�����뿵����() == false) {
				app.b[i].set�����뿵����(true);
				app.b[i].setBid(id);
				return true;
			}
		}
		return false;
		
	}
	public static boolean �����ݳ�(String id) {
		System.out.println("�ݳ��� ISBN: "); int isbn = app.s.nextInt();
		
		for(int i = 0 ; i < app.b.length ; i++) {
			if(app.b[i] != null && app.b[i].getISBN() == isbn && app.b[i].getBid().equals(id)) {
				app.b[i].set�����뿵����(false);
				app.b[i].setBid(null);
				return true;
			}
		}
		return false;
		
	}
	public static boolean �������() {
		System.out.println("ISBN: "); int isbn = app.s.nextInt();
		System.out.println("������: "); String tit = app.s.next();
		System.out.println("�۰�: "); String wr = app.s.next();
		
		for(Book2 temp : app.b) {
			if(temp != null && temp.getISBN() == isbn) {
				return false;
			}
		}
		
		for(int i = 0 ; i < app.b.length ; i++){
			if(app.b[i] == null) {
				app.b[i] = new Book2(isbn, tit, wr, false, null);
				return true;
			}
		}
		return false;
	}
	
	
	
}
