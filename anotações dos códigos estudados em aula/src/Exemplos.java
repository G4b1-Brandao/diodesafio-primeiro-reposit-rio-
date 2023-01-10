public class Exemplos {
    public static void main (String [] args) { 
        String nome1 = "Ana";
        String nome2 = "Lima";

        String nomeCompleto = nomeCompleto(nome1, nome2);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String nome1, String nome2){
        return nome1.concat("").concat(nome2);
    }
}

