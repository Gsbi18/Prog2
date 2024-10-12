/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labor3;

/**
 *
 * @author ancsangabor
 */
public class Hallgatok {
    
    private String nev;
    private String neptunkod;
    private double atlag;
    private int evfolyam;
    
    void koszon(){
        System.out.println("Jó napot Tanár úr!");
    }
    void koszon(int n){
        for (int i = 0; i < n; i++) {  
            System.out.println("Csá-csumi-csá");
        }
    }
    
    public Hallgatok(String nev, String neptunkod, double atlag, int evfolyam){
        this.nev=nev;
        this.neptunkod=neptunkod;
        this.atlag=atlag;
        this.evfolyam=evfolyam;
        
    }

    @Override
    public String toString() {
        return "Hallgatok{" + "nev=" + nev + ", neptunkod=" + neptunkod + ", atlag=" + atlag + ", evfolyam=" + evfolyam + '}';
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNeptunkod() {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod) {
        this.neptunkod = neptunkod;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }
   
    
    
}
