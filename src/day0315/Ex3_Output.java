package day0315;

public class Ex3_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2024;
		int month = 3;
		int day = 5;
		
		String msg = "Have a nice day!";
		char blood = 'b';
		double avg = 97.4567;
		
		System.out.println("**출력1**");
		System.out.println("날짜:"+year+"-"+month+"-"+day);
		System.out.print("혈액형 :"+blood+"형");//print는 개행 안함
		System.out.println("\t평균: "+avg); //\t 
		System.out.println("===========================");
		
		
		//printf 를 용해서 출력해보자
		//변환기호를 이용해서 출력한다
		//정수: %d, 실수: %f, 문자: %c, 문자열: %s
		System.out.printf("**%s**\n",msg);
		System.out.printf("**%40s**\n\n",msg); //40칸의 우측 기준으로 출력 
		System.out.printf("**%-40s**\n\n",msg); //40칸의 좌측 기준으로 출력 
		
		
		System.out.printf("날짜: %d-%d-%d\n",year,month,day);
		System.out.printf("날짜: %2d-%2d-%2d\n",year,month,day); //두칸에 한글자가 들어감(자리수를 맞춰야 할 때)
		System.out.printf("날짜: %02d-%02d-%02d\n",year,month,day); //두자리가 안되면 0이 채워짐 
		
		System.out.printf("나의 혈액형은 %c형 입니다.\n",blood);
		
		System.out.printf("평균:%f\n",avg); //소수점 이하가 6자리로 출력
		System.out.printf("평균:%3.1f\n",avg); //전체 자리수 3자리 중 소수점 1자리 
		System.out.printf("평균:%3.1f\n",avg); //전체 자리수 3자리 중 소수점 1자리 
		System.out.printf("평균:%10.2f\n",avg); //전체 자리수 10자리(자리가 남을 경우 공백처리) 중 소수점 2자리
		System.out.printf("평균:%10.2f점\n",avg); //전체 자리수 10자리(자리가 남을 경우 공백처리) 중 소수점 2자리
		System.out.printf("평균:%-10.2f점\n",avg); //전체 자리수 10자리(왼쪽으로 출력, 자리가 남을 경우 공백처리) 중 소수점 2자리
		System.out.printf("평균:%20.7f점\n",avg); //전체 자리수 20자리(자리가 남을 경우 공백처리) 중 소수점 7자리(남을 경우 0으로 표시)
		System.out.printf("평균:%-20.7f점\n",avg); //전체 자리수 20자리(왼쪽으로 출력, 자리가 남을 경우 공백처리) 중 소수점 7자리(남을 경우 0으로 표시)
		}

}
