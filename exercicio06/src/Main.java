public class Main {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5};
        int aux;

        System.out.println("Vetor original:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        // Inverter a sequência dos valores no vetor
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = aux;
        }

        System.out.println("Vetor invertido:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
