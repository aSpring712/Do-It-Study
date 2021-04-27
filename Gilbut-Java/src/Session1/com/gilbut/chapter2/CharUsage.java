package Session1.com.gilbut.chapter2;
// p.058 특수 문자를 사용하는 방법
public class CharUsage {

	public static void main(String[] args) {
		char tab = '\t'; // 문자형(char)을 의미하는 홑따옴표
		char linefeed = '\n'; // 특수문자를 의미하는 역슬래시
		char cReturn = '\r';
		char dQuote = '\"';
		char sQuote = '\'';
		char bSlash = '\\';
		
		System.out.println("1> ABCD" + tab + "EFG");
		System.out.println("2> ABCD" + linefeed + "EFG");
		System.out.println("3> ABCD" + cReturn + "EFG"); // 커서를 행의 가장 왼쪽에 위치시킴
		// EFG는 다음 줄에 출력되는것!
		System.out.println("4> ABCD" + dQuote + "EFG");
		System.out.println("5> ABCD" + sQuote + "EFG");
		System.out.println("6> ABCD" + bSlash + "EFG");
		
	}

}
