package day0322;


class Member{
	private String name;
	private String hp;
	private String addr;
	
	//생성자
//	Member(){ //디폴트 생성자
//		name = "우태형";
//		hp = "010-7742-6415";
//		addr = "송파구";
//	}
//	Member(String name){ 
//		this.name=name;
//		hp = "010-7742-6415";
//		addr = "송파구";
//	}
//	Member(String name, String hp){
//		this.name=name;
//		this.hp=hp;
//		addr = "송파구";
//	}
//	Member(String name, String hp, String addr){
//		this.name=name;
//		this.hp=hp;
//		this.addr=addr;
//	}
	
	
//	Member(){
//		this("우태형","010-7742-6415","송파구");
//	}
//	Member(String name){
//		this(name,"010-7742-6415","송파구");
//	}
//	Member(String name, String hp){
//		this(name,hp,"송파구");
//	}
//	Member(String name, String hp, String addr){
//		this(name,hp,addr);
//	}
//	Member(String name, String hp, String addr){
//		this.name = name;
//		this.hp=hp;
//		this.addr=addr;
//	}
	Member(){
		this.name = "우태형";
		this.hp = "010-7742-6415";
		this.addr = "송파구";
		
	}
	Member(String name){
		this.name = name;
	}
	Member(String name, String hp){
		this.name=name;
		this.hp = hp;
	}
	Member(String name, String hp, String addr){
		this.name=name;
		this.hp=hp;
		this.addr=addr;
		
	}
//	Member(String name, String hp, String addr){
//		this.name = name;
//		this.hp=hp;
//		this.addr=addr;
	
//	
	
	
	//setter
	public void setName(String name) {
		this.name = name;//인자에 있는 name값을 멤버변수 name으로 전달 (this 생략 불가)
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	//getter
	public String getName(){
		return name; //같은 구역 안에 같은 이름이 없을 경우에만 this 생략 가능 
	}
	
	public String getHp() {
		return hp;
	}
	public String getAddr() {
		return addr;
	}
	
	
}

public class Ex10_ClassMunje {

	public static void writeMember(Member m){
		System.out.println(m.getName()+"의 전화번호는"+m.getHp()+"이고, 주소는"+m.getAddr()+"이다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		Member m2=new Member("이강인");
		Member m3=new Member("손흥민","010-2222-3333");
		Member m4=new Member("Candy","010-444-5555","제주도");
		
		System.out.println("** 멤버 명단 출력 **");
		writeMember(m1);
		writeMember(m2);
		writeMember(m3);
		writeMember(m4);
		
		System.out.println("** m1 멤버의 값 변경하기 **");
		m1.setName("이영자");
		m1.setHp("011-2323-6767");
		m1.setAddr("부산");
		
		writeMember(m1);
	}
}
