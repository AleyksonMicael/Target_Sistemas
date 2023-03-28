package Job_RotationSao_Paulo;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();

        // tranformando em array
        char[] chars = string.toCharArray();

        // Inverte os caracteres do array
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        String invertida = new String(chars);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
