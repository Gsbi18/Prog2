/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ancsangabor
 */
public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
    public boolean isSolvable(){
        if (this.a*this.d-this.b*this.c!=0) {
            return  true;
            
        }
        return false;
    }
    public int getX(){
        int felseje=(this.e*this.d-this.f*this.f);
        int alja=(this.a*this.d-this.b*this.c);
         return felseje/alja;
        
    }
     public int getY(){
        int felseje=(this.a*this.f-this.e*this.c);
        int alja=(this.a*this.d-this.b*this.c);
         return felseje/alja;
                 
    }

    
    
}
