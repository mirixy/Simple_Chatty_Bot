import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int value = 0;
        int temp = 0;
        int store = 0;
        for (int i = 0; i < n; i++) {
            value = scanner.nextInt();
            if (value % 4 == 0) {
                temp = value;
            }
            if (store < temp) {
                store = temp;
            }
        }
        System.out.println(store);
    }
}