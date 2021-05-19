package programs;

public class prime3 {

	public static void main(String[] args) {
		
		int i=0;
		int n=0;
		//int c=0;
		String primenum=" ";
		
		for(i=1;i<=100;i++) {
			
			int c=0;
			for(n=i;n>=1;n--) {
				
				if(i%n==0) {
					c=c+1;
					
				}
			}
			if(c==2) {
				primenum=primenum +i+ " " ;
				
			}
		}
		System.out.println(primenum);
		

	}

}
