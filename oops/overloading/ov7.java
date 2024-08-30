class Test{
    public void m1(int... x){
        System.out.println("Var-arg version....");
    }
    public void m1(int x){
        System.out.println("Integer version....");
    }
}

class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(); // HMP : 1, type : int
    }
}