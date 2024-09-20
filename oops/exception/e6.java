/*
 throw :-
 throws
 public class Exception extends Throwable{
    private String msg;
    public Exception(String msg){
    this.msg = msg;
    }
    public Exception(){}  
 }

 */
import java.util.Scanner;
class InvalidVoter extends Exception{
   public InvalidVoter(){
    super("Abi app chote hai | can't vote");
   }
}
class TestMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        try{
         if(age < 18)
           throw new InvalidVoter();
         else
           System.out.println("Valid Voter | can vote");  
        }
        catch(InvalidVoter e){
            e.printStackTrace();
        }          
    }
}
