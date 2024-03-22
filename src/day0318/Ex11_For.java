package day0318;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100까지 합계 구하기
		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			sum+=i;
//			}
//		System.out.println(sum);
//		
//		System.out.println("=========================");
		
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.println("시작값은?");
		x = sc.nextInt();
		System.out.println("끝값은?");
		y = sc.nextInt();
		for(int i=x;i<=y;i++) { //x부터 y까지 1씩 더한다.
			sum+=i;
			}
		System.out.println(sum);
	}
}
