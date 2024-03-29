package day0322;


class Oper{
	//메서드 오버로딩 
	static public int  sum(int a, int b) {
		return a+b;
	}
	static public double  sum(double a, double b) {
		return a+b;
	}
	static public String  sum(String a, String b) {
		return a+b;
	}
	
	//variable argument
	static public int hap(int ...n) { //갯수 제한 없이 인자로 받을 수 있다.
		System.out.println("전달받은 숫자의 갯수: "+n.length);
		int s = 0;
		for(int i=0;i<n.length;i++) {
			System.out.printf("%4d",n[i]);
			s+=n[i];
		}
	}
	
}

public class Ex4_Overloading {
	public static void main(String[] args) {
		System.out.println(Oper.sum(5,100));
		System.out.println(Oper.sum(1.2,5.6));
		System.out.println(Oper.sum("apple","banana"));
		
		System.out.println("총 합계:"+Oper.hap(3,6,8));
		System.out.println("총 합계:"+Oper.hap(343,63,834,5,76,54,23,11));
		
		Oper.writeColor("red");
		Oper.writeColor("yellow","gray","blue");
	}

}
