/*
  length(): int
  toUpperCase() : string
  toLowerCase() : string
  trim()
  contains()
  split()
  replace()
  substring()
 */
class TestMain{
    public static void main(String args[]){
     String s1 = new String();
     
     String s2 = new String("Hello");

     char ch[] = {'w','e','l','c','o','m','e'};
     String s3 = new String(ch);
 
     byte b[] = {65,66,67,68,69};
     String s4 = new String(b);

     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
     System.out.println(s4);
    }
}