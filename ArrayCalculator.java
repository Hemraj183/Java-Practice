import java.util.Scanner;
public class ArrayCalculator
{
   public void even(int size){
       int []a = new int[size];
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i < size ; i++){
           System.out.println("Enter numbers: ");
           a[i] = sc.nextInt();
       }
       
       for(int i = 0; i < size ; i++){
           if(a[i]%2 == 0){
            System.out.println(a[i]);
            }
       }
   }
   
   public static void main(String [] args){
       ArrayCalculator ac = new ArrayCalculator();
       ac.even(4);
   }
}
