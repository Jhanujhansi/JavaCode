package sample;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int temp,a, sum=0;
		int n =153;
		temp = n;
		
		while(n>0){
			
			a=n%10;
			n=n/10;
			sum = sum+(a*a*a);
			
		}
if(temp==sum)
{
	System.out.println("armstrong");
}
else
{
	System.out.println("not Armstrong");
}
	}

}
