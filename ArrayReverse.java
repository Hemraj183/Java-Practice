/*
	complete the following program so that it reverses an array of integers
*/

class ArrayReverse {
	public static void main(String[] args) {
		// do not modify the value of numbers
		int[] numbers = {3,5,7,9,12,19,20};

		// write your code here
		int len = numbers.length;
		int[] reverse = new int[len];
		int numberIndex = 0;
		int reverseIndex = len - 1;

		while(numberIndex < len) {
			reverse[reverseIndex] = numbers[numberIndex];
			reverseIndex--;
			numberIndex++; 
		}

		System.out.print("Before reverse: ");
		for(int i = 0; i < len; ++i)
			System.out.print(numbers[i] + ",");

		System.out.print("\nAfter reverse: ");
		for(int i = 0; i < len; ++i)
			System.out.print(reverse[i] + ",");
		System.out.println();

	}
}