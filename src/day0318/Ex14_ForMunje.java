package day0318;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ex14_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5개의 점수(score)를 입력하면 갯수(count)와 합계(sum)을 출력
		 * (단, 1~100 이 아닌 경우에는 갯수에서 제외하고 합계에서도 제외하기 -continue
		 * 
		 * 예)
		 * 
		 * 점수는? 90
		 * 점수는? 120
		 * 점수는? 70
		 * 점수는? 60
		 * 점수는? 100
		 * 입력한 점수 갯수: 4
		 * 총 합계: 310
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int score;
		
		for(int i = 1; i<=5; i++){
			System.out.println("점수는?");
			score = sc.nextInt();
			
			if(score<1 || score >100) {
				continue;
				
				} else {
				count += 1; //count++;
				sum += score;
				
				}
		}
		 

		System.out.println("입력한 점수 갯수: "+count);
		System.out.println("총 합계: "+sum);
	
	}

}
