package day0320;

import java.util.Scanner;

public class Ex12_ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 처음에 인원수(inwon)을 입력받아 해당 인원수만큼 
		 * name, kor, eng, tot, rank 변수를 배열 할당하고
		 * 인원수 만큼 이름, 국어점수, 영어점수를 입력하면
		 * 총점과 등수를 계산해서 출력하는 프로그램을 작성하시오
		 * 
		 * 출력은
		 * ---------------------------------
		 * 번호   이름   국어   영어   총점   등수	
		 * ---------------------------------
		 *  1   강호동   90   100   190    1 
		 *  2   이영자   100   70   170    3 
		 *  3   유재석   90    90   180    2 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수를 입력하세요.");		
		int inwon = Integer.parseInt(scanner.nextLine());
		int [] kor = new int[inwon];
		int [] eng = new int[inwon];
		int [] tot = new int[inwon];
		int rank = 0;
//		int [] kor, eng, tot, rank= new int[inwon];
		String []name = new String[inwon];
		
		
		
		
		for(int i=0;i<inwon;i++) {
			
			System.out.println(i+1+"번째 이름을 입력하세요");
			name[i] = scanner.nextLine();
			
			System.out.println(i+1+"번째 국어점수를 입력하세요");
			kor[i] = Integer.parseInt(scanner.nextLine());
			
			System.out.println(i+1+"번째 영어점수를 입력하세요");
			eng[i] = Integer.parseInt(scanner.nextLine());
			tot[i] = kor[i]+eng[i];
			
			
		}
		System.out.println("=".repeat(50));
		System.out.println("번호\t이름\t국어\t영어\t총점\t등수");
		System.out.println("=".repeat(50));
			//등수
			for(int i=0;i<inwon;i++) {
				for(int j=0;j<inwon;j++) {
					if(tot[i]<tot[j]) {
						rank++;
					}
				}
		System.out.println(i+1+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+tot[i]+"\t"+(rank+1));
			}
			
//			for(int i = 0; i<inwon; i++) {
//			}
		

	}

}
