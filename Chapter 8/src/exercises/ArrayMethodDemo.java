package exercises;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayNums = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		int average = 0;
		
		System.out.println("Integers");
		for(int i = 0; i < arrayNums.length; i++) {
			System.out.println("" + arrayNums [i]);
		
		}
		displayMessage(arrayNums, total);
		displaySum(arrayNums, total);
	}

	public static void displayMessage(int [] arrayNums, int total ) {
		System.out.println("Integers in reverse");
		for(int j = 9; j >= 0; j--) {
			System.out.println("" + arrayNums[j]);
			total = total + arrayNums[j];
		}
	}
	public static void displaySum(int [] arrayNums,int total) {
		System.out.println("The sum of the integers");
		for(int z = 0; z < arrayNums.length; z++) {
			total = total + arrayNums[z];
		}
		System.out.println("" + total);
		
	}
	public static void displayHighAverage(int [] arrayNums, int average) {
		System.out.println("");
		
	}

}
