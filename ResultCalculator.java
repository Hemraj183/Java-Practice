import java.util.Scanner;
public class ResultCalculator
{
    public double calculate(double [] marks){
        double sum = 0.0;
        for(int i = 0; i < marks.length; i++){
            sum += marks[i]; 
        }
        double percentage = sum / marks.length;
        return percentage;
    }
    
    public static void main (String [] args){
        double []a = new double[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter marks: ");
            a[i]  = sc.nextDouble();
        }
        ResultCalculator rc = new ResultCalculator();
        double p = rc.calculate(a);
        System.out.println(p);
    }
}
