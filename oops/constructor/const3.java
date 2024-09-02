// constructor chaining
class A{
    public A(int x, int y){
      this(x);this();
      System.out.println("Int Int - parameter...");
    }
    public A(int x){
        System.out.println("Int parameter..");
    }
    public A(){
        System.out.println("Default constructor called..");
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new A(20,10);
    }
}