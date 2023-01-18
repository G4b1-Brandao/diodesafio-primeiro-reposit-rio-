package Estruturas_de_Repetição;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int soma = 0;
        

        do{
            System.out.print("Numero: ");   
            int numero = scan.nextInt(); 

            soma = soma + numero; 
            if(numero > maior) maior = numero;

            count++;

        } while(count < 5);
 
        System.out.println("Maior:"+ maior);
        System.out.print("Media:"+ soma/5);


}
}