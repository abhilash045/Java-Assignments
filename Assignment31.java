package abhilash_Asignments;

//WAP on area of circle using math.random five times using for loop

public class Assignment31 // creating the class

{
	public static void main(String[] args) // main method
	{
		   //for  Loop statement
		for (int i = 1; i <= 5; i++) {
			
			//Generate a random radius between 0 and 10

			double radius = Math.random() * 10;

			// area of the circle
			double area = Math.PI * radius * radius;

			System.out.println("Circle " + i); // this syout is used to create circle variable name 1

			System.out.println("Area of the circle: " + area);
		}
	}
}
