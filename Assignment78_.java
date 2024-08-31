package abhilash_Asignments;

//WAP on if number 15 is present,find out its indexing  ?

public class Assignment78_ {
	
	public static void main(String[] args) {
		
        int[] Number = new int[5];  // created the array and stored the values

        Number[0] = 10;
        Number[1] = 20;
        Number[2] = 15;
        Number[3] = 40;
        Number[4] = 50;

        int toNumberCheck = 15;  // creating a variable to store the number to check

        boolean number_is_present = false;  // to check if the number is found

        for (int i = 0; i < Number.length; i++) // for loop for array
        {  
            if (toNumberCheck == Number[i]) 
            	
            {  // check if the number is present in the array
            	
            	number_is_present = true;
            }
        }

        if (number_is_present)
        {
            System.out.println("Number 15 is available");
        } else 
        {
            System.out.println("Number 30 is not available");
        }
    }

}
