package abhilash_Asignments;

//upcasting implicity and explicitly and downcasting?

class human  //Parent Class
{
	void add()
	{
		System.out.println("Addition");
	}
}

public class Assignment120_  extends human   //Child class
{  
	
	public static void main(String[] args) 
	{
		
		human h1 = new human();  //upcasting implecitily 
		
		h1.add();
		
		
		human h2 = (human) new Assignment120_();  //upcasting explicitly
		h2.add();
		
	}

}
