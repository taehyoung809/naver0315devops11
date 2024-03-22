package day0322;

class Apple{ // day0322 패키지에는 더이상 Apple class를 생성할 수 없다. bin에 파일이 생성된다.
	String msg = "Happy day!"; //인스턴스 멤버변수
	static String message = "오늘은 금요일"; //static 멤버변수(클래스 멤버변수)
}

class Banana{
	static int kor = 100;
	static int eng = 200;
	 String name = "바나나";
}


public class Ex1_Object {
	String name = "홍길동"; //인스턴스 변수
	final static int MAX = 100; //static 변수, final : 상수지정, 값변경이 안됨, 보통 대문자로 작성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * static 멤버 메서드는 static 멤버 변수나 멤버메서드만 접근이 가능하다
		 * 일반 인스턴스 메서드나 변수를 접근하기 위해서는 new로 생성후
		 * 그 변수를 이용해서 호출해야만 한다.
		 * 
		 */
		
//		System.out.println(name); //오류발생(static이 아니라 접근 불가)
		System.out.println(Ex1_Object.MAX); //static변수는 클래스명.변수명
		System.out.println(MAX); //같은 클래스일 경우에는 앞에 클래스명 생략이 가능하다
		
		//name을 출력하려면 new로 생성한 인스턴스 변수가 필요하다
		Ex1_Object ex= new Ex1_Object();
		//ex가 인스턴스 변수이다. 이 변수를 이용해야만 name이 접근 가능하다.
		System.out.println(ex.name);
		
		
		//Apple이 가진 2개의 멤버변수를 출력하기
		Apple apple = new Apple(); //인스턴스 변수 생성 
		System.out.println(apple.msg);
		System.out.println(Apple.message); //static은 바로 호출 가능 
		
		//Banana 클래스의 kor, eng 점수 출력하고 합계도 출력
		
		System.out.println("kor: "+Banana.kor);
		System.out.println("eng: "+Banana.eng);
		System.out.println("합계1: "+Banana.kor + Banana.eng);
		System.out.println("합계2: "+(Banana.kor + Banana.eng));
		//Banana 클래스의 name도 출력 
		Banana banana = new Banana();
		System.out.println("이름: "+banana.name);
		}

}
