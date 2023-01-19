package Metodos;

public class Main3 {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Retorno.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Retorno.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Retorno.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
