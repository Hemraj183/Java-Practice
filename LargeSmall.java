/* 
	complete the following program to find the largest and smallest element from an array of integers
	print the largest and smallest number according to the output given in output.txt
*/

class LargeSmall {
	public static void main(String[] args) {
		// do not modify the value of numbers
		int[] numbers = {3,2,6,7,9,8,6,2,12,23,34,5,76,56,89,22,45,65,45,98,78,67,76,34,4,56,12,98,102,103,901,945,1,122,145,234,543,567,999,154,566,65};

		// write your code here
		int len = numbers.length;
		int largest = numbers[0], smallest = numbers[0];

		for(int i = 1; i < len; ++i) {
			if(numbers[i] > largest) 
				largest = numbers[i];
			else if(numbers[i] < smallest)
				smallest = numbers[i];
		}

		System.out.println("Largest = " + largest);
		System.out.println("Smallest = " + smallest);
	}
}