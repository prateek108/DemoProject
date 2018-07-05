
public class SwapNumbers {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int temp;
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping X : "+x+ " Y : "+y );
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swapping X : "+x+ " Y : "+y );
		
		for(String c : args)
		{
			System.out.println(c);
		}
		
		System.out.println("Before Swapping A : "+a+ " B : "+b);
		
		a = a+b; 	//a = 300
		b = a-b; 	//b = 100
		a = a-b; 	//a = 200	
		
		System.out.println("After Swapping A : "+a+ " B : "+b);
		
	}
	
	

}
