package day0321;

public class Ex2_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//두 값을 바꿀 경우
//		int a = 10, b = 20, tmp;
//		System.out.println("a="+a+",b="+b);
//		//두 값을 서로 바꾸기
//		tmp = a;
//		a=b;
//		b=tmp;
//		System.out.println("a="+a+",b="+b);
		
		int []arr = {5,8,2,1,10};
		for(int i =0;i<arr.length;i++) { //기준
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) { //서로 값을 바꾼다(오름차순)
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("오름차순");
		for(int a:arr) {
			System.out.print(a+"\t");
		}
		
		for(int i =0;i<arr.length;i++) { //기준
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) { //서로 값을 바꾼다(내림차순)
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println();
		System.out.println("내림차순");
		for(int a:arr) {
			System.out.print(a+"\t");
		}

	}

}
