package day0319;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_DateNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 날짜를 문자열로 출력하기
		Date date = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEEE");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E");
		System.out.println(sdf3.format(date));
		
		//숫자 포멧 양식 지정하기
		int money = 567890000;
		double average = 98.7656;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //화폐단위와 3자리마다 ','가 추가되서 출
		System.out.println("1: "+nf1.format(money));
		
		//따로 생성 없이 메서드 호출해도 된다 
		System.out.println("2: "+NumberFormat.getInstance().format(money));
		System.out.println("3: "+NumberFormat.getCurrencyInstance().format(money));
		
		//평균값을 소숫점 이하 1자리로 출력하기 (자주 안씀)
//		System.out.println(NumberFormat.getInstance().setMaximumFractionDigits(1));
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(1); //소수점 이하값 지정 
		System.out.println(nf2.format(average)); //자동 반올림 
	}

}
