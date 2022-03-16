package Day11;

public class MysqlDao implements DateAccessObject{
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(" MysqlDao DB 검색");
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(" MysqlDao DB에 삽입");
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MysqlDao DB 수정");
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(" MysqlDao DB에서 삭제");
	}
}
