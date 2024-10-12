/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok;

import java.util.Arrays;

/**
 *
 * @author ancsangabor
 */
public class Tombok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int[] scores = new int[5]; // Ki lesz nullázva
        //for (int i = 0; i < scores.length; i++) {
          //  System.out.println(scores[i]);  
        //}
        int[] szamok={12, 13, 31,44, 31,32};
        //System.out.println(Arrays.toString(szamok));
        //kiir(szamok);
        int[] tomb = getOneToFive();
        System.out.println(Arrays.toString(tomb));
    }
    static int[] getOneToFive(){
        int[] otof={1,2,3,4,5};
        return otof;
    }
    
    
    static void kiir(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");
        }
        System.out.println("");
    } 
    
}
