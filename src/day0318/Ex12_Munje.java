package day0318;

import java.util.Scanner;

public class Ex12_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 구구단?
		 * 2-9단 사이에 없으면 잘못된 숫자입니다.
		 * 
		 * ** 5단 **
		 * 5x1=5
		 * 5x2=10
		 * ...
		 * 5x9=45
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("구구단");
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		int gugu;
		
		System.out.printf("** %d단 **\n",i);
		if(i<2 || i>9) {
			System.out.println("잘못된 숫자입니다.");
			
		} else {
		for (int j = 1;j<=9; j++) {
			gugu= i*j;
			System.out.printf("%dx%d=%2d\n",i,j,gugu);
		}
		}
		
	}

}
