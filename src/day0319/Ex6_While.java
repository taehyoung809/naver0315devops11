package day0319;

public class Ex6_While {
	public static void main(String[] args) {

		int n=10;
		//선조건: 조건이 맞지 않으면 바로 반복문을 빠져나간다.
		while(n>10) {
			System.out.println("Hello #1");
		}
		System.out.println();


		//후조건: 일단 로직을 처리한 후 조건을 비교하여 빠져나간다.
		do {
			System.out.println("Hello #2");
		}while(n>10);


		//10 출력#1
		int a = 1;
		while(a<=10) {
			System.out.printf("%3d",a++); //후치 - 10까지 출력.
		}

		System.out.println();

		//10 출력#2
		a=1;
		while(true)
		{System.out.printf("%3d",a++);
		if(a>10)
			break;
		}
		System.out.println();

		
		
		char ch = 'A';
		while(true) {
			System.out.printf("%3s",ch++);
			if(ch>'Z')
				break;
		}
			
			}
		}
	


