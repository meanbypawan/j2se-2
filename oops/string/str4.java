/*
  String v/s StringBuffer v/s StringBuilder

  String :-
    It is immutable
  
  StringBuffer :-
    Mutable
    Thread Safety
    Slow

  StringBuilder :-
    Mutable  
    Dont want thread safety
    Fast
 */
class TestMain{
    public static void main(String args[]){
        String s1 = new String("ABC");
        String s2 = new String("ABC");

        StringBuffer sb1 = new StringBuffer("ABC");
        StringBuffer sb2 = new StringBuffer("ABC");
        
        StringBuilder sbuild1 = new StringBuilder("ABC");
        StringBuilder sbuild2 = new StringBuilder("ABC");


        System.out.println(s1.equals(s2)); // true        
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sbuild1.equals(sbuild2)); // false
    }
}










