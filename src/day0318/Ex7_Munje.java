package day0318;

import java.util.Scanner;

public class Ex7_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름(name), 기본급(gibon), 가족수(familysu) 를 키보드로 입력 후
		 * 가족수가 3인 이상이면 기본급 + (가족수*50000)으로 실수령액(totpay)을 하고
		 * 가족수가 3인 미만이면 기본급+30000 원으로 실수령액을 출력하시오.
		 * 출력은
		 * 이름
		 * 기본급
		 * 가족수
		 * 실수령액
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("기본급을 입력하세요.");
		int gibon = sc.nextInt();
		System.out.println("가족수를 입력하세요.");
		int familysu = sc.nextInt();
		
		if (gibon < 0 || familysu < 0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		int totpay;
		if(familysu >= 3) {
			totpay = gibon + (familysu*50000);
		} else { 
			totpay = gibon + 30000;
		}
		
		System.out.println("=========================");
		System.out.println("이름은 "+name+"입니다.");
		System.out.println("기본급은 "+gibon+"원 입니다.");
		System.out.println("가족수는 "+familysu+"명 입니다.");
		System.out.println("실수령액은 "+totpay+"원 입니다.");
		
	}


}
