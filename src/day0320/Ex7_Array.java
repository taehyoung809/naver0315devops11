package day0320;

public class Ex7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {-3,8,56,267,-50,11,0,60,44,-14567};
		System.out.println(data.length);
		int max, min;
		max = min = data[0]; //무조건 첫 데이터를 max 또는 min으로 지정 
		for(int i = 1; i<data.length; i++) {
			if(max<data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		//배열의 양수 갯수와 음수 갯수를 구해서 출력하시오 
		int pcnt=0, mcnt=0;
		for(int i = 0; i<data.length;i++) {
			if(0<=data[i])
				pcnt++;
		else
				mcnt++;
	}
		System.out.println("양수의 갯수: "+pcnt);
		System.out.println("음수의 갯수: "+mcnt);
	}
}
