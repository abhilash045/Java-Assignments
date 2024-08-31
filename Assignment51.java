package abhilash_Asignments;

//WAP to access the 4 access specifiers within the same class

public class Assignment51 
{  
	public void add()    //	//Non-Static Method!
	
	{ System.out.println("This is public Method"); }
	
	private void sub()
	
	{System.out.println("This is private Method");}
	
	protected void divid ()
	
	{System.out.println("This is protected Method"); }
	
	void mul()
	
	{System.out.println("This is Default Method");}
	
	public static void main(String[] args) 
	{
		Assignment51 a1 = new Assignment51();
		
		a1.add();
		a1.divid();
		a1.mul();
		
	    // a1.sub(); we cant access the private access
	}

}
