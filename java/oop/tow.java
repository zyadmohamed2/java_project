package oop;

public class tow {
    public static void main(String[] args) {
        tow2 obj1 = new tow2(3 );
        tow2 obj2 = new tow2(3 );
        tow2 obj4 = new tow2();
        tow2 obj3 = obj1.add( obj2);
        System.out.println(obj1.equals(obj2)); 

    }
}
