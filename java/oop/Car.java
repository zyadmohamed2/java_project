package oop;

import java.arry.thre;

public class Car {
    private int acounntnumber;
    private String name;
    private float anout;

    public void setname(String name){
        this.name = name;
    }
    public void acounntnumber(int acounntnumber){
      this.acounntnumber = acounntnumber;  
    }
    public void setanout(float anout){
        this.anout = anout;
    }
    public void eda3(float eda3anout){
        if(anout < eda3anout){
            System.out.println("enouhg mouny");
        }
        else{
            this.anout += eda3anout;
        }
        System.out.println("eda3 = " + eda3anout);
    }
    public void sahb(float sahbmony){
        this.anout -= sahbmony;
    }
    public void cackbank(){
        System.out.println(this.acounntnumber);
        System.out.println(this.anout);
        System.out.println(this.name);
    }
    public String toString() {
        return "Car [acounntnumber=" + acounntnumber + ", name=" + name + ", anout=" + anout + "]";
    }
    
}
