package day0315;

public class Ex1_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//기본 자료형 공부
		//구역({}) 안에서 선언하는 변수들은 자동 초기화가 되지 않으므로
		//초기값을 지정하거나 나중에 변수에 값을 전달해야 출력이 가능하
		boolean flag = true ; //Boolean 은 wrapper class
		boolean flag2;
		flag2 = false;
		System.out.println(flag); //println 대표적인 오버로딩 메서드
		System.out.println(flag2);
		System.out.println(!flag);
		System.out.println(!flag2);
		
		// && : 둘 다 true 일 때만 true
		// || : 둘 중 하나만 true 라도 결과는 true
		System.out.println(flag && flag2); //false
		System.out.println(flag || flag2); //true

		
		
		
		
		
		System.out.println(); //option up/down 줄 이동
		System.out.println(); //줄삭제 command d
		
		
		System.out.println();
		System.out.println(); //command option up/down 줄복사
		System.out.println();
	}

}
