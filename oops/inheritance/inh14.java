// public abstract
interface I{
    void m1();
    abstract void m2();

}
class A implements I{
  public void m1(){
    System.out.println("m1()-called..");
  }
  public void m2(){
    System.out.println("m2()-called...");
  }
}
class TestMain {
    public static void main(String arg[]){
        I obj = new A();
        obj.m1();
        obj.m2();
    }
}
