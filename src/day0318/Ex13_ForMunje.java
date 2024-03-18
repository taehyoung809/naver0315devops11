package day0318;

import java.util.Scanner;

public class Ex13_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.out.println("지수승 구하기.");
//		System.out.println("3의 3승은 "+(int)Math.pow(3, 3)); //기본형이 double이라 int로 변경.
//		System.out.println("2의 4승은 "+(int)Math.pow(2, 4));
//		
		/*
		 * x, y 두 숫자를 입력후 x의 y승을 구하시오.
		 * x? 3
		 * y? 4
		 * 3의 4승은 81 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int x= sc.nextInt();
		System.out.println("번째 숫자를 입력하세요.");
		int y= sc.nextInt();
		int sum = 1;
		
		for(int i = 1; i <= y; i++) {
			sum*= x;
		}
		System.out.printf("%d의 %d승은 %d 입니다.",x,y,sum);
			
	}

}
