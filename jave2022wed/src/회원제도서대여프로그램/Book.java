package 회원제도서대여프로그램;

public class Book {
	//1. 필드
	private int ISBN;
	private String 도서명;
	private String 작가;
	private boolean 도서대여여부;
	private String 대여회원;
	
	//2. 생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int iSBN, String 도서명, String 작가, boolean 도서대여여부, String 대여회원) {
		super();
		ISBN = iSBN;
		this.도서명 = 도서명;
		this.작가 = 작가;
		this.도서대여여부 = 도서대여여부;
		this.대여회원 = 대여회원;
	}
	//메소드
	public static void 도서검색() {
		
	}
	public static void 도서목록() {
		for(Book temp : Application.b) {
			if(temp != null) {
				System.out.println(temp.getISBN() +"\t"+ temp.get도서명() +"\t"+ temp.get작가() +"\t"+ temp.is도서대여여부()+"\t"+temp.get대여회원());
			}
		}
	}
	public static boolean 도서대여(String id) {
		System.out.println("IBSN: "); int ibsn = Application.s.nextInt();
		for(Book temp : Application.b){
			if(temp != null && temp.getISBN() == ibsn && temp.is도서대여여부() == false) {
				temp.set도서대여여부(true);
				temp.set대여회원(id);
				return true;
			}
		}
		return false;
	}

	public static boolean 도서반납(String id) {
		System.out.println("IBSN: "); int ibsn = Application.s.nextInt();
		for(Book temp : Application.b){
			if(temp != null && temp.getISBN() == ibsn && temp.get대여회원().equals(id)) {
				temp.set도서대여여부(false);
				temp.set대여회원(null);
				return true;
			}
		}
		return false;
	}
	public static boolean 도서등록() {
		System.out.println("ISBN: "); int isbn = Application.s.nextInt();
		System.out.println("도서명: "); String name = Application.s.next();
		System.out.println("작가: ");  String wr = Application.s.next();
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
	public static void 도서삭제() {
		System.out.println("삭제할 isbn"); int isbn = Application.s.nextInt();
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

	public String get도서명() {
		return 도서명;
	}

	public void set도서명(String 도서명) {
		this.도서명 = 도서명;
	}

	public String get작가() {
		return 작가;
	}

	public void set작가(String 작가) {
		this.작가 = 작가;
	}

	public boolean is도서대여여부() {
		return 도서대여여부;
	}

	public void set도서대여여부(boolean 도서대여여부) {
		this.도서대여여부 = 도서대여여부;
	}

	public String get대여회원() {
		return 대여회원;
	}

	public void set대여회원(String 대여회원) {
		this.대여회원 = 대여회원;
	}
	
	
	
	
	
}
