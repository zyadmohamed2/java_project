package oop;

public class tow2 {
    int val;
    public tow2(){}
    public tow2(int val ){
        this.val = val;
    }
    tow2 add( tow2 obj2){
        tow2 obj3 = new tow2();
        obj3.val = this.val+ obj2.val;
        return obj3;
    }
    boolean equals(tow2 obj) {
        if (this.val == obj.val){
            return true;
        }
        else{
            return false;
        }
    }
}
