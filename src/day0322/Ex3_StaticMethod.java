package day0322;

class MyShop{
	private String sangpum;
	private int su, dan;
	private static String message; //static - 공유되는 값 
	public static final String SHOP = "24시간 이마트";
	//setter method
	public void setSangpum(String sangpum) {
		this.sangpum=sangpum;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
	static public void setMessage(String message) {
		//static 멤버변수는 같은 구역에 같은 이름의 변수가 있을 경우 앞에 클래스명을 생략하지 말고 써준다 
		MyShop.message = message;
	}
	
	//상품명, 수량, 단가를 한번에 변경하고 싶을경우
	public void setData(String sangpum, int su, int dan) {
		//메서드 안에서 같은 멤버 메서드는 this로 호출이 가능
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);
	}
	//overloading method(중복수): 메서드명은 같으나 인자가 달라야한다(타입 갯수 등등)
	public void setData(String sangpum, int su, int dan, String message) {
		//메서드 안에서 같은 멤버 메서드는 this로 호출이 가능
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);
		
		//인스턴스 메서드에서 static 메서드 호출이 가능할까? - 가능 
		setMessage(message); //앞에 클래스명은 같은 클래스라 생략한다 
		//반대로 static메서드에서 인스턴스 멤버 메서드를 호출할 수 있을까? - 불가능 
		//static 메서드에서 static 메서드 호출 가능할까? - 가능 
	}
	
	//출력은 getter 가 아닌 일반 멤버 메서드로 만들어보자 
	public void writeData() {
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su+",단가: "+dan);
		System.out.println("총 금액: "+su*dan);
		System.out.println("오늘의 메세지: "+message);
		System.out.println("=".repeat(20));
	}
	
}
public class Ex3_StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyShop sang1 = new MyShop();
		MyShop sang2 = new MyShop();
		MyShop sang3 = new MyShop();
		
		System.out.println("**상품1**");
		sang1.setSangpum("딸기");
		sang1.setSu(3);
		sang1.setDan(2300);
		MyShop.setMessage("오늘 각종 과일 세일합니다!"); //static 메서드는 클래스명으로 호출 
		
		sang1.writeData();
		
		System.out.println("**상품2**");
		sang2.setData("수박",2,30000);
		sang2.writeData();
		
		System.out.println("**상품3**");
		sang3.setData("참회", 5, 2000,"오늘 세일 마감!");
		sang3.writeData();
		
		System.out.println("**상품1 다시출력**");
		sang1.writeData();

		System.out.println("**상품2의 수량만 변경**");
		sang2.setSu(6);
		sang2.writeData();
		
	}

}
