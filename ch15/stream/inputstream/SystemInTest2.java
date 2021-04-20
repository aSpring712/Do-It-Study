package ch15.stream.inputstream;
//p. 516 문자 여러 개를 입력받기
public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			while((i = System.in.read()) != -1) { // Enter가 입력될 때까지 반복 수행
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
