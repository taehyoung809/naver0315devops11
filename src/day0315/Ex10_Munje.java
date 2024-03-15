package day0315;
import java.util.*;

public class Ex10_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 백만 단위의 금액(money)를 입력받은 후
		 * 만원, 천원, 백원, 십원, 일원 단위로 몇 개인지 출력하시오.
		 * 예)
		 * 금액입력
		 * 4,567,893
		 * 만원 : 456장 
		 * 천원 : 7장 
		 * 백원 : 8개 
		 * 십원 : 9개 
		 * 일원 : 3개 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요(10000~)");
		int money, money1, money2, money3, money4;
		
//		money = Integer.parseInt(sc.nextLine());
		money = sc.nextInt();
		money1 = (money%10000); //천 
		money2 = (money%1000); //백 
		money3 = (money%100); //십 
		money4 = (money%10); //일 
		
		
		
		System.out.println("만원: " + (money/10000) + "장");
		System.out.println("천원: " + (money1/1000) +"장");
		System.out.println("백원: " + (money2/100) +"장");
		System.out.println("십원: " +(money3/10)+"장");
		System.out.println("일원: " +(money4)+"장");
		
		
	}

}
