class TestMain{
    public static void main(String args[]){
        String s1 = new String("AB"); // heap
        String s2 = "A";
        String s3 = "B";
        String s4 = s1 + s2; // "AB" --> heap
        String s5 = s1 + s2; // "AB" -->heap
        System.out.println(s1 == s4); // false
        System.out.println(s4 == s5);
    }
}