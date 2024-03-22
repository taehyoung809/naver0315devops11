package day0319;

import java.util.Calendar;
import java.util.Date;

public class Ex9_DateCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date 클래스를 이용해서 년, 월, 일, 시, 분, 초 얻기(JDK1.1 이후 Deprecated 되고 Calender를 권장하나 여전히 많이 사용중)

		Date date = new Date();
		int year = date.getYear(); // 1900 빠진 값으로 반환
		int month = date.getMonth()+1; //0 representing January
		int day = date.getDate();
		int week = date.getDay(); //0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();

		System.out.println("현재 년도: "+year);
		System.out.println("현재 월 : "+month);
		System.out.println("현재 일: "+day);
		System.out.println("현재 요일: "+week+"("+
				(week==0? "일":week==1? "월":week==2? "화":week==3? "수":week==4? "목":week==5? "금": "토")
				+")");
		System.out.printf("%d시 %d분 %d초 \n", hour, min, sec);
		System.out.println("=".repeat(30));
		
		System.out.println("Calendar를 이용해서 출력하기"); //자주 쓰지는 않는다
		Calendar cal = Calendar.getInstance(); //생성자가 public이 아니라 new 로 생성 불가
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1; // 0 : 1월
		day = cal.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 입니다.\n",year,month,day);
	}

}
