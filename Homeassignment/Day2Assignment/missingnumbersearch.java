package week1.Day2Assignment;

import java.util.Arrays;

public class missingnumbersearch {
	
	public static void main(String[] args) {
		int a[]= {1,4,3,2,8,6,7};
		//1,2,3,4,6,7,8
		int b=a.length;
		System.out.println(b);
		Arrays.sort(a);
		
		for(int i=0;i<b;i++)
		{
			System.out.println(a[i]);
		if(a[i]!=i)
		{
			System.out.println("This number is missing"+i);
		}
		}
		
	}

	}


