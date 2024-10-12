/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labor5;

import java.util.Scanner;

/**
 *
 * @author ancsangabor
 */
public class felhokarcolo {
    public static void main(String[] args) {
        /*System.out.println(Character.isDigit('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('A'));
        System.out.println(Character.toLowerCase('A')); 
        System.out.println(Character.getNumericValue('A'));
        System.out.println(Character.getNumericValue('5'));*/
 
        System.out.println("Adja meg a magasságokat.");
        Scanner sc= new Scanner(System.in);
        String heights= sc.nextLine();
        System.out.println(process(heights));
        }
    public static int process(String h){
            int sum= 0;
            for (int i = 0; i < h.length()-1; i++) {
                int currentHeight= Character.getNumericValue(h.charAt(i));
                int nextHeight= Character.getNumericValue(h.charAt(i+1));
                sum += Math.abs(currentHeight - nextHeight);
            }
            return sum;        
        }
}

