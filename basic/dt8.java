/*
  c/c++
  char x;
  1. 1 byte
  2. 2^8 = 256 character
  3. ASCII
  Java
  char x;
  1. 2-byte
  2. 2^16 = 65536
  3. Unicode [16-bit hexadecimal code]
  
  Integer
    a. Decimal
    b. octal
    c. hexadecimal
 */

class TestMain{
    public static void main(String args[]){
      int x = 0x000b;
      int a = 058; // 0-7
      int b = 199;
      System.out.println(x);
      System.out.println(a);
    }
}