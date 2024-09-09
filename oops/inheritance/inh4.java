class A{
  public A(){
    System.out.println("A-default...");
  }
  static{
    System.out.println("Block-A");
  }
  {
    System.out.println("A-initializer...");
  }
}
class B extends A{
   public B(){
    System.out.println("B-default...");
   }
   static{
    System.out.println("Block-B");
   }
   {
    System.out.println("B-initializer...");
   }
}
class TestMain{
    public static void main(String args[]){
       new B();
    }
}

