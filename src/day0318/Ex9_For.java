package day0318;

public class Ex9_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i = 0; i <=10; i++) {
//			System.out.printf("%4d", i);
//		}
////		System.out.println(i + 10);// 밖에서 i 사용 불가 
//		System.out.println();
//		for(int i = 10; i >=0; i--) {
//			System.out.printf("%4d", i);
//		}
//		System.out.println();
//		for(int i=1; i<=10; i+=3) {
//			System.out.printf("%4d", i);
//		}
//		System.out.println();
//		
		//ASCII 코드
//		for(int i='A'; i<='z'; i++) {
//			System.out.printf("%4c", i);
//		}
//		System.out.println();
//		
//		for(int i=65; i<=90; i++) {
//			System.out.printf("%4c", (char)i);
//		}
//		System.out.println();
//		
//		for(int i='a'; i<='z'; i++) {
//			System.out.printf("%4c", i);
//		}
//		System.out.println();
//		
//		
//		//break
//		for(int i = 1; i<=10; i++) {
//			System.out.printf("%3d",i);
//			if(i==5) // 5까지만 출력 후 break로 빠져나온다.
//				break;
//		}
//		
		//continue
		for(int i = 1; i<=10; i++) {
			if(i%2==0) //짝수는 건너뛰기.
				continue;
			System.out.printf("%3d",i);
		}
		
	}

}
