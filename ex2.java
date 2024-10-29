import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(); 
        System.out.println("Please enter the second number: ");
        int n2 = scanner.nextInt(); 
        scanner.close();
         if (n1==n2){
            System.out.println(n1+"="+n2);
            }
        else if (n1>n2){
            System.out.println(n1+">"+n2);
         }
         else {
            System.out.println(n1+"<"+n2);
         }
       

        //write a java program that copare 2 numbers entered by user 
    }
}
