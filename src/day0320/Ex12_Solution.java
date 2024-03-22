package day0320;

import java.util.Scanner;

public class Ex12_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int inwon;
		int [] kor, eng, tot, rank;
		String []name;
		
		System.out.println("인원수를 입력하세요.");
		inwon = Integer.parseInt(scanner.nextLine());
		
		//배열에 메모리 할당
		name = new String[inwon];
		kor = new int[inwon];
		eng = new int[inwon];
		tot = new int[inwon];
		rank = new int[inwon];
		
		//인원수만큼 데이터 입력하기
		for(int i = 0; i<inwon; i++) {
			System.out.println(i+1+"번째 데이터 입력");
			System.out.println("이름은?");
			name[i]=scanner.nextLine();
			System.out.println("국어점수는?");
			kor[i]=Integer.parseInt(scanner.nextLine());
			System.out.println("영어점수는?");
			eng[i]=Integer.parseInt(scanner.nextLine());
			
			//합계
			tot[i] = kor[i]+eng[i];
			
		}
		
		//등수 구하기
		for(int i = 0;i<inwon;i++) {
			rank[i] = 1;
			for(int j=0; j<inwon; j++) {
				if(tot[i]<tot[j])
				rank[i]++;
			}
		}
		//출력
		System.out.println("=".repeat(65));
		System.out.println("번호\t이름\t국어\t영어\t총점\t등수");
		System.out.println("=".repeat(65));
		for(int i=0;i<inwon;i++)
		System.out.println(i+1+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+tot[i]+"\t"+rank[i]);
	}

}
