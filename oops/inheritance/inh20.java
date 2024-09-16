class A{
    public void m1(){
        class LocalClass{
            public void wish(){
                System.out.println("GM....");
            }
        }
        new LocalClass().wish();
    }
}
class TestMain{
    public static void main(String args[]){
       A obj = new A();
       obj.m1();        
    }
}
