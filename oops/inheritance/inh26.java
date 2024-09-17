// Functional Interface
interface I{
    void wish();
}
/*
 wish() --> GM
 wish()---> GE
 wish()---> GN 
 
 */
class TestMain {
   public static void main(String args[]){
    I obj = ()->System.out.println("GM...");
    I obj2 = ()->System.out.println("GE....");
    I obj3 = ()->System.out.println("GN....");
    obj.wish();
    obj2.wish();
    obj3.wish();
   }
}
