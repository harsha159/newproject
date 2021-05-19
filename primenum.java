package programs;

public class primenum {

	public static void main(String[] args) {
		
		String primenumber=" ";
		
		
		for(int i=1;i<=100;i++) {
			
			int c=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					c=c+1;
				}
				
			}
			if(c==2) {
				 primenumber =primenumber+i+" " ;
				 
			}
	
		
			
		}
		
		
		System.out.println(primenumber);
	}
}

