package week1.Homeassignment;

public class isprimefinal {

	public static void main(String[] args) {
	
		
int CN ,d,i1=0,i = 0,i2;
	
	
//Running CN from 0-10;
		for(CN=0;CN<=10;CN++)
		{
		for(d=CN;CN/d>=1;d--)//dividing each CN till 1
		{
			{
				int e=CN/d;
				int j=CN%d;//finding the remainder 
				
				if(j==0) //completely divisible satisfies this condition
				{
			
				//System.out.println("fACTORS ARE :"+d);
				i++;
				i2=i+i1; //use some variable to identify how many times control enters in this loop
				//System.out.println(i2);
				if(i2<2)
				{
					continue; 
				}
				else if(i2>=3)
				{
					System.out.println("Not a Prime Number"+CN);
				}
				else
				{
					System.out.println("Prime Number"+CN);
				}
				}
			}
		}
		}
	}

	
}
	
				
				