package day0320;

import java.util.Scanner;

public class Ex10_ArrayStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 검색할 이름은?
		 * 1번째: 강호동
		 * 5번째: 강하나
		 * 총 2명 검색
		 * 
		 * 검색할 이름은? 박이
		 * "박이"로 시작하는 이름은 없습니다.
		 * 
		 * 검색할 이름은? Q
		 * **검색을 종료합니다. **
		 * 
		 * boolean 이용.
		 */
		Scanner scanner = new Scanner(System.in);
		int searchIndex;
		String searchName;
		int count=0;
		String []members = {"강호동","한가인","유재석","이승민","강하나","손미나","이영자","박남정","한지혜","손창민"};
		while(true) {
			searchIndex= -1;
			System.out.println("검색할 이름은?.(q입력시 종료)");
			searchName = scanner.nextLine();
			
			if(searchName.equalsIgnoreCase("q")) {
				System.out.println("**검색을 종료합니다.**");
				break;
			}
			
			for(int i = 0;i<members.length; i++) {
				if(members[i].startsWith(searchName)) {
					searchName = members[i];
					searchIndex=i;
					System.out.println(searchName+"은"+(searchIndex+1)+"번째에 있습니다.");
					count++;
					continue;
					
				}
				
			
			}
			if(searchIndex == -1) {
				System.out.println("\t"+searchName+"은 데이터에 없습니다.");
			} else 
				System.out.printf("총%d 명 검색\n\n",count);
		}
		

	}

}