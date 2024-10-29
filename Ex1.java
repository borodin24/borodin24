import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
       //write a java program that calculates the factorial of 10 
       
         System.out.println("Please Enter your number");

        //get the enter values from user 

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        scanner.close();

        int result = 1;
         
        for (int i=2;i<=n;i++){
          result = result*i;
        }
        System.out.println("the factorial of "+n+" is "+result);
    }

           
}
