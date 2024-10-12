/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package péntek;

import java.util.Arrays;

/**
 *
 * @author ancsangabor
 */
public class Péntek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Teglalp t1=new Teglalp(3,5);
        Teglalp t2=new Teglalp(2*t1.getA(),2*t1.getB());
        
       //System.out.println(t2);
       // System.out.println(Myutills.duplaz(6));
       // System.out.println(Myutills.strlen("aabab"));
        
        final int n = 5;
        //n++;
        //System.out.println(n);
        System.out.println(Myutills.PI);
        
        
        int[] szamok= {1,2,3,4};
        System.out.println(Arrays.toString(szamok));
        
        Myutills.reverse(szamok);
        
        System.out.println(Arrays.toString(szamok));
    }
    
}