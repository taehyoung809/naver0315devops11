package day0318;

import java.util.Scanner;

public class Ex8_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품명(sang)과 수량(su), 단가(dan)을 입력받은 후 
		 * 총 금액(total)을 구하고 만약 수량이 5개 이상이면
		 * "10프로 할인입니다." 와 함께 할인된 금액(dctotal)을 출력하시오.
		 * 
		 * 상품명?
		 * 딸기 
		 * 수량?
		 * 6
		 * 단가?
		 * 2000
		 * 
		 * 총 금액: 12000
		 * 10프로 할인입니다.
		 * 10프로 할인된 금액: 10800
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 입력하세요.");
		String sang = sc.nextLine();
		System.out.println("수량을 입력하세요.");
		int su = sc.nextInt();
		System.out.println("단가 입력하세요.");
		int dan = sc.nextInt();
		int total = su*dan;
//		System.out.printf("%s %d개의 총 금액: %d\n", sang, su, total);

		if(su>=5) {
			System.out.println("총 금액: "+total);
			total -= (total / 10);
//			total = total*0.9 //에러-> (int)(total*0.9)
			System.out.println("10% 할인됩니다.");
			System.out.println("10프로 할인된 금액은 : "+total+"원 입니다.");
		}else {

			System.out.println("총 금액은: "+total+"원 입니다.");}
	}

}
