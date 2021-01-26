/*
	complete the following program so that it replaces all occurances of 5 with 50 and also
	counts the total number of 5 which are replaced
*/

class ReplaceFive {
	public static void main(String[] args) {
		// do not modify the value of numbers
		int[] numbers = {34,23,12,20,5,67,5,12,34,43,5,67,13,76,5,89,13,5,89,76,5,34,54,67,88,5,11,13,5,76};

		// write your code here
		int len = numbers.length;
		int count = 0;

		for(int i = 0; i < len; ++i) {
			if(numbers[i] == 5) {
				numbers[i] = 50;
				count++;
			}
		}

		for(int i = 0; i < len; ++i) 
			System.out.print(numbers[i] + ",");

		System.out.println("\nCount = " + count);
	}
}