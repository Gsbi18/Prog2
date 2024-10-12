/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package péntek;

/**
 *
 * @author ancsangabor
 */
class Teglalp {
     private int a;
    private int b;

    public Teglalp(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int Kerulet(){
        return 2*(a+b);
    }
    public int Terulet(){
        return a*b;
    }

    @Override
    public String toString() {
        return "Teglalp{" + "a:" + a + ", b:" + b + '}';
    }
    
}
