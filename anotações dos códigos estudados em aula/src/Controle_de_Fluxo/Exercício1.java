package Controle_de_Fluxo;
import java.util.Scanner; 

public class Exercício1 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero:");
        int numero = input.nextInt();
        
        if(numero==1){
            System.out.println("Janeiro");
        }else if(numero==2){
            System.out.println("Fevereiro");
        }else if(numero==3){
            System.out.println("Março");
        }else if(numero==4){
            System.out.println("Abril");
        }else if(numero==5){
            System.out.println("Maio");
        }
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o mes:");
        String mes = leitor.next();
        
        switch(mes){
            case "julho":
            case "dezembro":
            case "janeiro":
                System.out.print("ferias");
            default:
            System.out.print("Sem ferias");
        }
    }
}
