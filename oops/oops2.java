class Addition{
    private int a;
    private int b;
    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
    public void setA(int a){
      this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
}
class TestMain{
  public static void main(String args[]){
    Addition obj = new Addition(); // obj->a:0,b:0
    //obj.add();
    obj.setA(20);
    System.out.println(obj.getA()+"  "+obj.getB());
    obj.setB(5);
    System.out.println(obj.getA()+"  "+obj.getB());
    obj.add();
  }   
}