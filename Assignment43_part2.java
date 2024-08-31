package abhilash_Asignments;

//method overriding super keyword parameterized

class Instagram
{
    void message(String message) 
    {
        System.out.println("output superclass: " + message);
    }
}

class Facebook extends Instagram 
{
    //Override there should me same method in parent class and sub class
	
    void message(String message) 
    {    
    	//super keyword with parameterized 
        super.message("This is a message from Instagram");
        
        System.out.println("output Subclass: " + message);
    }
}

public class Assignment43_part2
{
    public static void main(String[] args)
    {
        Facebook f1 = new Facebook();
        f1.message("This is a message from Facebook");
    }
}

