/*
 valid 
 interface I{}
 class C implements I{}
 ------------------------------
 valid
 class C1{}
 class C2 extends C1{}
 --------------------------
 valid
 interface I1{}
 interface I2 extends I1{}
 -----------------------------
 invalid
 class C1{}
 class C2{}
 class C3 extends C1,C2{} ==>error
 ---------------------------------
 valid
 interface I1{}
 interface I2{}
 interface I3 extends I1,I2{}
 ----------------------------------
 valid
 interface I1{}
 class C1{}

 class C2 extends C1 implements I1{}
 --------------------------------------
 valid
 interface I1{}
 interface I2{}
 class C1{}

 class C2 extends C1 implements I1,I2{}
 --------------------------------------------
 interface I1{}
 interface I2{}

 class C1 implements I1,I2{}
 */
interface I1{
    void m1();
}
interface I2{
    void m2();
}
interface I3 extends I1,I2{
    void m3();
}
class A implements I1,I2,I3{
    public void m1(){}
    public void m2(){}
    //public void m3(){}
}