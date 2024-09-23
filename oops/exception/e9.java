/* 
 try,catch,finally,throw,throws
 */
class A{
    public int m1(){
       try{ 
        /*
         ---
         ---
         */
        return 100;
    }
}
class TestMain {
    public static void main(String args[]){
      A obj = new A();
      int x  = obj.m1();
      System.out.println(x);
    }
}
