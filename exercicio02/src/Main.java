public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;

        }


       for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2;
            } else {
                vetor[i] *= 2;
            }
        }


        System.out.println("Vetor após aplicação da regra:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}