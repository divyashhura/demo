class Parent{
    void show(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child Class");
    }
}
public class Tester2 {
    public static void main(String args[])
    {
        Child p=new Child();
        p.show();
       // p.display();
    }
}
