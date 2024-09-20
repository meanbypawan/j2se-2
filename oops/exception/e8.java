/*
 throws [Developer | Java Team]:- 
  It is used to declare the exception in method | constructor
  throws propogate the exception to the calling method
  You can declare multiple exception with throws
 
  Types of Exception
   a. Checked :- some exception are checked by the compiler at
   the time compilation are called checked exception
   b. For the checked exception, Exception Handling code is mendatory.
   c. If no exception handling code is writtern then there will be
   compile time error : UnreportedExcception  
   b. Unchecked
   Checked Exception :-
     a. Partially Checked :- Partially checked exception is exception
      whose some child are checked and some child are unchecked.
      Example:- Exception
     b. Fully Checked :- Fully checked exception is exception whose all 
     child classes are checked.
     Example IOException
               |
             FileNotFoundException  
 
  How to create User defined Unchecked Exception class ?
  class XYZException extens RuntimeException{}
 */
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance In Account");
    }
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class ICICI{
    private int bal;
    public ICICI(){
        this.bal = 10000;
    }
    public void withdrawal(int amount) throws InsufficientBalanceException{
       if(amount > bal)
         throw new InsufficientBalanceException();
       else{
         bal = bal - amount;
         System.out.println("Withdrawal success....");
       }  
    }
}
class TestMain {
    // main method is calling method of withdrawal
    public static void main(String args[]){
     ICICI obj = new ICICI();
     try{
       obj.withdrawal(12000);
     }
     catch(InsufficientBalanceException e){
        e.printStackTrace();
     }
    }    
}

