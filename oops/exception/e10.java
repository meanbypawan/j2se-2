/* 
 try,catch,finally,throw,throws
 */
class A{
    public int m1(){
       try{ 
        /*----------*/
        //return 100;
       }
       catch(Exception e){
         e.printStackTrace();
         //return 200;
       }
       finally{
         //return 300;
       }
       return 400;
    }
}
class TestMain {
    public static void main(String args[]){
      A obj = new A();
      int x  = obj.m1();
      System.out.println(x);
    }
}

