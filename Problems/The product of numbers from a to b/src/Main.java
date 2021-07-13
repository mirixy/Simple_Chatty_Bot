import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long prod = 1;
        for (; a < b; a++) {
            prod *= a;
        }
        System.out.println(prod);
    }
}