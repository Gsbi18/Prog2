/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labor3;

/**
 *
 * @author ancsangabor
 */
public class teszt_hallgatok {
    
    public static void main(String[] args){
        Hallgatok h = new Hallgatok("Kiss Panna", "ABC123", 2.5,2);
        System.out.println(h.getNev());
        h.setNev("Nagy Panna");
        System.out.println(h.getNev());
        System.out.println(h);
        h.koszon(3);
      
        
        
        
    }
}
