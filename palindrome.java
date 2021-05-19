package programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
    int n=454;
    int sum=0;
    int r;
     
    int temp = n;
	while(n>0)
    {
		r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10; 
    	
    	}
	if(temp==sum) 
		System.out.println("palindrome");
		
		else
			System.out.println("not");
    		
    
	
	}

}
