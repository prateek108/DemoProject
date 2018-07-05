
public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial Program
		int n=10,fact = 1;
		
		for(int i=1; i<=n ; i++){
			fact = fact*i;
			System.out.println("Factorial of "+i+" : "+fact);
		}
		
		//Print *
		for(int row=1; row<=10; row++){
			for(int col=1; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Print reverse number
		int number = 123,reverse = 0;
		
		while(number != 0){
			reverse = reverse * 10;
			reverse = reverse + number%10;
			number = number/10;
		}
		System.out.println("Reverse number is :"+reverse);
	}
}
