package day0315;

import java.util.Scanner;

public class Ex6_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int kor, eng;
		String name;
		System.out.println("국어점수는?");
		kor = sc.nextInt();
		System.out.println("영어점수는?");
		eng = sc.nextInt();
		sc.nextLine();// 2. 버퍼의 엔터를 읽어서 소멸 
		
		System.out.println("이름은?");
		name = sc.nextLine();// 1. 숫자열 읽은 후 문자열을 읽으면 정수 뒤의 엔터를 읽어와서 버퍼로 저장 ->이름에 엔터가 들어가버림 
		
		System.out.println("이름: "+ name);
		System.out.printf("국어점수:%d점, 영어점수:d\n",kor,eng);
		System.out.printf("총점: %d점, 평균: %d점",kor+eng, (kor+eng)/2);

	}

}
