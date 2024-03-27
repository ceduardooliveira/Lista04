import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando a matriz 5x5 e recebendo os valores
        int[][] matriz = new int[5][5];
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Valor [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorSomaLinhas = Integer.MIN_VALUE;
        int maiorSomaColunas = Integer.MIN_VALUE;

        // Calculando a maior
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha > maiorSomaLinhas) {
                maiorSomaLinhas = somaLinha;
            }
            if (somaColuna > maiorSomaColunas) {
                maiorSomaColunas = somaColuna;
            }
        }

        System.out.println("Maior soma entre as linhas: " + maiorSomaLinhas);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColunas);

        scanner.close();


    }

}