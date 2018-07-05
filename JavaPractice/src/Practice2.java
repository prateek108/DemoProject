
public class Practice2 {

	public static void main(String[] args) {
		
		evenOddNumber(21);
	}
	
	public static void evenOddNumber(int no){
		int rem = no % 2;
		
		if (rem==0){
			System.out.println("Number "+ no + " is a Even Number");
		}
		else{
			System.out.println("Number "+ no + " is a Odd Number");
		}		
		
	}
	
	
}
