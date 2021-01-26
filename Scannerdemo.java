import java.until.scanner;

public class scannerDemo{
	public static void main(String[] args){
	scanner sc = new sacnner (System.in);
	System.out.print("Enter 1st number:");
	int firstNumber= sc.nextInt();
	System.out.print("Enter 2st number:");
	int secondNumber= sc.nextInt();
	int sum=firstnumber + secondNumber;
	System.out.println("sum+"+ sum);
	sc.close();
	}
}