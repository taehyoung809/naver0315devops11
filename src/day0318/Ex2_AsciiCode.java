package day0318;


public class Ex2_AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char 는 내부적으로 int 타입으로 인식
		
		char a = 'A';
		char b = 65; //아스키 코드로 'A' 가 65이다
		
	System.out.println(a + " , "+ b);
	
	System.out.printf("a=%d,%c\n", (int)a,a);
	System.out.printf("b=%d,%c\n", (int)b,b);
	
	System.out.println(a+3); //68, char + int = (묵시적 형변환)int
	System.out.println((char)(a+3)); //68 -> D
	
	char c = '7';
	System.out.println(c); //숫자 7 이 나오지만 실제로는 문자 '7'
	System.out.println(c+2); //'7'(55) + 2 = 57
	
	//숫자 7로 변경 후 계산
	int n1 = c-'0'; //c-48 도 가능
	int n2 = c-48; //
	
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n1+2);
	
	
	}

}
