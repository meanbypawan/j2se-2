class A{
  public A(int x){
    System.out.println("A-parameter....");
  }
}
class B extends A{
  public B(int x){
    super(100);
    System.out.println("B-parameter...");
  }
  public B(){
    super(100);
    System.out.println("B-default...");
  }
}
class TestMain{
    public static void main(String arg[]){
        new B(100);
    }
}