import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double P1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double P2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double P3 = leitor.nextDouble();
        System.out.println("Soma das notas: " + (P1 + P2 + P3));

    }


}



