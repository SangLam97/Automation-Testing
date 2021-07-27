
import java.util.Scanner;
public class PhuongTrinhBac2 {
    /*
    Giải phương trình bậc 2: ax^2 + bx + c = 0 với a, b, c nhập vào từ bàn phím
     */
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Nhap he so a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap he so b: ");
        int b = scanner.nextInt();

        System.out.println("Nhap he so c: ");
        int c = scanner.nextInt();

        double delta = (b * b - 4 * a * c) / 2;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh bac nhat " + b + "x + " + c + " co nghiem duy nhat la " + x);
            }
        } else {
            if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh bac hai " + a + "x^2 + " + b + "x + " + c + " co nghiem kep la " + x);
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh bac hai " + a + "x^2 + " + b + "x + " + c + " co 2 nghiem phan biet la " + x1 + " va " + x2);
            } else
                System.out.println("Phuong trinh bac hai " + a + "x^2 + " + b + "x + " + c + " vo nghiem");
        }
    }
}
