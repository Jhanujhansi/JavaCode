package sample;

public class PalindromeNumber {

	public static void main(String[] args) {
		int temp, n= 151, a,sum=0;
		temp=n;
		while(n>0){
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}
		if (temp==sum){
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
