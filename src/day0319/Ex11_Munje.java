package day0319;

import java.util.Scanner;

public class Ex11_Munje {
	public static void main(String[] args) {
		/*
		 * 문제
		 * String 타입의 문자열(msg)를 입력받아
		 * 그 문자열안에 대문자, 소문자, 숫자가 몇 개가 포함되어 있는지 출력하시오
		 * 예)
		 * Happy Day 123!!
		 * 대문자 : 2개
		 * 소문자: 6개
		 * 숫자 : 3개
		 * String의 charAt과 length를 사용하면 됨 
		 */
	
		//char - 숫자도 문자도 문자로, (int) 붙이면 정수로.
				String string = "Eclpise!";
				for (int j=0; j<string.length();j++) {
					char ch = string.charAt(j); // 각 문자열 하나씩 출력 
					int cv = (int)ch; //각 문자열을 정수로 
					
					System.out.println(cv);
				}
				
				
				/*
				String msg = "Happy Day 123!!!";
//				int imsg = Integer.parseInt("Happy Day 123!!!");
				int cUpper = 0, cLower = 0, cNum = 0;
				for(int i = 0; i <msg.length(); i++) {
					char imsg = msg.charAt(i); //i번째 위치에 있는 문자를 아스키코드로 변
					if(48<=imsg && imsg<= 57) { //숫자 
						cNum++;
					} else if(65<=imsg && imsg<=90) { //대문자 
						cUpper++;
					} else if(97<=imsg && imsg<=122) { //소문자 
						cLower++;
					} /*else {
						continue;
					}
					
					
		//			System.out.print(msg.charAt(i));
				}
				System.out.println("대문자의 수 : "+ cUpper);
				System.out.println("소문자의 수 : "+ cLower);
				System.out.println("숫자수 : "+ cNum);
				
		

		/*
		Scanner sc = new Scanner(System.in);
		String msgString;
		int upperAlpha = 0, lowerAlpha=0, num=0;
		System.out.println("문장을 입력하세요.");
		msgString = sc.nextLine();

		for(int i=0; i<msgString.length(); i++) {
			//i번지 인덱스의 문자 얻기
			char ch = msgString.charAt(i); //아스키 코드의 규칙에 맞게 숫자로 치 

			if(ch>='a' && ch<='z') {
				lowerAlpha++;
			} else if(ch>='A' && ch<='Z') {
				upperAlpha++;}
					else if(ch>='0' && ch <='9') {
						num++;}
				}

				System.out.println("소문자: "+lowerAlpha);
				System.out.println("대문자: "+upperAlpha);
				System.out.println("숫자: "+num);
		 */

		}
	}


