package day0315;

public class Ex4_MainArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]); //run configurations - Arguments - Hello
		System.out.println(args[1]); //Hello 한칸 띄고 Apple
		
		System.out.println(args[2]+args[3]); // Apple 띄고 10 띄고 20 ->"10" + "20" = 1020
		//문자->숫자로 변환후 계산
		int s1 = Integer.parseInt(args[2]); //"10"이 숫자 10으로 변환 
		int s2 = Integer.parseInt(args[3]); //"20"이 숫자 20으로 변환 
		System.out.println(s1+s2);
	}

}
