
import java.util.Scanner;

public class Bai2_SoNguyenTo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println("Các số nguyên tố nhỏ hơn " +n+ " là: ");
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
                System.out.println("Không có số nguyên tố nào < "+n);
        }
    }

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}