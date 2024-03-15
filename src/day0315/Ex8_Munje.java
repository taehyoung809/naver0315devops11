package day0315;

import java.util.Scanner;

public class Ex8_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름(name), 핸드폰(hp), 태어난 년도(birthYear) 입력받은 후
		 * 이름, 핸드폰, 태어난 년도, 나이(age, 2024-태어난년도)를 출력하는 프로그램을 작성하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int hp,birthYear;
		
		System.out.println("이름은?");
		name = sc.nextLine();
		
		System.out.println("핸드폰번호?");
		hp = Integer.parseInt(sc.nextLine());
		
		System.out.println("태어난년도는?");
		birthYear = Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println("이름: "+name);
		System.out.println("핸드폰번호: "+hp);
		System.out.println("태어난년도: "+	birthYear);
		System.out.println("나이: "+	(2024-birthYear+1));
		
	}

}
