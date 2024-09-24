/*
  Real World Entity(Object)

  Customer :- [id,name,age,accountNo,salary,address]
  c------>oos----->fout---->customer.txt[f]
  NotSerializableException

  Java-application-------------------------file[customer.txt]/System
     l1                                       l2                        
   Indore               Mumbai
   1000  ------------->
   booleans
     case-1
     truck------------> Mumbai
                         truck [blast]
     case-2
     truck------------> Mumbai
     1000                truck[fill Air in ballon]
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
class TestMain{
    public static void main(String args[]){
      try{
         File f = new File("customer.txt");
         FileOutputStream fout = new FileOutputStream(f);    
         ObjectOutputStream oos = new ObjectOutputStream(fout);
         Customer c = new Customer(100,"A","A43433","Pancham ki fail",21);
         oos.writeObject(c);
         System.out.println("Operation success.....");
      }
      catch(Exception e){
        e.printStackTrace();
      }
    }
}