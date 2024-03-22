package day0321;

import java.util.Scanner;

public class Ex6_ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ex1, Ex2 참고
		 * money를 입력하면 해당 횟수만큼 로또 구하기
		 * 로또 : 1~45 까지의 중복되지 않는 숫자 
		 * 
		 * 로또 금액 입력? 800 ->금액이 부족합니다.
		 * 로또 금액 입력? 0 -> 종료합니다(while문 종료)
		 * 
		 *  로또 금액 입력? 3000
		 *  
		 *  1회 : 4 7 12 34 44 45
		 *  ...
		 *  3회 : 3 6  9 40 41 43
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		int []lotto = new int[6];
		int money;
		int count = 0;

		Loop:
		while (true) {
			System.out.println("로또 금액 입력");
			money = scanner.nextInt();
			if(money<1000) {
				if(money==0) {
					System.out.println("로또 게임을 종료합니다.");
					break Loop;
				}
				else {
				System.out.println("금액이 부족합니다.");
				break;} //continue?
			}else {
				count = money/1000;
				for(int i=0; i<count;i++) {
					System.out.printf("** %d회차 로또 번호 **",i+1);
					System.out.println();
//					for(int j=0;j<lotto.length;j++) {
//						int num = (int)(Math.random()*45)+1; // 로또 번호를 1~45까지 랜덤하게 부여
//						lotto[j] = num; //로또 여섯자리 출력
//						
						//Sol) 로또 숫자 구하기 
						for(int i=0;i<lotto.length;i++) {
							lotto[i]=(int)(Math.random()*45)+1;
							for(intj=0;j<i;j++) {
								if(lotto[i]==lotto[j]) {
									i--;
									break; //두번째 for문 아래에 다른 코드가 없으므로 continue 대신 break 써도 됨.
								}
							}
						}
						System.out.printf("[%d]",lotto[j]);
//					}
					System.out.println();
				}
			}

		
		}
	




	}

}
