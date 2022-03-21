package 회원제도서대여프로그램;

public class Book2 {
	private int ISBN;
	private String bname;
	private String bwr;
	private boolean 도서대영여부;
	private String bid;
	
	public void book2() {
		// TODO Auto-generated method stub

	}

	public Book2(int iSBN, String bname, String bwr, boolean 도서대영여부, String bid) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.bwr = bwr;
		this.도서대영여부 = 도서대영여부;
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

	public boolean is도서대영여부() {
		return 도서대영여부;
	}

	public void set도서대영여부(boolean 도서대영여부) {
		this.도서대영여부 = 도서대영여부;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
	public static void 도서검색() {
		System.out.println("도서명: "); String name = app.s.next();
		
		for(Book2 temp : app.b) {
			if(temp.getBname().equals(name)) {
				System.out.println("ISBN\t도서명\t작가\t도서대여여부\t대여인");
				System.out.println(temp.getISBN() +"\t"+ temp.getBname()+"\t"+temp.getBwr()+"\t"+temp.is도서대영여부()+"\t"+temp.getBid());
				break;
			}
		}
	}
	public static void 도서목록() {
		System.out.println("ISBN\t도서명\t작가\t도서대여여부\t대여인");
		for(Book2 temp : app.b) {
			if(temp != null) {
				System.out.println(temp.getISBN() +"\t"+ temp.getBname()+"\t"+temp.getBwr()+"\t"+temp.is도서대영여부()+"\t"+temp.getBid());
			}
		}
	}
	public static boolean 도서삭제() {
		System.out.println("ISBN: "); int isbn = app.s.nextInt();
		
		for(int i = 0; i < app.b.length; i++) {
			if(app.b[i] != null && app.b[i].getISBN() == isbn) {
				app.b[i] = null;
				return true;
			}
		}
		return false;
	}
	public static boolean 도서대여(String id) {
		System.out.println("대여할 ISBN: "); int isbn = app.s.nextInt();
		
		for(int i = 0 ; i < app.b.length ; i++) {
			if(app.b[i] != null && app.b[i].getISBN() == isbn && app.b[i].is도서대영여부() == false) {
				app.b[i].set도서대영여부(true);
				app.b[i].setBid(id);
				return true;
			}
		}
		return false;
		
	}
	public static boolean 도서반납(String id) {
		System.out.println("반납할 ISBN: "); int isbn = app.s.nextInt();
		
		for(int i = 0 ; i < app.b.length ; i++) {
			if(app.b[i] != null && app.b[i].getISBN() == isbn && app.b[i].getBid().equals(id)) {
				app.b[i].set도서대영여부(false);
				app.b[i].setBid(null);
				return true;
			}
		}
		return false;
		
	}
	public static boolean 도서등록() {
		System.out.println("ISBN: "); int isbn = app.s.nextInt();
		System.out.println("도서명: "); String tit = app.s.next();
		System.out.println("작가: "); String wr = app.s.next();
		
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
