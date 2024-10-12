/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negyzetw;
import java.util.Scanner;

/**
 *
 * @author ancsangabor
 */
class Negyzet{
    public int a;
    public Negyzet(int oldal){
        this.a=oldal;
        
    }
    public int Kerulet(){
        int ker=4*a;
        return ker;
    }
     public int Terulet(){
        int ter=a*a;
        return ter;
    }
    
    
}
class Teglalap{
    public int a;
    public int b;
    public Teglalap(int oldala, int oldalb ){
        this.a=oldala;
        this.b=oldalb;   
    }
    public int Kerulet(){
        int ker=2*(a+b);
        return ker;
    }
     public int Terulet(){
        int ter=a*b;
        return ter;
    }   
}
class Kor{
    public double r;
    public Kor(double sugar){
        this.r=sugar;
 
    }
    public double Kerulet(){
        double ker=2*r*Math.PI;
        return ker;
    }
     public double Terulet(){
         double ter =Math.pow(r, 2)*Math.PI;
        return ter;
    }   
}
class Gomb{
    public double r;
    public Gomb(double sugar){
        this.r=sugar;
 
    }
    public double Terfogat(){
        double ter=((2*Math.PI)/3)*Math.pow(r, 3);
        return ter;
    }
     public double Felszin(){
         double fel =4*Math.pow(r, 2)*Math.PI;
        return fel;
    }   
}

public class Negyzetw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner be = new Scanner(System.in);
        System.out.println("Add meg a négyzet oldalát: ");
        int a=be.nextInt();  
        Negyzet nev = new Negyzet(a);
        System.out.println("A négyzet kerülete: "+nev.Kerulet());
        System.out.println("A négyzet területe: "+nev.Terulet());
        System.out.println("Add meg a téglalap a oldalát: ");
        int tega=be.nextInt();  
        System.out.println("Add meg a téglalap b oldalát: ");
        int tegb=be.nextInt();  
        Teglalap tegla = new Teglalap(tega,tegb);
        System.out.println("A téglalap kerülete: "+tegla.Kerulet());
        System.out.println("A téglalap területe: "+tegla.Terulet());
        System.out.println("Add meg a kör sugarát: ");
        double r=be.nextDouble();  
        Kor kor = new Kor(r);
        System.out.printf("A kör kerülete: %.2"+kor.Kerulet());
        System.out.printf("A kör területe: %.2"+kor.Terulet());
        System.out.println("Add meg a gömb sugarát: ");
        double rgomb=be.nextDouble();  
        Gomb gomb = new Gomb(r);
        System.out.printf("A gömb felszíne: %.2"+gomb.Felszin());
        System.out.printf("A gömb területe: %.2"+gomb.Terfogat());
        
        
       
        // TODO code application logic here
    }
    
}
