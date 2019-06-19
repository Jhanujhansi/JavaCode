package sample;

public class SwappingThirdVar {

	public static void main(String[] args) {
		int a=2,b=3, c;
		
		//c=a;
		//a=b;
		//b=c;
		
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(+a);
		System.out.println(+b);
	}

}
