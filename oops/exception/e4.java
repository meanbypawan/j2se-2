/*
 try{
   s---1;  ----> IME
   s---2;  ----> AE
   s---3; 
   s---4 
}
catch(IME e){}
catch(AE e){}
catch(Exception e){}
 */
import java.util.Scanner;
class TestMain {
   public static void main(String args[]){
    try{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter 1st value");
      int a = sc.nextInt();
      
      System.out.println("Enter 2nd value..");
      int b = sc.nextInt();

      int c = a/b;
      System.out.println("Result : "+c);

    }
    catch(Exception e){
        System.out.println("Oops! something went wrong..");
    }
    System.out.println("At the end.....");
   }    
}
