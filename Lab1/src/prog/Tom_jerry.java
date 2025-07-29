package prog;

public class Tom_jerry {
	public static void main(String[] args) {
		int jerry=5;
		int tom=3;
		System.out.println("before swap tom has "+tom);
		System.out.println("before swap jerry has "+jerry);
	  tom=jerry+tom;
	  jerry=tom-jerry;
	  tom=tom-jerry;
		System.out.println("after swap tom has "+tom);
		System.out.println("after swap jerry has "+jerry);


	}
}
