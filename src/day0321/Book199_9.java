package day0321;

import java.util.Scanner;

public class Book199_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 전체적으로 while
		 * 학생 수와 각 학생의 점수를 입력받고,
		 * 최고점수 및 평균점수 출력
		 */
	
		
	
		Scanner sc = new Scanner(System.in);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("학생 수를 입력하세요.");
//		int num = sc.nextInt();//학생 수 입력
//		int[] mem = new int[num];//학생수만큼 배열 생성
//		
//		for(int i=0; i<num;i++) {
//		System.out.println("점수를 입력하세요.");
//		int score = sc.nextInt();//학생수만큼 점수 입력
//		mem[i] = score;
//		}
//		
//
//		for(int i=0;i<mem.length;i++) { //학생들 점수
//		System.out.printf("%d",mem[i]);
//		}
//		
//		System.out.println("=".repeat(30));
//		System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석 5. 종료");
//		System.out.println("=".repeat(30));
//		
//		Loop:
//		while(true) {
//			int button = sc.nextInt();
//			if(button == 1 || 2) {
//				
//			}
//				if(button==1) {
//				//학생수 입력
//				System.out.println("학생 수를 입력하세요.");
//				int num = sc.nextInt();//학생 수 입력
//				int[] mem = new int[num];//학생수만큼 배열 생성}
//			}else if(button == 2) {
//				// 점수 입력
//				for(int i=0; i<num;i++) {
//					System.out.println("점수를 입력하세요.");
//					int score = sc.nextInt();//학생수만큼 점수 입력
//					mem[i] = score;
//					}
//				
//			} else if(button == 3) {
//				//점수 리스트 출력
//				for(int i=0;i<mem.length;i++) { //학생들 점수
//					System.out.printf("%d번 학생의 점수: %d점",i,mem[i]);
//					}
//			}else if(button == 4) {
//				//최고 점수와 평균점수 출력
//			}else {
//				break Loop;
//			}
//		}
//
//		
		
		//학생수 따로 점수 따로 구하고 점수리스트로 합치기?
		System.out.println("=".repeat(30));
		System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석 5. 종료");
		System.out.println("=".repeat(30));
		int button = sc.nextInt();
		int num; //학생수
		int[] mem; //

		
		while(true) {
			switch(button) {
			case 1: 
				//학생수 입력 및 점수 입력
				System.out.println("학생 수를 입력하세요.");
				num = sc.nextInt();//학생 수 입력
				mem = new int[num];//학생수만큼 배열 생성}
			case 2:
				// 점수 입력
				for(int i=0; i<num;i++) {
					System.out.println("점수를 입력하세요.");
					int score = sc.nextInt();//학생수만큼 점수 입력
					mem[i] = score;
					}
				
			case 3:
				//점수 리스트 출력
				for(int i=0;i<mem.length;i++) { //학생들 점수
					System.out.printf("%d번 학생의 점수: %d점",i,mem[i]);
					}
			case 4:
				//최고 점수와 평균점수 출력
			case 5:
				break Loop;
			}
		}
		
		
	}

}
