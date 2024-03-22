package day0319;

public class Ex3_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int x=1; x<=9;x++) {
			for(int y=1; y<=9;y++) {
				int susik = (x*10+y)+(y*10+x);
				if(susik==121)
					System.out.printf("%d%d+%d%d=121\n",x,y,y,x);
				
				
//		int x;
//		int y;

//		for (x=1;x<=10;x++) {
//			for(y=1;y<=10;y++) {
//				String x1 = Integer.toString(x);
//				String y1 = Integer.toString(y);
//				String xy = x1+y1;
//				String yx = y1+x1;
//
//				int xy1 = Integer.parseInt(xy);
//				int yx1 = Integer.parseInt(yx);
//
//				if(xy1+yx1 == 121) {
//					System.out.printf("x=%d y=%d xy =%d yx =%d",x1,y1,xy1,yx1);
//					System.out.println();

				}



			}
		}

	}


