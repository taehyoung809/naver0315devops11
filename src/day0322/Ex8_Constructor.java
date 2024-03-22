package day0322;

/*
 * <생성자>
 * 초기값을 주기 위해 생성(초기화)
 * 
 * <생성자(constructor)의 특징>
 * 1. 클래스명과 동일한 메서드명으로 만들어야한다.
 * 2. 리턴 타입이 없다.(void,int 등)
 * 3. overloading이 가능하다(여러개 생성가능)
 * 4. 생성할 때 단 한번 호출된다.
 * 5. 멤버변수의 초기화를 담당한다.
 */


class Kiwi{
	String name,addr;
	
	Kiwi(){//디폴트 생성자1(괄호 안에 아무것도 없어서)
		System.out.println("디폴트 생성자.");
		name = "이미자";
		addr = "서울";
	}
	
	Kiwi(String name){//생성자2
		this.name=name;//자기 자신을 칭할때 
		addr="제주";
	}
	Kiwi(String name, String addr){//생성자 3
		this.name=name;
		this.addr=addr;
	}
	
	public void show() { //메서드
		System.out.println(name+"님은 "+addr+"에 살고있다");
	}
}

public class Ex8_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kiwi k1 = new Kiwi();
		k1.show();
		
		Kiwi k2 = new Kiwi("강호동");
		k2.show();
		
		Kiwi k3 = new Kiwi("영숙이","부산");
		k3.show();

	}

}
