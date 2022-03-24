package Å¸ÀÌ¾î¿¹Á¦;

public class ±Ã¼ö extends Ä³¸¯ÅÍ{
	
	public ±Ã¼ö(int i, int j) {
		super(i, j);
	}
	
	public boolean »ç³É() {
		HP--;
		if(HP == 0) {
			System.out.println("±Ã¼ö »ç¸Á");
			return false;
		}else {
			System.out.println("³²Àº HP :" + HP + " ±Ã¼ö lv" + lv);
			return true;
		}
	}
}
