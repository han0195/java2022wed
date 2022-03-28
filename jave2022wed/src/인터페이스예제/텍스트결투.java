package 인터페이스예제;

public class 텍스트결투 implements 조이스틱{
	
	@Override
	public void A버튼(캐릭터 my, 캐릭터 com) {
		System.out.println("공격");
		com.set방어력(com.get방어력() - my.get공격력());
	}
	@Override
	public void B버튼(캐릭터 my, 캐릭터 com) {
		System.out.println("방어");
		
	}
	@Override
	public void C버튼(캐릭터 my, 캐릭터 com) {
		System.out.println("도망");
		
	}
}
