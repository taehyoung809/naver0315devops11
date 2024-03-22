package day0321;

import java.util.Scanner;

public class Ex4_ArrayAlphaCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 영어 문장을 입력하면 알파벳 기준으로 각각의 갯수를 출력하시오
		 * Have a Nice Day!!
		 * 'A' -> 0번지 증가
		 * 'B' -> 1번지 증가 
		 * 	alpha['A'-'A']++ : 0번지 증가
		 * 	alpha['B'-'A']++ : 1번지 증가
		 * 	alpha['C'-'A']++ : 2번지 증가
		 * A: 3개, B: 0개 ... Z: 0개 
		 * 
		 * 		System.out.println(str1.charAt(7)); // 7번 인덱스의 문자 :N
		 * 		System.out.println("banana".compareTo("apple")); //'b', 'a' 비교 : 1
		 * 		System.out.println(str2.equalsIgnoreCase(str3)); // true 대소문자 x



		 */
		int n=0;
		
		Scanner scanner = new Scanner(System.in);
		String msg;
		int []alpha = new int[26];
		System.out.println("문장을 입력하세요.");
		msg = scanner.nextLine();
		
		for(int i=0;i<alpha.length;i++) {
			if(msg.charAt(i) - msg.charAt(i+1)==n) { //음수의 경우 - 붙이는 if문 만들기 
				alpha[n]++;
				
			}
			
		}
		
		for(int i=0; i<alpha.length;i++) {
		System.out.println(i);
		}
		

	}

}
