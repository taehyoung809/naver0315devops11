package day0315;

import java.util.Scanner;

public class Ex13_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 조건연산자 문
		 * 점수(score) 입력받아
		 * 90점 이상이면 "참 잘했어요!!"
		 * 80점 이상이면 "수고했어요."
		 * 70점 이상이면 "조금 더 노력하세요."
		 * 나머지는 "재시험 입니다."
		 * 메세지를 저장할 문자열 변수명 : msg
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		String msg;
		
		
		String msg1 = "참 잘했어요.";
		String msg2 = "수고했어요.";
		String msg3 = "조금 더 노력하세요.";
		String msg4 = "재시험..";
		
		msg = score > 90 ? msg1 :
			score > 80 ? msg2 :
				score > 70 ? msg3 : msg4;
		
	
		System.out.println(msg);
		
		
	}

}
