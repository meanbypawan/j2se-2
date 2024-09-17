// interface 1.8
interface I{
    void m1();
    default void wish(){
        System.out.println("GM...");
    }
    default void sayHello(){
        System.out.println("Hello...");
    }
    static void sayGoodBye(){
        System.out.println("Good Bye...");
    }
}
class Child implements I{
    public void m1(){
        System.out.println("m1()-executed...");
    }
}
class TestMain {
    public static void main(String args[]){
        I obj = new Child();
        obj.m1();
        obj.wish();
        obj.sayHello();
        I.sayGoodBye();
    }
}
