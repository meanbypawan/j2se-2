interface I{
    void wish();
}
class TestMain {
    public static void main(String args[]){
        I obj = new I(){
            public void wish(){
                System.out.println("GM...");
            }
        };
        I obj2 = new I(){
            public void wish(){
                System.out.println("GE...");
            }
        };
        obj.wish();
        obj2.wish();
    }
}
/*
 I obj = new I(){};
 class __ implements I{
    public void wish(){}
 }
  I obj = new __();
 */
