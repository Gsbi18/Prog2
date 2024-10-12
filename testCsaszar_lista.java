/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csutortok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ancsangabor
 */
public class testCsaszar_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<csaszar> lis= new ArrayList();
        
        //csaszar [] t = new csaszar[30];
        String n; //név
        int sz; //szul ev
        
        
      
         
        while ((sz=sc.nextInt())!=0);
        {
            n=sc.next();
            //t[idx++]= new csaszar(sz,n);
            lis.add(new csaszar(n,sz));
        }
        //csaszar min = t[0];
        csaszar min=lis.get(0);
        for (int i = 1; i < lis.size(); i++) {
            if (lis.get(i).getEvszam()<min.getEvszam()) {
                min=lis.get(i);
            }
        }
        System.out.println(min);
        
        for (csaszar i:lis) {
            System.out.println(i);
        }
    }
}
