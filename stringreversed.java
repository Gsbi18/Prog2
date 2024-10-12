/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyak5;

/**
 *
 * @author ancsangabor
 */
public class stringreversed {
    public static void main(String[] args) {
        String s="java21";
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);
        String forditva= new StringBuilder("Laci").reverse().toString();
    }
}
