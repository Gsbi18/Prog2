/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metódusok;

/**
 *
 * @author ancsangabor
 */
public class Metódusok {
    
public static void Novekvo(int a, int b, int c){
    if (a<b && a<c && b<c) {
        System.out.println(a+", "+b+", "+c);
    }
    else if(a<b && a<c && b>c){
        System.out.println(a+", "+c+", "+b);
    }
    else if(a>b && a<c && b<c){
        System.out.println(b+", "+a+", "+c);
    }
    else if(a>b && a>c && b<c){
        System.out.println(b+", "+c+", "+a);
    }
    else if(a>b && a>c && b>c){
        System.out.println(c+", "+b+", "+a);
    }
    else if(a<b && a>c && b>c){
        System.out.println(c+", "+a+", "+b);
    }
    
    
}
public static void MinMax(float a, float b, float c){
    float min = a;
    if (min>b) {
        min=b;
    }
    if(min>c)
    {
        min=c;
    }
    float max = Math.abs(a);
    if (max<Math.abs(b)) {
        max=Math.abs(b);
    }
    if (max<Math.abs(c)) {
        max=Math.abs(c);
    }
    System.out.println("Min: "+ min + "  Max: "+ max);
} 
public static boolean HaromSzog(float a, float b, float c){
    
    if (a<(b+c)&& b<(a+c)&& c<(a+b)) {
        return true;
    }
    else return false;   
}
public static int SzokoEv(int ev1, int ev2){
    int counter = 0;
    for (int i = ev1+1; i <= ev2-1; i++)
    {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
        {
            counter++;
        }
    }
    return counter;
}
public static void Osztas(int a, int b){
    int hanyados=0;
    while(a>=b){
        hanyados=hanyados+1;
        a=a-b;
    }
    System.out.println(hanyados);
}
public static boolean IsPrim1(int a){
    int osztokSzama=0;
    for (int i = 1; i <= a; i++) {
        if (a % i==0) {
            osztokSzama++;
        }
    }
    if (osztokSzama==2) {
        return true;
    }
    else return false;
}
public static boolean IsPrim2(int a){
boolean valasz=true;
    for (int i = 2; i < Math.sqrt(a); i++) {
        if (a%i==0) {
            valasz=false;
        }
    }
    return valasz;
}
public static void fibonacci1(int n){
    int a = 0;
    int b = 1;
    int c;
    int k; 
    if (n==1) {
       System.out.println(a);
    }
    else if (n==2) {
        System.out.println(a+", "+ b);
    }
    else{
        c=a+b;
        System.out.print(a+", "+b+", "+c+", ");
        k=3;  
        while(k<n){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+", ");
            k++;
        }         
  
    }
}   
public static void fibonacci2(int n){
   int a=1;
   int b=0;
   System.out.println("");
    for (int i = 1; i <=n; i++) {
        System.out.println(b);
        b=a+b;
        a=b-a;
    }
}
public static void UjSzam(int n){
    int ujszam=0;
    while(n!=0){
        ujszam=ujszam*10+(n%10);
        n=n/10;
    }
    System.out.println(ujszam);
}
public static int Factorial(int n){
    if (n==0 || n==1) {
        return 1;
    }
    return n*Factorial(n-1);
}
public static void Find(int k,int n1, int n2){
    for (int i = n1+1; i < n2; i++) {
        if (i%k==0) {
            System.out.print(i+", ");
        }
    }
    System.out.println("");  
}
public static int FibonacciFind(int n){
   int a=1;
   int b=0;
    while(true) {
        if (n<b) {
            return b;
        }
        b=a+b;
        a=b-a;
    }
}
public static void Kobos(){
    int sum=0;
    int munka=0;
    int digit=0;
    for (int i = 1; i < 1000; i++) {
        munka=i;
        while(munka!=0){
            digit=munka%10;
            sum+=Math.pow(digit,3);
            munka/=10;
        }
        if (sum==i) {
            System.out.println(i+", ");
        }
        sum=0;
    }
}


    public static void main(String[] args) {
       Novekvo(100,23,13);
       MinMax(-13,-121,32);
       System.out.println(HaromSzog(13,23,32));
       System.out.println(SzokoEv(2000,2024));
       Osztas(133,6);
       System.out.println(IsPrim1(31));
       System.out.println(IsPrim2(2));
       fibonacci1(5);
       fibonacci2(5);
       UjSzam(1235);
       System.out.println(Factorial(6));
       Find(4,12,25);
       System.out.println(FibonacciFind(8));
       Kobos();
 
    }
    
}
