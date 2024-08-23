import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter 1 value");
      int a = sc.nextInt();

      System.out.println("enter 2 value");
      int b = sc.nextInt();

      System.out.println("enter 3 value");
      int c = sc.nextInt();
      /*
       int d = (a>b) ? a : b;
       int max = (d > c) ? d : c;
      */
     int max = (a > b && a > c) ? a : (b>c) ? b : c; 
     System.out.println("Greater value : "+max);
    }
}