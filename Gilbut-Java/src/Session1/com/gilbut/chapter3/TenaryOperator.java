package Session1.com.gilbut.chapter3;
// p.087 3항 연산자
public class TenaryOperator {

	public static void main(String[] args) {
		
		// 2개의 매개변수를 받았는지 검사하는 구문
		if(args == null | args.length != 2) { // 매개변수가 null이거나 개수가 2개가 아닐 때
			System.out.println("help : java TenaryOperator number1 number2"); // 2개가 아니면 도움말을 출력하고
			return; // 프로그램 종료
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = (a > b) ? (a - b) : (b - a); // if-else 구문과 비슷함
		
		System.out.println((a> b ) ? "A > B" : "B >= A");
		System.out.println("difference : " + c);
	}
}
