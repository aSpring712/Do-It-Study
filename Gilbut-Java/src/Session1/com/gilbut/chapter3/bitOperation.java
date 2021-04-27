package Session1.com.gilbut.chapter3;
// p.082 비트연산자
public class bitOperation {

	public static void main(String[] args) {
		int b1 = 0B0010; // 0B -> 2진수 리터럴
		int b2 = 0B0101;
		int b3 = 0B1111;
		
		int rtAndOp = b1 & b3; // 비트 AND 연산자
		int rtOrOp = b1 | b2; // 비트 OR 연산자
		int rtXorOp = b1 ^ b3; // 비트 XOR 연산자
		
		System.out.println("b1 AND b3 : " + Integer.toBinaryString(rtAndOp)); // 0010
		System.out.println("b1 OR b2 : " + Integer.toBinaryString(rtOrOp)); // 0111
		System.out.println("b1 XOR b3 : " + Integer.toBinaryString(rtXorOp)); // 1101

	}

}
