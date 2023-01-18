package Estruturas_de_Repetição;

import java.util.Scanner;

public class Tabuada {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nunero = scan.nextInt();
        

        System.out.println("Tabuada de " + nunero);
        for(int i = 1;i<=10;i++){
            System.out.println(nunero+" X " + i + " = " + (nunero*i));
        }
      
}
}