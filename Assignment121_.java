package abhilash_Asignments;

//this keyword ?

public class Assignment121_ {

	String name;
	int no;
	int MobileNo;

	void candidate(int no, double salary, String name) {
		this.name = name;
		this.no = no; // local to global
		this.MobileNo = MobileNo;
		
	}

	public static void main(String[] args) {

		Assignment121_ en = new Assignment121_();

		en.candidate(42, 894561230, "Abhilash");

		System.out.println(en.name);
		System.out.println(en.MobileNo);
		System.out.println(en.no);
	}

}
