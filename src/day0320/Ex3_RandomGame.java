package day0320;

import java.util.*;

public class Ex3_RandomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2개의 while문 + break label +
		 * 1. 1~100 사이의 난수를 발생한 후 숫자 알아맞추기
		 * 2. 숫자 입력시 앞에 횟수 출력
		 * 3. 숫자 n이 난수보다 크면 (n보다 작습니다) 출력
		 * 4. 숫자를 맞췄을 경우 (횟수와 정답을 출력 후)
		 * 5. 계속 숫자맞추기 게임을 하시겠습니까? (y/n) 
		 * 6. y를 누르면 다시 난수 발생후 숫자맞추기 시작
		 * 7. y가 아니면 게임 종료 
		 */  
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int su, count;
		Exit:
			while(true)
			{
				//횟수 초기화
				count=0;
				//난수 구하기
				rnd=r.nextInt(100)+1;//1~100
				while(true)
				{
					System.out.println(++count+"회 : ");
					su=Integer.parseInt(sc.nextLine());
					if(su>rnd)
						System.out.println("\t"+su+"보다 작습니다");
					else if(su<rnd)
						System.out.println("\t"+su+"보다 큽니다");
					else {
						System.out.printf("** 정답(%d)입니다 **");
						System.out.println("계속하려면 y/그만하려면 n을 입력하세요.");
						String ans = sc.nextLine();
						if(ans.equalsIgnoreCase("y")) {
							System.out.println("** 새로운 게임을 시작합니다. **");
							break;
						}else {
							break Exit; // 바깥쪽 while문을 빠져나간다.
						}
					}
				}
			}
		System.out.println("**게임을 종료합니다**");

	}

}
