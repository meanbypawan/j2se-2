/*
 1500000-2000000 : salary : 100000
 2000000-2500000 : salary : 150000
 > 2500000       : salary : >150000
 */
import java.util.Scanner;
class LoanException extends Exception{
  public LoanException(){
    super("Not Eligible For Loan Amount | Salary is less");
  }
}
class TestMain {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Loan Amount...");
      int amount = sc.nextInt();
      System.out.println("Enter Salary");
      int salary = sc.nextInt();
      try{
      if(salary < 100000 && amount > 2000000)
        throw new LoanException();
      else if((salary > 100000 && salary < 150000) && amount > 2500000)
          throw new LoanException();
      else
        System.out.println("Loan approved....");
      }    
      catch(LoanException e){
        e.printStackTrace();
      } 
    }
}
