package day0320;

import java.util.Scanner;

public class Ex8_ArraySearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자(num) 입력하여 배열에 몇번째에 있는지 출력 
		 * 없을 경우 없다고 메세지 출력(0 입력시 종료)
		 */
		Scanner scanner = new Scanner(System.in);
		int searchIndex;
		int num;
		int []data = {12,3,5,3,9,1,17,20,8,4,14};
		while(true) {
			searchIndex= -1;
			System.out.println("검색할 숫자를 입력하세요.(0입력시 종료)");
			num = scanner.nextInt();
			if(num == 0) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			for(int i = 0;i<data.length; i++) {
				if(num == data[i]) {
					searchIndex=i;
					break;
				}
			}
			
			if(searchIndex == -1) {
				System.out.println("\t"+num+"은 데이터에 없습니다.");
			} else {
				System.out.println("\t"+num+"은"+(searchIndex+1)+"번째에 있습니다.");
			}
		}
		

	}

}
