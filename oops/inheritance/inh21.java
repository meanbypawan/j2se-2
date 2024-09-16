class A{
    public void m1(){
        System.out.println("A-m1()");
    }
    static class B{
        static public void sayHello(){
            System.out.println("Hello Friends...");
        }
    }
}
class Child extends A{}
class TestMain{
    public static void main(String args[]){
        Child.B.sayHello();
        new Child().m1();
    }
}
