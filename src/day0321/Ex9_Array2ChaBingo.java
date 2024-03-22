package day0321;

import java.util.Scanner;

public class Ex9_Array2ChaBingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1부터 3 사이의 난수를 발생후 가로, 세로, 대각선 방향으로 
		 * 같은 숫자가 나올 경우 = bingo 변수를 1 증가하여 빙고갯수를 구하고
		 * 같은 숫자가 없을경우 꽝! 이라고 출력하시오  
		 * x를 누르면 게임 종료 
		 * 
		 * 
		 * Q1)
		 * 가로 세로 동시에도 가능, 대각선은 따로 if문 
		 * Q2)
		 * 빙고 갯수가4 이상 나올 때까지 자동으로 돌리고 얼마만에 나왔는지 횟수를 표시해보기 
		 */
		
		int arr[][] = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("=".repeat(12));
			int bingo=0; //매번 새롭게 시작해야 하므로 while안에 넣는다 
			
			//2차원 배열에 1~3의 값을 임의로 발생
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j]=(int)(Math.random()*3+1);
				}
			}
			
			//출력 
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%4d",arr[i][j]);
				}
				System.out.println();
			}
			//빙고 갯수나 꽝 출력 
			
			Loop:
			while(true) {
			for(int i=0;i<arr.length;i++) {
					//가로방향이 맞을 경우 
					if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] ) {
						bingo++;
					}
					
					//열방향이 맞을 경우 
					if(arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] ) {
						bingo++;
					}
			}
					
					// \ 대각선 방향 
					if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] ) {
						bingo++;
					}
					
					// /대각선 방향
					if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] ) {
						bingo++;
					}
					
					if (bingo<4) {
						count++;
						continue Loop;
					}
					System.out.println("시도 횟수: "+count);
				
			System.out.println("빙고 갯수: ");
			System.out.println(bingo);
			//
			System.out.println("=".repeat(12));
			String ans=scanner.nextLine();
			
			
//			if(ans.equalsIgnoreCase("x")) {
//				System.out.println("** 빙고게임을 종료합니다. **");
//				break;
			}
		}
		
		
	}

}
