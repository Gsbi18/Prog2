/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labor2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class TestString {

    static void RoShamBo() {
        String player1;
        String player2;

        int score1 = 0;
        int score2 = 0;

        Scanner sc = new Scanner(System.in);

        while (!(player1 = sc.nextLine()).equals("vege")) {
            Random rnd = new Random();
            int j2 = rnd.nextInt(3);

            if (j2 == 0) {
                player2 = "ko";
            } else if (j2 == 1) {
                player2 = "papir";
            } else {
                player2 = "ollo";
            }
            
            System.out.println(player2);
            
            if(player1.equals("ko") &&  player2.equals("papir"))
                score2++;
            else if(player1.equals("ko") &&  player2.equals("ollo"))
                score1++;
            
            if(player1.equals("papir") &&  player2.equals("ko"))
                score1++;
            else if(player1.equals("papir") &&  player2.equals("ollo"))
                score2++;
            
            if(player1.equals("ollo") &&  player2.equals("papir"))
                score1++;
            else if(player1.equals("ollo") &&  player2.equals("ko"))
                score2++;
            

        }
        
        if(score1>score2)
            System.out.println("Elso jatekos nyert");
        else if(score1<score2)
            System.out.println("Masodik nyert");
        else
            System.out.println("Dontetlem");
        

    }

    static boolean contains_one(String s, char k) {

        return s.indexOf(k) == s.lastIndexOf(k);

    }

    public static void main(String[] args) {

        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = "Welcome to Java";
        String s4 = new String("Welcome to Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));

        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo("Welcome to Tava"));

        System.out.println(s1.charAt(10));
        System.out.println("Sztring hossza=" + s1.length());

        System.out.println("A karakter első előfordulása: " + "Halibali".indexOf('a'));
        System.out.println("A karakter utolsó előfordulása: " + "Halibali".lastIndexOf('a'));
        System.out.println("Halibali".indexOf("bali"));

        System.out.println("Halibali".substring(2));
        System.out.println("Halibali".substring(2, 6));

        System.out.println(contains_one("Halibali", 'b'));

        System.out.println("Halibali".startsWith("Hali"));
        System.out.println("Halibali".endsWith("alma"));

        System.out.println("Halibali".toUpperCase());

        System.out.println("  Halib ali    ".trim()); //a szóközök eltávolítása eleje+vége

        System.out.println("Halibali".replace('a', 'o'));
        System.out.println("Halibali".replaceFirst("li", "so"));
        String s5 = "Halibali".repeat(3);
        System.out.println(s5);

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        char[] str = s1.toCharArray();

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(str[i]);
        }

        RoShamBo();
    }

}
