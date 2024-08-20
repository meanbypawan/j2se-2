/*
   byte     1-byte      8-bit   -128 to 127
   short    2-byte      16-bit  -32768 to 32767
   int      4-byte      32-bit  -2147483648 to 2147483647
   long     8-byte      64-bit   -2^63 to 2^63-1
 */
class Test{
    public static void main(String args[]){
       int a = 2147483647;
       a = a + 2;
       System.out.println(a);
    }
}