package day0315;

public class Ex2_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수타입
		byte a = 127;
		System.out.println(a);
		
//		byte b = 200;
//		System.out.println(b); //에러.

		byte b = (byte)200; //(byte) : cast연산자 - 강제로 형변환, 값손실.
		System.out.println(b); //값손실이 발생할 경우 엉뚱한 값이 출력(내부적으로 2의 보수값(-56))
		
		//실수타입
		float f1 = 123.567891234f; //f를 붙여야 4바이트 float 으로 저장 (안붙이면 double로 인식)
		double d1 = 123.567891234;
		
		System.out.println(f1); //소수점 포함 8글자까지만 정확 
		System.out.println(d1); //소수점 포함 15글자 까지 정확 
		
		
		//1글자 지정은 char, 문자열은 String(객체타입)
		char ch1 = 'A'; //문자는 작은 따옴표
		char ch2 = '가'; //2바이트라 한글 한글자도 가능 
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		//문자열을 지정하는 방법
		String str1 = new String("Happy"); // 방법 1 잘 안씀 
		String str2 = "Hello"; // 방법 2 보통 씀
		System.out.println(str1);
		System.out.println(str2);
		
		//긴 문자열을 지정하는 경우
		
		String str3 = "[str3]나는 오늘도 자바를 공부한다.. 오늘은 즐거운 금요일엔데 할 일이 없다... 어쩌고 저쩌고...";
		
		String str4 = "[str4]나는 오늘도 자바를 공부한다..\n"
				+"오늘은 즐거운 금요일데 할 일이 없다..\n"
				+"어쩌고 저쩌고...";
				
		System.out.println(str3);
		System.out.println(); //한줄 띄움 
		System.out.println(str4);
		
		//텍스트블럭, JDK 15부터 가능  
		String str5 = """
				[str5]나는 오늘도 자바를 공부한다.. 
				오늘은 즐거운 금요일엔데 할 일이 없다... 
				어쩌고 저쩌고...
				""";
		System.out.println();
		System.out.println(str5);
	}

}
