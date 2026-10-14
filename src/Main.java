import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite tres notas de 0 a 10:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("A nota média é " + media);

        if (media >= 7) {
            System.out.println(nome + ", você foi aprovado!");
        } else if (media >= 5) {
            System.out.println(nome + ", você está em recuperação!");
        } else {
            System.out.println(nome + ", infelizmente você foi reprovado.");
        }

        scanner.close();
    }
}
