package Estruturas_de_Repetição;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int count = 0;
        int qtd_Par = 0;
        int qtd_Impar = 0;
         System.out.print("Qual a quantidade de numeros:");
         int qtdNumero = scan.nextInt();

         do{
            System.out.print("Numero:");
             int Numero = scan.nextInt();
             count++;

             if(Numero %2 == 0){
             qtd_Par++;
             }
             else{
                qtd_Impar++;
             }

         }while(count < qtdNumero);

         System.out.println("Quantidade de pares:"+ qtd_Par);
         System.out.println("Quantidade de impares:"+ qtd_Impar);
         
        }

}