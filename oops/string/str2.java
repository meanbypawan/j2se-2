class TestMain{
    public static void main(String args[]){
      String s1 = "A";
      String s2 = "A";
      String s3 = new String("A");
      
      System.out.println(s1 == s2); // true
      System.out.println(s1 == s3); // false
      System.out.println(s1.equals(s3)); // true
    }
}