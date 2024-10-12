/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyak5;

import java.util.ArrayList;
import java.util.List;
import labor5.Hullámvasút;

/**
 *
 * @author ancsangabor
 */
class filmek{
    double ertekeles;
    String cim;
    int szam;

    public filmek(double ertekeles, String cim, int szam) {
        this.ertekeles = ertekeles;
        this.cim = cim;
        this.szam = szam;
    }

    public double isErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(double ertekeles) {
        this.ertekeles = ertekeles;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }
   
}
public class IMDb250 {
    public static void main(String[] args) {
         List<String> li= FileUtils.readLines("input3.txt");
        System.out.println(li.size());
        List<filmek> f= new ArrayList<>();
        
        for(String sor:li)
        {            
          String [] darabolt= sor.split(";");
          filmek film= new filmek(Double.parseDouble(darabolt[0]),darabolt[1],Integer.parseInt(darabolt[2])); 
          f.add(film);     
        }
        
    }
    
}
