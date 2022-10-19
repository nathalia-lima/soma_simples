import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();

        int SOMA = A + B;

        System.out.printf("SOMA = %d\n", SOMA);
    }
}