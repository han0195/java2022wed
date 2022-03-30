package 개인과제키오스크파일처리;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface 키오스크인터 {
	
	public void 결제();
	public boolean 상품추가(String name, String 점포종류, int price, int 재고) throws FileNotFoundException, IOException;
	void 제품목록(String 점포) throws IOException;
	boolean 장바구니(String 제품명, String 점포);
}
