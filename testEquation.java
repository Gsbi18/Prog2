/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labor3;

/**
 *
 * @author ancsangabor
 */
public class testEquation {
    public static void main(String[] args) {
        QuadraticEquation q = new QuadraticEquation(2,-3,5);
        System.out.println("x1 - "+ q.getRoot1());
        System.out.println("x2 - "+ q.getRoot2());
        System.out.println(q);
        
        
    }
    
}
