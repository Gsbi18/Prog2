/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csutortok;

import java.util.Scanner;

/**
 *
 * @author ancsangabor
 */
public class vensegesven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        csaszar [] t = new csaszar[30];
        int idx=0;
        String n; //név
        int sz; //szul ev
        
        
      
         
        while ((sz=sc.nextInt())!=0);
        {
            n=sc.next();
            t[idx++]= new csaszar(n,sz);
        }
        csaszar min = t[0];
        for (int i = 1; i < idx; i++) {
            if (t[i].getEvszam()<min.getEvszam()) {
                min=t[i];
            }
        }
        System.out.println(min);
    }  
}
