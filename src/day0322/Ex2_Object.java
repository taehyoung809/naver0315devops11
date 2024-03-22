package day0322;


class Orange {
	//private 접근 지정자는 같은 클래스 내에서만 접근 가능
	//클래스 멤버변수는 자동으로 초기화
	private String name;
	private int age;
	
	private static String company="삼성";
	
	//getter 메서드 : 멤버변수값을 반환하는 메서드(규칙: getName, gatAge(첫 글자를 대문자로))
	public String getName(){
//		return this.name; //자기 자신을 의미하는 인스턴스 변수(일반 멤버 메서드에만 존재, static 메서드에는 없음)
		return name; //같은 구역 안에 같은 이름이 없을 경우에만 this 생략 가능 
	}
	
	public int getAge() {
		return age;
	}
	
	
	//setter 메서드 : 외부로부터 값을 받아서 멤버변수의 값을 변경
	public void setName(String name) {
		this.name = name;//인자에 있는 name값을 멤버변수 name으로 전달 (this 생략 불가)
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//static 변수를 반환하는 메서드
	public static String getCompany() {
		return company;
	}
	
}

public class Ex2_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orange orange = new Orange();
		System.out.println("초기값 확인");
		System.out.println("name: "+orange.getName());
		System.out.println("name: "+orange.getAge());
		
		System.out.println("이름과 나이 변경후 출력");
		orange.setName("옥순이");
		orange.setAge(23);
		System.out.println("name: "+orange.getName());
		System.out.println("age:" +orange.getAge());
		
		System.out.println("회사명: "+orange.getCompany()); //static 메서드가 있으면 new로 생성하지 않아도 가능 
	}

}
