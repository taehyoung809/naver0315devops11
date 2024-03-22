package day0321;

public class Ex3_ArrayStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr = {"하석진","강호동","강호마","Candy","손석구"};
		//정렬 오름차순 
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) { //기준값이 더 클 경우 양수값이 발생(부호만 바꾸면 내림차순)
					String stmp = arr[i];
					arr[i]=arr[j];
					arr[j]=stmp;
				}
			}
		}
		System.out.println("**순서대로 출력하기**");
		for(String s:arr)
			System.out.println(s);
	}

}
