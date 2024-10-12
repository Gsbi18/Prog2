package main;


import main.RegularPolygon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ancsangabor
 */
public class testRegPoly {
    public static void main(String[] args) {
        RegularPolygon rp1=new RegularPolygon();
        RegularPolygon rp2=new RegularPolygon(6,4);
        RegularPolygon rp3=new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Első: Ker: "+ rp1.getPerimeter(rp1.getN(),rp1.getSide())+" Ter: "+rp1.getArea(rp1.getN(),rp1.getSide()));
        System.out.println("Második: Ker: "+ rp2.getPerimeter(rp2.getN(),rp2.getSide())+" Ter: "+rp2.getArea(rp2.getN(),rp2.getSide()));
        System.out.println("Harmadik: Ker: "+ rp3.getPerimeter(rp2.getN(),rp3.getSide())+" Ter: "+rp3.getArea(rp3.getN(),rp3.getSide()));
    }

    
}
