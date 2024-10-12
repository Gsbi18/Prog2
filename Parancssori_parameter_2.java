/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labor5;

/**
 *
 * @author ancsangabor
 */
public class Parancssori_parameter_2 {
    public static void main(String[] args) {
        if (args.length<2) {
            System.out.println("Adj meg legalabb két paramétert!");
            System.exit(0);
        }
        String word = args[0];
        StringBuilder characterSet = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
           
            if (characterSet.indexOf(args[i])==-1) {//NIncs benne
                characterSet.append(args[i]);
            }

            
        }
        StringBuilder result= new StringBuilder();
        for (char c : word.toCharArray()) {
            if (characterSet.indexOf(String.valueOf(c))!=-1) {
                result.append(c).append(c);
            }
            else{
                result.append(c);
            }
            
        }
        System.out.println(result);
    }
    
}

//Kerjunk be a standart inputon keresztuk a felhasznalotal egy szot amely csupa szamjegyeket tartalmaz a felhokarcolok magassagait tartalmazaz irjuk ki az egymas melett levo magassagkulonbségének abszolout ertekeinek az osszeget 