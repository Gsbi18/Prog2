/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ancsangabor
 */
public class testLinear {
    public static void main(String[] args) {
        LinearEquation le1=new LinearEquation(1,2,3,6,5,4);
        LinearEquation le2=new LinearEquation(12,22,33,45,65,26);
        LinearEquation le3=new LinearEquation(10,23,33,64,53,86);
        if (!le1.isSolvable()) {
            System.out.println("The equation has no solution.");
        }
        else System.out.println("Az első megoldásai: "+le1.getY()+"  "+le1.getX());
        System.out.println("Az második megoldásai: "+le2.getX()+"  "+le2.getY());
        System.out.println("Az harmadik megoldásai: "+le3.getX()+"  "+le3.getY());
        
    }
    
}
