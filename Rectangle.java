/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ancsangabor
 */
public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width,double height) {
        this.height=height;
        this.width=width;
    }

    public Rectangle() {
        this.width=1;
        this.height=1;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width: " + width + ", height: " + height + '}';
    }
    
    
    
}
