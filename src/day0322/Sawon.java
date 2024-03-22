package day0322;

public class Sawon {
	private String name;
	private int gibon;
	private int sudang;

	//getter 메서드 : 멤버변수값을 반환하는 메서드(규칙: getName, gatAge(첫 글자를 대문자로))
		public String getName(){
			return name; //같은 구역 안에 같은 이름이 없을 경우에만 this 생략 가능 
		}
		
		public int getGibon() {
			return gibon;
		}
		
		public int getSudang() {
			return sudang;
		}
		
		public void setSawon(String name, int gibon, int sudang) {
			setName(name);
			setSudang(sudang);
			setGibon(gibon);
		}
		
		//실수령액 반환
		
		public int getNetPay() {
			int pay=0;
			pay=gibon-(gibon*3/100)+sudang;
			return pay;
		}
		
		//setter 메서드 : 외부로부터 값을 받아서 멤버변수의 값을 변경
		public void setName(String name) {
			this.name = name;//인자에 있는 name값을 멤버변수 name으로 전달 (this 생략 불가)
		}
		
		public void setGibon(int gibon) {
			this.gibon = gibon;
		}
			
			public void setSudang(int sudang) {
				this.sudang = sudang;
			
			
		}
}
