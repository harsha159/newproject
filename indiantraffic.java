package programs;

public class indiantraffic implements rules {

	
	static  String rule="walk";
	 
      
  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rules rs=new indiantraffic();
		rs.redstop();
		rs.greengo();
		rs.yellowflash();
				
		
	}
	
		

	
	public void greengo()  {
		// TODO Auto-generated method stub
		System.out.println("go");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

	@Override
	public void yellowflash() {
		// TODO Auto-generated method stub
		System.out.println("flash");
	}

}
