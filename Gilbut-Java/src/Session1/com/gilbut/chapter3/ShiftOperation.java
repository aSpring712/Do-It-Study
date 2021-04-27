package Session1.com.gilbut.chapter3;
// p.085
public class ShiftOperation {

	public static void main(String[] args) {
		int x = -5;
		int y = 6;
		
		int rt1 = x << 4; // -5에 대한 left 시프트 연산
		int rt2 = x >> 2; // -5에 대한 right 시프트 연산
		int rt3 = y << 3; // 6에 대한 left 시프트 연산
		int rt4 = y >> 1; // 6에 디한 right 시프트 연산
		int rt5 = y >>> 3; // 6에 대한 unsigned right 시프트 연산
		
		System.out.println("Binary x : " + Integer.toBinaryString(x)); // -5의 이진수 표기 : 11111111111111111111111111111011
		System.out.println("Binary y : " + Integer.toBinaryString(y)); // 6의 이진수 표기 : 110
		
		System.out.println("left : " + rt1 + ", " + Integer.toBinaryString(rt1)); // -80, 11111111111111111111111110110000
		System.out.println("right : " + rt2 + ", " + Integer.toBinaryString(rt2)); // -2, 11111111111111111111111111111110
		System.out.println("left : " + rt3 + ", " + Integer.toBinaryString(rt3)); // 48, 110000
		System.out.println("right : " + rt4 + ", " + Integer.toBinaryString(rt4)); // 3, 11
		System.out.println("unsigned right : " + rt5 + ", " + Integer.toBinaryString(rt5)); // 0, 0
	}
}
