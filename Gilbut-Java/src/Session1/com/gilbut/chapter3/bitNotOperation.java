package Session1.com.gilbut.chapter3;
// p.081 비트 NOT 연산자
public class bitNotOperation {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("Variable i (Decimal) : " + i); // 10진수 i
		System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i)); // 2진수로 변환한 i
		
		i = ~i; // NOT 연산
		System.out.println("Variable i (Decimal) : " + i); // 10진수 i
		System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i)); // 2진수 i

	}

}
