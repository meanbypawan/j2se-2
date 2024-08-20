/*
  valid signature of main method
  1. public static void main(String args[])
  2. public static final void main(String args[])
  3. public static strictfp void main(String args[])
  4. public static synchronized void main(String args[])
  5. public static void main(String[] args)
  6. public static void main(String []args)
  7. public static final synchonized strictfp void main(String args[])
  8. public static void main(String... args) // Var-arg
 */
class Test{
    synchronized strictfp public static final void main(String[] args){
        System.out.println("ABC");
        System.out.printf("DEF\n");
        System.out.print("GHI");
        System.err.println("Error Message");
    }
}
/*
  System :- It is built in java class available in lang package
  lang :- It is default package of java
  out ;- It is object of PrintStream class and static member of
  System class
  println,print,printf :- These are all the instance method
  of PrintStream class.
 */