package day0315;

import java.util.Scanner;

public class Ex7_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int kor, eng;
		String name;
		System.out.println("국어점수는?");
		kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수는?");
		eng = Integer.parseInt(sc.nextLine());
		
//		sc.nextLine();//
		
		System.out.println("이름은?");
		name = sc.nextLine();//
		
		System.out.println("이름: "+ name);
		System.out.printf("국어점수:%d점, 영어점수:d\n",kor,eng);
		System.out.printf("총점: %d점, 평균: %3.1f점",kor+eng, (kor+eng)/2.0); //2.0으로 해야 double이 되서 평균값 소수점 표현 가
		//결과가 double이어야 할 경우 수식중 한개라도 double타입이 이있어야 한다.
	}

}