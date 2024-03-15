package day0315;

public class Ex11_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자
		//전치일 경우는 1순위, 후치일 경우는 끝순위
		//단 단항일 경우는 상관없음
		//증감연산자는 반드시 초기값이 들어가 있어야 한다.
		
		int m = 5, n = 5;
		int a = 10, b = 10;
		
		m++;
		++n;
		System.out.println("m="+m);
		System.out.println("n="+n);
		
//		a+=m; //a=a+m
		a+=m++; //a=a+m 먼저 계산된 후 m=m+1; //후치는 제일 마지막에 계산
		System.out.println("a="+a);//16
		System.out.println("m="+m);//7
	
		b+=++n; //n=n+1, b=b+n; //n이 먼저 증가 후 b+n
		System.out.println("b="+b);//17
		System.out.println("n="+n);//7
		
		m=5;
		System.out.println("m++ = " + m++);//먼저 출력 후 증가, 5
		n=5;
		System.out.println("++n = " + ++n);//먼저 증가 후 출력, 6
		
		System.out.println("m = "+m+",n = "+n); //m은 출력 후 6으로 증가되어 있는 상태이므
		
	}

}
