package Session1.com.gilbut.chapter3;

public class HelloWorld {

	public static void main(String[] args) {
		
		if(args != null && args.length > 0) { // Run Configration 설정해야 함
	 // if(!(args == null || args.length <= 0)) 둘 다 동일한 결과값을 반환
			for(String arg : args) {
				System.out.println(arg);
			}
		}
		
	}
}
