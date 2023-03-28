package Job_RotationSao_Paulo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        List<Integer> sequencia = fibonacci(n);

        if (sequencia.contains(n)) {
            System.out.println("Numero " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("Numero " + n + " não pertence à sequência de Fibonacci.");
        }

    }
    public static List<Integer> fibonacci(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        while (sequence.get(sequence.size() - 1) < n) {
            int nextNumber = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            sequence.add(nextNumber);
        }
        return sequence;

    }
}
