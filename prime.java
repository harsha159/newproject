package programs;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int n=0;
		String primenumber=" ";
		
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
				primenumber = primenumber + i + " ";
			}
			
		}
		System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primenumber);
		
	}

	}

