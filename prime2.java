package programs;                       

public class prime2 {
	
	public static void main(String[]args)
	{
	int i=0;
	int n=0;
	 
	String primenum=" ";
	
	
	for(i=1;i<=10;i++)
	{
		int counter=0;
		for(n=i;n>=1;n--)
		{
			if(i%n==0)
			{
				counter=counter+1;
				
			}
		}
			if(counter==2)
			{
				primenum=primenum +i+" ";
		}
	}
		System.out.println(primenum);
			
		
	}
	
	}


