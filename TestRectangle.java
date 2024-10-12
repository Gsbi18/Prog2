/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ancsangabor
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,40);
        Rectangle r2=new Rectangle(3.5,35.9);
        System.out.println("Az első téglalap szélessége: "+ r1.width+" magassága: "+r1.height+ " kerülete: "+r1.getPerimeter()+" területe: "+r1.getArea());
        System.out.println(r1.toString());
        System.out.println("Az második téglalap szélessége: "+ r2.width+" magassága: "+r2.height+ " kerülete: "+r2.getPerimeter()+" területe: "+r2.getArea());
        System.out.println(r2.toString());
        
        
        
    }
    
}
