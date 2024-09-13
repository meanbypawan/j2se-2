abstract class A{
  protected int l;
  protected int w;
  public A(int l, int w){
    this.l = l;
    this.w = w;
  }
  abstract public int getArea();
}

class AChild extends A{
    public AChild(int l, int w){
        super(l,w);
    }
    public int getArea(){
        return l*w;
    }
}
class TestMain{
    public static void main(String arggs[]){
        A obj = new AChild(2,3);
        System.out.println("Area : "+obj.getArea());
    }
}