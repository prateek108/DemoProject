
public class Practice1 {
	
	public static void main(String[] args) {
		
		String[] array = {"John","Amy","Clara","Adam","Eve"};
		
		System.out.println("Printing from standard for loop");
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Index: "+ i +" "+ array[i]);
			
		}
		System.out.println("Printing from for each loop");
		for (String string : array) {
			
			System.out.println("Names :"+string);
		}
	}

}
