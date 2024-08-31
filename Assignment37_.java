package abhilash_Asignments;

//Single inheritance using static and nonstatic methods

class parent // parent class
{
	static void add() // static method
	{
		int a = 20;
		int b = 30;

		int sum = a + b;

		System.out.println(sum);
	}
}

public class Assignment37_ extends parent // child class
{
	void sub() // non static method
	{
		int a = 10;
		int b = 5;

		int sub = a - b;

		System.out.println(sub);
	}

	public static void main(String[] args) {
		
		add(); // we can call non static directly

		Assignment37_ c1 = new Assignment37_(); // creating an object for child class
	
		c1.sub(); // we can call with the help of object

	}
}
