/*
   RBI(Interface)
    getInterestRate()

   class ICICI implements RBI{
      public int getInterestRate(){
        return 10;
      }
   } 
   class HDFC implements RBI{
     public int getInterestRate(){
       return 9;
     }
   }
   class KOTAK implements RBI{
     public int getInterestRate(){
       return 8;
     }
   }
 
 */
import java.util.Scanner;
interface Shape{
    double getArea();
}

class Circle implements Shape{
    public double getArea(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Radius...");
         int r = sc.nextInt();
         return 3.14 * r * r;
     }
}
class Rectangle implements Shape{
    public double getArea(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter length & width...");
         int l = sc.nextInt();
         int w = sc.nextInt();
         return l*w;
     }
}
class TestMain {
   public static void main(String args[]){
      Shape s = null;
      Scanner sc = new Scanner(System.in);
      System.out.println("Press 1 for circle");
      System.out.println("Press 2 from rectangle");
      System.out.println("Enter your choice..");
      int choice = sc.nextInt();
      if(choice == 1)
       s = new Circle();
     else if(choice == 2)
           s = new Rectangle();
     
     if(s!=null)      
      System.out.println("Area : "+s.getArea());

   }    
}
