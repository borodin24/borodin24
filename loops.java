public class loops {
    public static void main(String[] args) {
       // get the  squares of the first 5 integers 

       /*System.out.println(1+" squared = " + (1*1));
       System.out.println(2+" squared = " + (2*2));
       System.out.println(3+" squared = " + (3*3));
       System.out.println(4+" squared = " + (4*4));
       System.out.println(5+" squared = " + (5*5)); */

       // using for loop 
      
        /*for ( int i =1; i<=5; i++ ){

        System.out.println( i + "squared ="+ (i*i));
       } */

       //Nested Loops 

       for ( int i =1; i<=5; i++ )
       { 
        //for spaces 
        for ( int k =0; k<=i-1; k++ ){           

            System.out.print(" ");
       }

       //star loop 
         for ( int j =5; j>=i; j-- ){           

            System.out.print("*");
       }
       System.out.println();
                  
       }

       







    }
}
