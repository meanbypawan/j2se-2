/*
  Controll Statement / Conditional Statement
  if
  if-else
  nested-if-else
  loop
    while, do-while, for
  switch  
 --------------------

 1. if(condition/BE)
   statement----1;

2. if(condition/BE)
    statement-----1;
    statement-----2; 
3. if(condition/BE){
    s-----------1;
    s-----------2;
   }    
 4. if(condtion/BE){
      state--------1;
      s------------3;
    }  
    else{
      state--------2;
      state--------3;
    }
 */
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value");
    int n = sc.nextInt();
    if(n > 10){
      System.out.println("Indore");
      System.out.println("Hello...");
    }
    else
     System.out.println("Pune");  
  }
}