public class Main {
    public static void main(String[] args) {


        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }


        System.out.println("Vetor em ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}