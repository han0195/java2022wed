package Day10;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("rParent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
