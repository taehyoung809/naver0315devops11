package day0320;

import java.util.Scanner;

public class Ex10_ArraySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String searchName;
		String []members = {"강호동","한가인","유재석","이승민","강하나","손미나","이영자","박남정","한지혜","손창민"};
		int count;
		
		while(true) {
			count = 0;
			System.out.println("검색할 이름은?");
			searchName=scanner.nextLine();
			
			//	종료코드
			if(searchName.equalsIgnoreCase("q")){
				System.out.println("**  검색을 종료합니다.  **");
				break;
			}
			
			//검색
			for(int i=0;i<members.length;i++) {
				if(members[i].startsWith(searchName)) {
					count++;
					System.out.printf("\t%d번째: %s\n",i+1,members[i]);
				}
			}
			if(count==0) {
				System.out.println("\t\""+searchName+"\"로 시작하는 멤버는 없습니다.");
			} else {
				System.out.println("\t총 "+count+"명 검색");
				System.out.println();
			}
		}

	}

}
