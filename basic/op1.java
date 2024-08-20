/*
  1. Statement
  2. Data 
  3. Variable
  ---------------------
  Operator :-
   1. Arithmetic (+,-,*,/,%) 
   2. Relational (>,<,>=,<=,==,!=)
   3. Logical (&&, ||, !)
   4. Increment/Decrement (++/--)
   5. Assignment ( = )
   6. Bitwise (&, |, ^, <<, >>, ~)
   7. Conditional  ( ? : )
   8. instanceOf
   9. Shorthand  (+=, -=, *=, /=, %=)
 */
class TestMain{
    public static void main(String args[]){
        System.out.println("5/2 : "+(5.0/2));
        System.out.println("5%2 : "+(5%2)); // 1
        System.out.println("-5%2 : "+(-5%2)); // -1
        System.out.println("5%-2 : "+(5%-2)); // 1
        System.out.println("-5%-2 : "+(-5%-2)); // -1
        System.out.println("5.5%2 : "+(5.5%2)); // 1.5
        //System.out.println("5/0 : "+(5/0)); // int/0 :-- ArithmeticExceptioon
       System.out.println("5.5/0 : "+(5.5/0));
       System.out.println("-5.5/0 : "+(-5.5/0));
       System.out.println("5.5%0 : "+(5.5%0));
       System.out.println("2%5 : "+(2%5)); // 2
    }
}