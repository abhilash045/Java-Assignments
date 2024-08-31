package abhilash_Asignments;

//WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM

class Grandparents 
{
    void add() {
        System.out.println("Addition");
    }

    void sub() {
        System.out.println("Subtraction");
    }
}

abstract class Father extends Grandparents 
{
    abstract void multiply();
    abstract void divid();

    void Animals()
    {
        System.out.println("Animals");
    }

    void Tiger() 
    {
        System.out.println("Tiger");
    }
}

//Subclass with 2 concrete methods (CM) and implementation of abstract method

public class Assignment46_ extends Father 
{
	@Override
	void multiply()
	{	
		System.out.println("This is Multicpication");	
	}

	@Override
	void divid() 
	{
		System.out.println("This is division");
	}
	 
	//concrate methods
	
	 void College()
	 {
	        System.out.println("Jayamukhi College");
	 }

	 void Department()
	 {
	        System.out.println("Mechanical Department");
	 }
	
	 public static void main(String[] args)
	 
	 {
		 Assignment46_ A1 = new Assignment46_();
		 
		// Accessing methods from different classes by creating an object for subclass
		 
	        A1.add();         // Inherited from Grandparents
	        A1.sub();         // Inherited from Grandparents
	        A1.multiply();    // Implemented in Assignment46_
	        A1.divid();       // Implemented in Assignment46_
	        A1.College();     // Defined in Assignment46_
	        A1.Department();  // Defined in Assignment46_
	        A1.Tiger();       // Inherited from Father
	        A1.Animals();     // Inherited from Father
	 }
	
}
