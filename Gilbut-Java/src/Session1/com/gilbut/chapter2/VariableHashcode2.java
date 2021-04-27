package Session1.com.gilbut.chapter2;
// p.069 null과 blank
public class VariableHashcode2 {

	public static void main(String[] args) {
		String varStr1 = "";
		String varStr2 = null; // 변수 이름만 생성하기 위해 null 값을 대입하는 경우
		
		System.out.println("varStr1 : " + System.identityHashCode(varStr1)); // 405662939
		System.out.println("varStr3 : " + System.identityHashCode(varStr2)); // 0
	}
}
