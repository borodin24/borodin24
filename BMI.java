import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        

        //float w = 0f;
        //float h = 0f; 
        System.out.println("Please Enter your Weight");

        //get the enter values from user 

        Scanner scanner = new Scanner(System.in);
        float w = scanner.nextFloat();

        System.out.println("Please Enter your Height");
        float h = scanner.nextFloat();
        scanner.close();
        float  bmi = w/ (h*h);
        
        System.out.print("BMI="+bmi);





    }
}
