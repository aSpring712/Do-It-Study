package Session1.com.gilbut.chapter3;
// p.074
public class UnaryOperator {
	public static void main(String[] args) {
		int vluAfter = 0;
		long vluBefore = 0;
		char chrAfter = 'A';
		
		System.out.println("First reference : " + vluAfter++); // 0
		System.out.println("First reference : " + --vluBefore); // -1
		System.out.println("First reference : " + chrAfter++); // A
		
		System.out.println("Second reference : " + vluAfter); // 1
		System.out.println("Second reference : " + vluBefore); // -1
		System.out.println("Second reference : " + chrAfter); // B
	}
}
