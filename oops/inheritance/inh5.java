/*
  Access Modifier
    a. private :-
       It is only accessible with in the same class.

    b. <default> :- It is accessible in all classes of same package
       (public for the same package)
    
    c. protected :- It is accessible in all classes of same package
       as well as child class of another package.

    d. public :- It is accessible anywhere.
    
  Area [l,w,getArea()]
  Volume [l,w,h,getArea(),getVolume()]
 */
class Area{
    private int l;
    private int w;
    public Area(int l, int w){
        this.l = l;
        this.w = w;
    }
    public Area(){}
    public int getArea(){
        return l * w;
    }
    public void setL(int l){
        this.l = l;
    }
    public void setW(int w){
        this.w = w;
    }
    public int getL(){
        return l;
    }
    public int getW(){
        return w;
    }
}
class Volume extends Area{
    private int h;
    public Volume(int l, int w, int h){
        setL(l);
        setW(w);
        this.h =  h;
    }
    public int getVolume(){
        return getL() * getW() * h;
    }
}
class TestMain{
  public static void main(String args[]){
    Volume v = new Volume(2,3,4);
    System.out.println("Area : "+v.getArea());
    System.out.println("Volume : "+v.getVolume());
  }
}