class TestMain{
   public static void main(String args[]){
     try{
       //throw new ArithmeticException();
       //throw new Exception();
       //throw new Error();
       throw new Throwable();
     }
     catch(Object e){ // Object can not be converted into Throwable
       System.out.println("Catch executed");
     }
   }
}
