package Session1.com.gilbut.chapter2;
// p.056 정수 12를 각 진수법에 따라서 표현하고 콘솔 화면에 출력
public class ScaleExample {

	public static void main(String[] args) {
		int decimal = 12; 		// 10진수
		int hexadecimal = 0XC; 	// 16진수
		int octet = 014; 		// 8진수
		int binary = 0B1100; 	// 2진수
		
		System.out.println(decimal);
		System.out.println(hexadecimal);
		System.out.println(octet);
		System.out.println(binary);
	}
}
