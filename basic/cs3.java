/*
  n > 0 
  n < 0
  n == 0
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();
      
      if( n > 0 )
        System.out.println("+ve");
      else if(n < 0)
          System.out.println("-ve");  
        else
          System.out.println("Neither +ve nor -ve");
      
    }
}