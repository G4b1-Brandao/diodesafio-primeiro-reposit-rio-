package Estruturas_de_Repetição;

import java.util.Scanner;

public class Nome_Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
       while(true){
        
        System.out.print("Nome: ");
        String nome = scan.next();

        if(nome.equals("0"))break; //se o nome for igaual a zero vai parar o programa

        System.out.print("Idade: ");
        int idade = scan.nextInt();
    }
}
}