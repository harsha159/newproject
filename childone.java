package programs;

public class childone extends parentone {
	
	
	public childone() {
		System.out.println("harsha construtor");
	}
	

	
	public void walk() {
		System.out.println("walk on road");
	}
	public void walk(int i)
	{
		System.out.println(i);
	}
	public void walk(String i,String j)
	{
		System.out.printf(i,j);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        childone p=new childone();
        
		
		p.walk();
		p.walk("Walking on street");
		p.walk("jogging","walking on");
		p.run();
		p.walk("walking on footpath");
		p.run();
		
	}

}
