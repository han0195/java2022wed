package Day11;

public class OracleDao implements DateAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(" 오라클 DB 검색");
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(" 오라클 DB에 삽입");
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(" 오라클 DB 수정");
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(" 오라클 DB에서 삭제");
	}
	
	
	
	
	 
}
