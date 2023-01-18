package Array;

public class Ordem_Inversa {
    public static void main(String[] args) {
        int[] vetor = {-5,-6,15,67,8,4};
        int count = 0;
        while(count < (vetor.length-1)){ //length retorna o tamanho do vetor
            System.out.print(vetor[count] + " ");
            count++;
        }
        for(int i = vetor.length-1;i>=0;i--){
            System.out.print(vetor[i] + " ");
        }
        
    }
}
