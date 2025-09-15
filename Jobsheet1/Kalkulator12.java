package Jobsheet1;
import java.util.Scanner;
public class Kalkulator12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Hasil: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Hasil: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Hasil: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Hasil: " + result);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                break;
        }
        scanner.close();
    }
}
