package abhilash_Asignments;

//WAP with assert keyword?

public class Assignment116_ {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int sum = a + b;

		assert sum > 20 : "Number is wrong"; // using assert key word if it "true " it will start excuting "false" it
												// stops excuting

		System.out.println("sum output :-" + sum);

		assert sum < 10 : "number is grater "; //// using assert key word

		System.out.println(sum);

	}

}
