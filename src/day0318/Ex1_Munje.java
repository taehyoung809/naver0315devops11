package day0318;

import java.util.Scanner;

public class Ex1_Munje {
	
	public static void main(String[] args) { //return 타입이 void -> 아무 값도 보낼 필요가 없어서 return 만 적는다. int 일 경우 숫자 입
		/*
		 * 점수(score)를 입력 후 
		 * 점수가 90 이상이면 "A"
		 * 점수가 80 이상이면 "B"
		 * 점수가 70 이상이면 "C"
		 * 점수가 60 이상이면 "D"
		 * 나머지는 "F"를 출력
		 * 
		 * (조건연산자를 이용해서 구하기)
		 * 
		 * (예)
		 * 점수는?
		 * 89
		 * 
		 * 89점은 B학점 입니다
		 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수는?");
		int score = sc.nextInt();
		//if문을 이용해서 점수를 잘못 입력했을 경우 메서드 종료를 하자
		
		if (score <1 || score > 100)
		{
			System.out.println("잘못된 점수입니다.");
			return; //main 메서드 종료(곧 프로그램이 종료됨(main이기 때문에 프로그램 종료))
		}
		
		String msg ; //char msg - - - 'A' 'B' 
		
		msg = (score >= 90 ? "A" :
			score >=80 ? "B" :
				score >=70 ? "C" :
					score >=60 ? "D" : "F" );
				
				System.out.printf(score+"점은 "+msg+ "학점 입니다.");
		
		
	

	}
	
}

