import java.util.Scanner;

public class AddingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPreviousZero = false;
        int total = 0, subtotal = 0;
        int input, last = 1;
        int MAXIMUM_NUMBER_OF_INPUTS = 100;
        // TODO Add code here and elsewhere to complete AddingMachine
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                if (isPreviousZero) {
                    System.out.println("total " + total);
                    return;
                } else {
                    System.out.println("subtotal " + subtotal);
                    total += subtotal;
                    subtotal = 0;
                    isPreviousZero = true;
                }
            } else {
                isPreviousZero = false;
                subtotal = subtotal * 10 + input;
                if (subtotal > MAXIMUM_NUMBER_OF_INPUTS) {
                    System.out.println("Syntax Error!");
                    return;
                }
            }
        }
    }
}
