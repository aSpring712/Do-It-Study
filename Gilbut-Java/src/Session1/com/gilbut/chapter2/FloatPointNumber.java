package Session1.com.gilbut.chapter2;
// p.060
public class FloatPointNumber {

	public static void main(String[] args) {
		char TAB_CHAR = '\t';
		
		float price = 2.99f;
		double pi = 3.1415926535897d;
		double tax = 0.299e1;
		
		System.out.println("Variable price" + TAB_CHAR + ": " + price);
		System.out.println("Variable pi" + TAB_CHAR + ": " + pi);
		System.out.println("Variable tax" + TAB_CHAR + ": " + tax);
		
		float maxFloatValue = Float.MAX_VALUE;
		float minFloatValue = Float.MIN_VALUE;
		System.out.println("Overflow" + TAB_CHAR + ": " + maxFloatValue * 10);
		System.out.println("Underflow" + TAB_CHAR + ": " + minFloatValue / 100);
	}
}
