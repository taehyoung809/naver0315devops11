package day0315;

import java.util.Scanner;

public class Ex5_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //키보드로부 입력을 받는 인스턴스 변수
		String msg = "";
		System.out.println("메세지를 입력하세요.");
		msg = sc.nextLine(); //한 줄을 통채로 읽는다(문자열)
		System.out.println("입력한 문자열은 \"" + msg +"\" 입니다."); //" 출력 : \"
		System.out.println("입력한 문자열은 \'" + msg +"\' 입니다."); //' 출력 : \'
		
		int age;
		System.out.println("당신의 나이는?");

		
//		age = sc.nextInt();
		age = Integer.parseInt(sc.nextLine()); //나이를 문자열로 읽은 후 정수타입으로 변환 
		System.out.println("내 나이는 "+age+"세 입니다.");
	}

}
