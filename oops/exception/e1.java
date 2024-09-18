import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
     try{  
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter 1st value");
       int a = sc.nextInt();

       System.out.println("Enter 2nd value");
       int b = sc.nextInt();

       int c = a / b;
       System.out.println("Result : "+c);
       
     }
     catch(ArithmeticException e){
       System.out.println("Denominator can't be zero...");
     }
     catch(java.util.InputMismatchException e){
        System.out.println("please enter integer only...");
     }
     System.out.println("At the end....");
     
    }
}

/*
 We can write multiple catch block corresponding to single try
 but their order must be child to parent
 */