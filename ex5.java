import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //write  a program to dispay prime numbers from 1 to n 
        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the start of the range ");
        int nstart = scanner.nextInt();
        System.out.println("Please introduce the end of the  range ");
        int nend = scanner.nextInt();

        for (int i= nstart;i<=nend;i++){
            for (int j=1;j<=nend;j++)
          {


          }  


        };*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the start of the range ");
        int ninsert = scanner.nextInt();
        scanner.close();
        String primeNumbers = "";
        int num = 1;
        
        for (int i =1; i<=ninsert;i ++){

            int counter = 0;
            for (num=i;num>=1;num--)
            {

                if (i%num==0){
                    counter++;
                }
            }
            if (counter==2){
                primeNumbers = primeNumbers +i + ""; 
            }

           


        }
        System.out.print(primeNumbers);







        



    }
}
