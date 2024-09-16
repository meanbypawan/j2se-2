/*
 I.class
 I$II.class
 I$II$III.class
 I$A.class
 I$A$AI.class
 */
interface I{
    interface II{
        interface III{
            void m1();
        }
    }
    class A{
        interface AI{
            void m3();
        }
    }
}
class Child implements I.II.III,I.A.AI{
    public void m1(){
        System.out.println("m1()-executed...");
    }
    public void m3(){
        System.out.println("m3()-executed...");
    }
}
class TestMain{
    public static void main(String args[]){
        new Child().m1();
        new Child().m3();
    }
}
