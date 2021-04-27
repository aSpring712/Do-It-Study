package Session1.com.gilbut.chapter2;
// p.066
public class VariableHashcode {

	public static void main(String[] args) {
		long varLong1 = 32L;
		long varLong2 = 32L;
		int varInt1 = 32;
		System.out.println("varLong1 : " + System.identityHashCode(varLong1));
		System.out.println("varLong2 : " + System.identityHashCode(varLong2));
		System.out.println("varInt1 : " + System.identityHashCode(varInt1));
		
		int varInt2 = (int) varLong2;
		long varLong3 = (long) varInt1;
		System.out.println("varInt2  : " + System.identityHashCode(varInt2));
		System.out.println("varLong3 : " + System.identityHashCode(varLong3));
		
		String str1 = String.valueOf(varLong1);
		String str2 = String.valueOf(varInt1);
		String str3 = String.valueOf(varLong1);
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		
		/* System.identifyHashCode() 메소드 : JVM 메모리 영역에 저장된 변수의 위치를 반환 -> 해시 코드(Hash Code) : JVM 메모리의 주소명(실제 주소X) */
	}

}
