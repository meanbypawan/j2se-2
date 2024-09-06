class TestString{
    private String msg;
    public TestString(String msg){
        this.msg = msg;
    }
    public String toString(){
        return msg;
    }
}
class Test{
    private int id;
    private String name;
    public Test(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return ""+id +"  "+name;
    }
}
class TestMain{
    public static void main(String args[]){
        String s1 = new String("A");
        StringBuffer sb1 = new StringBuffer("B");
        TestString ts = new TestString("C");
        Test test = new Test(100,"Cheeku");

        System.out.println(s1);
        System.out.println(sb1);
        System.out.println(ts);
        System.out.println(test);
    }
}