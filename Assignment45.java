package abhilash_Asignments;

//WAP in which abstract class is present along with concrete class

//Abstract class with two abstract methods
abstract class Moniter
{
 abstract void Keyboard();
 abstract void Mouse();
}

//Concrete class extending the abstract class
public class Assignment45 extends Moniter 
{

 // Implementing the abstract method Keyboard()
 void Keyboard()
 {
     System.out.println("This is KeyBoard");
 }

 // Implementing the abstract method Mouse()
 void Mouse() 
 {
     System.out.println("This is Mouse");
 }

 // Concrete method
 void concreteMethod()
 {
     System.out.println("This is a concrete method in the concrete class.");
 }

 public static void main(String[] args)
 {
     // Create an instance of the concrete class
	 
     Assignment45 ac = new Assignment45();

     // Call the implemented abstract methods
     ac.Keyboard();
     ac.Mouse();

     // Call the concrete method
     ac.concreteMethod();
 }
}


