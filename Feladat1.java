/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ancsangabor
 */
public class Feladat1 {
    private int szam;
    private String szoveg;

    public Feladat1(int szam, String szoveg) {
        this.szam = szam;
        this.szoveg = szoveg;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }
    public int getFaktorialis(){
        int fact=1;
        for (int i = szam; i >1; i--) {
            fact=fact*i;
        }
        return fact;
    }
    public String getLegnagyobbBetű(){
        return "alma";
    }
    public static void main(String[] args) {
        Feladat1 fel=new Feladat1(5, "majom");
       
        System.out.println(fel.getFaktorialis());
    }
}
