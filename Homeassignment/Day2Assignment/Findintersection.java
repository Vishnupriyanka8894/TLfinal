package week1.Day2Assignment;

public class Findintersection {

	public static void main(String[] args) {
	
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
	int c=a.length;
	int d=b.length;
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<d;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println("The numbers are matching"+a[i]);
			}
		}
	}
	
		

	}

}
