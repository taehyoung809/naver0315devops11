package day0319;

import java.util.StringTokenizer;

public class Ex8_String {
	public static void main(String[] args) {
		System.out.println("**String 객체의 Method 공부하기 **");
		String str1 = "Have a Nice Day";
		String str2 = "apple";
		String str3 = "Apple";
		
		System.out.println(str1.charAt(7)); // 7번 인덱스의 문자 :N
		System.out.println(str1.charAt(0)); // 0번 인덱스의 문자 :H
		
		System.out.println(str1.indexOf('a')); // 첫번째 'a'의 위치 : 1
		System.out.println(str1.indexOf('x')); // 첫번째 'x'의 위치 : -1 (없을 경우 -1)
		System.out.println(str1.lastIndexOf('a')); //마지막 'a'의 위치 : 13
		
		System.out.println(str1.length()); //str1의 총 길이 : 15
		
		System.out.println(str2.concat("***")); //str2 문자에 *** 추가해서 반환
		System.out.println(str2+"***"); //str2 문자에 *** 추가해서 반환 (자바에서는 이렇게 보통 쓴다)
		
		System.out.println(str1.toLowerCase()); //모두 소문자로 변환해서 반환 
		System.out.println(str1.toUpperCase()); //모두 대문자로 변환해서 반환 
		
		//문자열 비교시(값으로 비교시 equal 사용)
		System.out.println("apple".equals(str2)); //true
		System.out.println("apple".equals(str3)); //false 대소문자
		System.out.println(str2.equals(str3)); // false 대소문자
		System.out.println(str2.equalsIgnoreCase(str3)); // true 대소문자 x
		System.out.println(str2 == str3); //객체시 주소를 비교: 주소가 다르므로 false(==동등연산자는 기본값 비교시에만 사용)
		
		
		//문자열 추출 "Have a Nice Day"
		System.out.println(str1.substring(7)); //7번 인덱스부터 끝까지 추출 : Nice Day
		System.out.println(str1.substring(7,10)); //7번 인덱스부터 9까지 추출 : Nic
		
		//문자열 비교
		System.out.println(str1.startsWith("Have")); //str1이 Have 로 시작하면 true : true
		System.out.println(str1.startsWith("Nice")); //str1이 Nice 로 시작하면 true : flase
		
		System.out.println(str1.endsWith("Day")); // str1이 Day로 끝날 경우 true : true
		System.out.println(str1.endsWith("day")); // str1이 day로 끝날 경우 true : false
		System.out.println(str1.toLowerCase().endsWith("day")); //str1이 소문자로 변환후 day로 끝나는지 비교 : true
		
		//compareTo로 비교시
		System.out.println("apple".compareTo("append")); //'l', 'e' : 7(양수-첫 문자열이 더 크다), 첫 문자열이 작을 경우 음수가 나온다.
		System.out.println("apple".compareTo("banana")); //'a', 'b' 비교 : -1
		System.out.println("banana".compareTo("apple")); //'b', 'a' 비교 : 1
		System.out.println("apple".compareTo("apple")); //완전히 같을 경우 0
		
		//반복
		System.out.println(str2.repeat(3));
		System.out.println("*".repeat(3));
		
		//변경
		System.out.println(str1.replace('a', '*'));
		System.out.println(str1.replace("Nice", "Good"));
		
		//문자열 분리(결과값이 배열타입)
		String colors = "red, blue, green, yellow, pink";
		System.out.println(colors);
		// ","로 분리를 하고 싶은 경우
		String []a1 = colors.split(",");
		System.out.println("분리된 배열의 갯수:"+a1.length);
		System.out.println(a1[0]+","+a1[4]);
		
		//분리하는 또다른 방법
		StringTokenizer st = new StringTokenizer(colors,",");
		System.out.println("분리할 토큰수 : "+st.countTokens());
		//분리된 토큰값 출력
		while(st.hasMoreTokens()) //더이상 토큰이 없을 경우 false가 되면서 	while문을 빠져나간다
		{
			System.out.println(st.nextToken());
		}
		
		
		//trim - 양쪽 공백 제
		String msg = "     hello     ";
		System.out.println(msg.length()); //15글자(공백포함)
		System.out.println(msg.trim().length()); //양쪽 공백 제거후 5글자 
		
		
		//valueOf 어떤 타입이든 String으로 변환해준다 
		System.out.println(String.valueOf(3)); //정수 3이 문자열 "3"으로 반환 
		System.out.println(3+""); //이 방법도 있음 
		
		
		
	}

}
