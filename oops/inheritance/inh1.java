/*
  Inheritance :-
    By using existing thing, to develop something new but
    there should not any changes in existing thing.
 */
class J5{
    public void receivingCall(){
        System.out.println("Call Received...");
    }
    public void rejectingCall(){
        System.out.println("Call rejected....");
    }
}
class J7 extends J5{
  public void camera(){
    System.out.println("Camera is onn..");
  }
}
class TestMain{
    public static void main(String args[]){
        J7 obj = new J7();
        obj.receivingCall();
        obj.rejectingCall();
        obj.camera();
    }
}




