/*
  Marker Interface ;-
  Functional Interface
  Interface

  Large Amount Of Data
    Collection
 */
import java.io.Serializable;
public class Customer implements Serializable{
    private int id;
    private String name;
    transient private String accountNo;
    private String address;
    private int age;
    public Customer(int id, String name, String accountNo, String address, int age){
        this.id = id;
        this.name = name;
        this.accountNo = accountNo;
        this.address = address;
        this.age = age;
    }
    public Customer(){}
    public int getId(){
        return id;
    }   
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getAccountNo(){
        return accountNo;
    }
    public int getAge(){
        return age;
    }
}