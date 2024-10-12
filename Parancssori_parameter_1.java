package labor5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ancsangabor
 */
// irjunk egy programot amely parancssori parameterkent amely egy egesz szamsorozatot var a program dontse el hogy a szamsorozat szamtani sorozate 
// irjunk egy programot amely parancssori parameterkent var egy szot és utana legalabb egy karaktert de barmennyit irja ki a zeredeti szót olyan formaban amely megduplazza azokat a kakaktereit ami szerepel a karakter listaban 
public class Parancssori_parameter_1 {

    public static boolean checkArithmeticSequence(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]-arr[i-1]!=diff) {
                return false;
            }
        } 
        return true;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Adjon meg legalább egy elemet!");
            System.exit(0);
        }
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        boolean isArithmetic = checkArithmeticSequence(numbers);
        if (isArithmetic) {
            System.out.println("Számtani sorozat!");
        }
        else{
            System.out.println("NEM számtani sorozat!");
        }
        
    }
}

