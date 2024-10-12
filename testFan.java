/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csutortok;

/**
 *
 * @author ancsangabor
 */
public class testFan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        
        f1.setColor("red");
        f1.setOn(true);
        
        f2.setOn(true);
        f2.setSpeed(Fan.FAST);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("Egyenloek e : "+f1.equals(f2));
    }
    
}
