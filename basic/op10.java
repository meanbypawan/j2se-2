/*
   Logical :-
   && -> AND
   || -> OR
   
   criteria-1/condition  ||  criteria-2/condition
     A          B       A&&B            A||B
    (a>b)      (c<d)    (a>b)&&(c<d)
     true       false   false           true
     false      ture    false           true
     true       true    true            true
     false      false   false           false
     
     100&&200
 */
class TestMain{
    public static void main(String args[]){
      int a,b,c,d;
      boolean x;
      a = 10;
      b = 20;
      c = 30;
      d = 40;
      x = (a<b) | (++c<d);
      System.out.println("a : "+a);
      System.out.println("b : "+b);
      System.out.println("c : "+c);
      System.out.println("d : "+d);
      System.out.println("x : "+x);
    }
}