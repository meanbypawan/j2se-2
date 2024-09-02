// constructor chaining
class A{
    public A(int x, int y){
      this(100);
      System.out.println("Int Int - parameter...");
    }
    public A(int x){
        this(20,10);
        System.out.println("Int parameter..");
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new A(20,10);
    }
}