/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package házi3;

/**
 *
 * @author ancsangabor
 */
public class Házi3 {

    /**
     * @param args the command line arguments
     */
    public static boolean isConsecutiveFour(int[] values) {
        if (values.length >= 4) {
            int counter = 0;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] == values[i + 1]) {
                    counter++;
                }
            }
            if (counter >= 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] alma = {1, 2, 3};
        int[] körte = {1, 2, 3, 4, 5, 6, 7};
        int[] narancs = {1, 2, 3, 3, 3, 3};
        System.out.println(körte.length);
        System.out.println(isConsecutiveFour(alma));
        System.out.println(isConsecutiveFour(körte));
        System.out.println(isConsecutiveFour(narancs));
    }

}
