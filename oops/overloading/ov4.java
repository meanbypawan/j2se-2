class Test{
    public void m1(int x, long y){
        System.out.println("Integer-Long version..");
    }
    public void m1(long x, int y){
        System.out.println("Long-Integer version..");
    }
    public void m1(int x, int y){
        System.out.println("Integer Integer version...");
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(20,10); // HMP : 2, type : int,int
    }
}