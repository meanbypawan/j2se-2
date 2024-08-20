/*
   byte     1-byte      8-bit   -128 to 127
   short    2-byte      16-bit  -32768 to 32767
   int      4-byte      32-bit  -2147483648 to 2147483647
 */
class Test{
    public static void main(String args[]){
       int a = 2147483648;
       System.out.println(a);
    }
}