/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package péntek;

import java.util.Arrays;

public class Myutills {
public final static double PI=3.14159;

    private Myutills() {
    }
    
    
    static public int duplaz(int n){
        return n*2;
    }
    static public int strlen(String s){
        return s.length();
    }
    static public void reverse(int[] n){
        int[] szamokcop=Arrays.copyOf(n, n.length);
        int j = n.length-1;
        for (int i = 0; i < n.length; i++) {
            n[i]=szamokcop[j];
            j--;
        }
    }
    
}
