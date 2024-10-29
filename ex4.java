import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //write a java program that convert a string to integer and vice versa 

       // collecting data from user  
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number ");
        String  number = scanner.next();
        System.out.print("please enter number");      
        String  number2 = scanner.next();
        System.out.println("plese ented the number int");
        int numberinit1 =scanner.nextInt();
        System.out.println("plese ented the number int");
        int numberinit2 =scanner.nextInt();
        scanner.close(); 
         
        // convert from string to int 

       int n1 = Integer.parseInt(number);
       int n2 = Integer.parseInt(number2);
       
       
        System.out.println(number + number2);
        System.out.println(n1+n2); 

      //convert from  int to string 
       

        String n3 = String.valueOf(numberinit1);
        String n4 = String.valueOf(numberinit2);
        System.out.println(numberinit1+numberinit2);
        System.out.println(n3+n4); 












        




    }
}
