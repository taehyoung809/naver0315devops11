package day0320;

import java.util.Scanner;

public class Ex9_ArraySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 검색할 이름(searchName)입력하면 몇번째에 있는지 출력 
		 * 없을 경우 없다고 메세지 출력(q 입력시 종료)
		 */
		Scanner scanner = new Scanner(System.in);
		int searchIndex;
		String searchName;
		String []members = {"강호동","한가인","유재석","이승민","강하나"};
		while(true) {
			searchIndex= -1;
			System.out.println("검색할 문자를 입력하세요.(q입력시 종료)");
			searchName = scanner.nextLine();
			
			if(searchName.equalsIgnoreCase("q")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			for(int i = 0;i<members.length; i++) {
				if(searchName.equals(members[i])) {
					searchIndex=i;
					break;
				}
			}
			
			if(searchIndex == -1) {
				System.out.println("\t"+searchName+"은 데이터에 없습니다.");
			} else {
				System.out.println("\t"+searchName+"은"+(searchIndex+1)+"번째에 있습니다.");
			}
		}
		

	}

}