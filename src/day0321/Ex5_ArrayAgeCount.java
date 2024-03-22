package day0321;

public class Ex5_ArrayAgeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []memberAges= {12,4,45,59,33,1,2,34,6,17,29,38,30,44,12,56,30,3,25,9};
		System.out.println("총 인원수: "+memberAges.length);
		
		int[]ageCount = new int[6];
		
		/*
		 * 연령별 인원수를 구해서 출력하시오
		 * 
		 * 10세 미만	: 3명
		 * 10대		: 5명
		 * 20대		: 2명
		 * ...
		 * 50대		: 1 
		 */
		
		for(int i=0;i<memberAges.length;i++) {
			for(int j=0;j<ageCount.length;j++)
			if((memberAges[i]/(j+1)*10)<(j+1)*10) { //나이를 10의 배수로 나눈 나머지가 10의 배수보다 작으면 
				ageCount[j]++;
				break;
				}
		}
		
		for(int i=0;i<ageCount.length;i++) {
			if(i==0) {
				System.out.println("10세 미만:"+ageCount[i]+"명");
			}else {
		System.out.println(i+"0대:\t" +ageCount[i]+"명");
			}
		}
		
	}

}
