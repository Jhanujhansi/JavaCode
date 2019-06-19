package sample;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,rev="";
		Scanner sc= new Scanner(System.in);
			str= sc.nextLine();
			int len=str.length();
			for(int i = len-1;i>=0;i--){
				rev= rev+str.charAt(i);
				
			}
			if(str.equals(rev)){
				System.out.println("String is a palindrome");
			}
			else
			{
				System.out.println("Not palindrome");
			}

	}

}
