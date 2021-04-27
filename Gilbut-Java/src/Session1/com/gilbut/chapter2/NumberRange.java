package Session1.com.gilbut.chapter2;
// p.053 각 정수형마다 표현 가능한 최솟값과 최댓값
public class NumberRange {

	public static void main(String[] args) {
		System.out.println("byte range : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); // 최솟값, 최댓값을 의미하는 상수
		System.out.println("short range : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int range : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long range : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

		byte vlu = 0;
		// 0부터 300 미만까지 루프 돌림
		for(int i = 0; i < 300; i++) {
			System.out.print(vlu++ + " ");
		} // 0~127 까지 출력된 후 오버플로우 발생 -> 나머지는 -128 -127 ... 0 1 2 ... 43까지 출력함
	}

}
