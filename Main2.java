/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyak5;

/**
 *
 * @author ancsangabor
 */
class MyNumber
{
    private int szam;
    public MyNumber(int value){
    this.szam=value ;
     
    }
    public MyNumber add(int number){
        this.szam+=number;
        return this;
    }
    public int value(){
        return this.szam;
    }
    public MyNumber multiply(int number){
        this.szam*=number;
        return this;
    }
}


public class Main2 {
    public static void main(String[] args) {
        MyNumber n=new MyNumber(5);
        n.add(2).multiply(3);
        System.out.println(n.value());
    }
    
}
