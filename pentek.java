/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package péntek;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ancsangabor
 */
public class pentek {
    public static void main(String[] args) {
        /*String s1="java21";
        for (char c:s1.toCharArray()) {
            System.out.println(c);
        }*/
        List<Integer> szamok= new ArrayList<>();
        szamok.add(20);
        szamok.add(2);
        szamok.add(120);
        System.out.println(szamok);
        List<Integer> copy=new ArrayList<>(szamok);
        // egy wrapper class (csomagolo osztaly) tartalmazza az adott primitiv tipust mivel a java objektum orientalt nyelv nagyon sok helyen osztaly kell megadni és a primitiv tipust nem fogadja el ezert kitalaltak ezt a workaround megoldast amikor is a primitiv tipus be van csomagolva egy osztalyba és igy a probléma megvan oldva     
    }
    
    
}
