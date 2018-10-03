package exercises;

public class TwelveInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numArrays = {1,2,3,4,5,6,7,8,9,10,11,12};
		int total = 0;
		String[] stringArray = {"This", "is", "a", "string", "array"};
		System.out.println("Print numbers from first to last");
		
		for(int i = 0; i < numArrays.length; i++) {
			System.out.println("Numbers in order " + numArrays [i]);
		}
		System.out.println("Print numbers from first to last");
		for(int j = 11; j >= 0; j--) {
			System.out.println("Number in reverse " + numArrays[j]);
			total = total + numArrays[j];
		}
		System.out.println("Total: " + total);		
		for(int z = 0; z<stringArray.length; z++) {
			System.out.println(stringArray[z]);
		}

	}

}
