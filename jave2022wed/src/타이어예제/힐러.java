package Å¸ÀÌ¾î¿¹Á¦;

public class Èú·¯ extends Ä³¸¯ÅÍ{
	
	public Èú·¯(int i, int j) {
		super(i, j);
	}
	
	public boolean »ç³É() {
		HP--;
		if(HP == 0) {
			System.out.println("Èú·¯ »ç¸Á");
			return false;
		}else {
			System.out.println("³²Àº HP :" + HP + " Èú·¯ lv"+ lv);
			return true;
		}
	}
}
