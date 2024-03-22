package day0322;

import java.util.Scanner;

public class Ex7_ClassSawonArray {
	
	//입력받는 메서드 
	public static void inputSawonArray(Sawon []sa) { //메서드,인자 이름은 원하는걸로 아무거나 
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<sa.length;i++) {
			System.out.println("사원명은?");
			String name = scanner.nextLine();
			System.out.println("기본급은?");
			int gibon = Integer.parseInt(scanner.nextLine());
			System.out.println("수당은?");
			int sudang = Integer.parseInt(scanner.nextLine());
			
			sa[i] = new Sawon(); //초기값이 null이므로 new로 생성해야 메서드 호출도 가능하다 
			sa[i].setSawon(name, gibon, sudang);//생성을 안하고 호출시 널포인트 오류 발생
			System.out.println();
		}
	}
	//출력하는 메서드
	public static void outputSawonArray(Sawon []sa) {
		System.out.println("\t\t[사원 급여 현황]\n");
		System.out.println("번호\t사원명\t기본급\t수당\t실수령액");
		System.out.println("=".repeat(60));
		
		for(int i=0;i<sa.length;i++) {
			System.out.println(i+1+"\t"+sa[i].getName()+"\t"+sa[i].getGibon()+
					"\t"+sa[i].getSudang()+"\t"+sa[i].getNetPay());
		}
	}
	
	//제목

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sawon[];
		int inwon;
		Scanner scanner = new Scanner(System.in);
		System.out.println("직원 인원수는?");
		inwon = Integer.parseInt(scanner.nextLine());
		//인원수만큼 메모리 할당 
		sawon = new Sawon[inwon]; //인원수만큼 객체 할당, 초기값은 null
		
		inputSawonArray(sawon);
		outputSawonArray(sawon);
		
	}

}
