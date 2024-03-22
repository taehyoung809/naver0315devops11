package day0321;

public class Ex5_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []memberAges= {12,4,45,59,33,1,2,34,6,17,29,38,30,44,12,56,30,3,25,9};
		System.out.println("총 인원수: "+memberAges.length);
		
		int[]ageCount = new int[6];
		
		for(int i=0; i<memberAges.length;i++) {
			ageCount[memberAges[i]/10]++; //각 배열의 항목들을 10으로 나누면 바로 번지수가 나온다 
		}
		System.out.println("** 연령별 인원수 구하기 **");
		
		for(int i=0;i<ageCount.length;i++) {
			if(i==0) {
				System.out.println("10세 미만:"+ageCount[i]+"명");
			}else {
		System.out.println(i+"0대:\t" +ageCount[i]+"명");
			}
		}
	}

}
