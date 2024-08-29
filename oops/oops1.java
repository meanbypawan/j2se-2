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
    public void display(){
        System.out.println(a+"  "+b);
    }
}
class TestMain{
    public static void main(String args[]){
        Addition obj = new Addition();
        obj.setData(20,10);
        obj.add();
        obj.display();
    }
}