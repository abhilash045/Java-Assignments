package abhilash_Asignments;

//WAP on Encapsulation for getter & setter?

public class Assignment122_ {

	private int Pin = 24;

	public int getpin() 
	{  
		return Pin;
	}

	public void setpin(int Pin) {

		this.Pin = Pin;
	}

	public static void main(String[] args) {

		Assignment122_ p1 = new Assignment122_();

		p1.setpin(20);
		System.out.println(p1.getpin());
	}
}
