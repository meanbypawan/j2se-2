class A{
    public A(){
        System.out.println("A-default..");
    }
}

class B extends A{
    public B(int x){
        super();
        System.out.println("B-parameter..");
    }
}
class C extends B{
    public C(int x){
        super(x);
        System.out.println("C-parameter...");
    }
}
class TestMain{
    public static void main(String args[]){
        new C(100);
    }
}