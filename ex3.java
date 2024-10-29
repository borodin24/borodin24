import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
         // write a java program that compare the sum of digits of a number 
         // example : number : 27 ---> sum of digits is 9 


         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter number");
         int number = scanner.nextInt();
         scanner.close();
         int sum = 0;
                
         while (number !=0)
         
         {sum  = sum + number%10;
            number= number/10;
        
         }    
         System.out.println(sum);     
            



         }








    }
