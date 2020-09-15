import java.util.Scanner;

import.java.util.Scanner

;public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, mediaAluno, mediaClasse=0;
        int NUM_ALUNOS = 5;

        for(int aluno = 1; aluno < NUM_ALUNOS; aluno++) {

            do {
                System.out.println("Digite a primeira nota (0 a 10) do aluno " + aluno + ": ");
                nota1 = teclado.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("Digite a primeira nota (0 a 10) do aluno " + aluno + ": ");
                nota2 = teclado.nextDouble();
            } while (nota2 < 0 || nota2 > 10)

            mediaAluno = (nota1 + nota2) / 2;
            mediaSala = mediaSala + mediaAluno;
            System.out.println("Media do aluno " + aluno + ": " + mediaAluno);
        }
        System.out.println("Media da classe: " + mediaSala / 5);

        teclado.close();
    }
}
