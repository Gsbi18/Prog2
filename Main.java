/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class Main {
    
  static int  lnko(int a, int b) {
        int r; //maredék

        do {
            r = a % b;
            a = b;
            b = r;

        } while (r != 0);

        return a;

    }

    
  static void szoko_evek(int ev1, int ev2)
{
   int count = 0;

   for(int i=ev1; i<= ev2; i++)
   {
      if(i%4==0 && i%100 !=0 || i%400 ==0)
      {
          // printf("Ev=%d\n",i);
          System.out.printf("Ev=%d\n",i);
          System.out.println("EV=" +i);
         
         count++;

      }
   }



}

    public static void main(String[] args) {
      
      szoko_evek(1880,2024);
      System.out.println("LNKO= " + lnko(360,225) );
      
      
    }

}
