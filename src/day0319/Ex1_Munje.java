package day0319;


public class Ex1_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1-100 사이의 소수를 모두 출력하고 몇 개 인지 갯수를 구하라 (다중 for 문)
		 */


//		int count = 0;
//				
//		Loop:
//			for (int i = 1; i<=100; i++) {
//				for(int j=2; j<i; j++) {
//					if(i%j==0 ) 
//						continue Loop;
//				} count++;
//				System.out.println(i);
//					}
//			}
//		}

		System.out.println("**소수**");
		int count = 0;

		Loop:
			for(int i = 1; i<=100; i++) {
				for(int j = 2; j<i; j++) { 
					if (i%j == 0) { 
						continue Loop; //i++로 이동
						// continue; - j++로 간다.
					}
				} count ++;
				System.out.printf("%3d",i);

//				if(count%7 ==0) { //7개 마다 엔터 
//					System.out.println();
//				}
			}
		System.out.println("\n소수의 갯수: "+count);
	}
}
