
public class LargestNumber {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 120;
		int z = 15;
		
		if(x>y && x>z)
		{
			System.out.println("X is largest");
		}else if(y>x && y>z)
		{
			System.out.println("Y is largest");
		}else if(z>x && z>y)
		{
			System.out.println("Z is largest");
		}
	}
}
