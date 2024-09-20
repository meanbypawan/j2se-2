/*
 try
 catch
 finally
 ------------------------
 1. try{}
    catch(Exeption e){}
--------------------------
2. try{}
   catch(AE e){}
   catch(Exception e){}
-----------------------
3. try{} // Invalid
   catch(Exception e){}
   catch(AE e){}   
---------------------------
4. try{}
   catch(AE e){}
   catch(Exception e){}
   finally{}
-----------------------------
5. try{}
   catch(Exception e){}
   finally{}
----------------------
6. try{====}
   finally{}  ==> valid             
---------------------------
7. try{}
   catch(Ex e){}
   finally{}
   finally{}  ===> invalid
------------------------------
8. try{
     ----
     ----
     try{====}
     catch(){===}
     finally{}
   } 
   catch(Ex e){
     try{}
     catch(){}
     finally{}
   }
   finally{
      try{}
      catch(){}
      finally{}
   }  
   */
import java.util.Scanner;
class TestMain {
    public static void main(String args[]){
        try{
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
            System.out.println("Inner catch executed...");
           }
           finally{
            System.out.println("Inner Finall Executed...");
           }
          }
          catch(Exception e){
              System.out.println("Catch executed | Exception caught");
          }
          finally{
            System.out.println("Finally executed...");
          }
      
    }
}
