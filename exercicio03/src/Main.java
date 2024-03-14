import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();


        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }


        if (posicao != -1) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("Valor não encontrado.");
        }

        sc.close();
    }
}