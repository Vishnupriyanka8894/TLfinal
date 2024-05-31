package week1.Day2Assignment;

import org.apache.poi.util.SystemOutLogger;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s=122, input=122;
		int output,rem,rev=0,rev1;
	for(i=input;i!=0;i--)
		{
			 rem = input % 10;//2
			rev = rev * 10 + rem;//2  
			//System.out.println("rev is"+rev);
			input= input/10;  //2
			//System.out.println("final output "+s);
			if(input==0)
			{
				break;
			}
		}
		
		System.out.println("Reverse no"+rev);
		System.out.println(+input);
			if(s==rev)
			{
				System.out.println("Given Input no is Palindrome");
			}
			else
			{
				System.out.println("not a Palindrome");
			}
		}
			
			
		}

			
		
	
	
		


		

	


