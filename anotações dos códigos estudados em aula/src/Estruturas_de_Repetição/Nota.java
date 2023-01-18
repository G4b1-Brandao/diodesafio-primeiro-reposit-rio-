package Estruturas_de_Repetição;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Nota:");
            int nota = scan.nextInt();

        while(nota < 0 || nota>10){
            System.out.print("Nota inválido! Digite novamente:");
            nota = scan.nextInt();
        }
        
    }
    
}
