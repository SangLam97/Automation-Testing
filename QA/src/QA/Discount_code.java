package QA;

import java.util.Scanner;
//Bài 1
public class Discount_code {
    public static void main(String[] args){
        String discount_code = "testing";
        Scanner text = new Scanner(System.in);
        System.out.println("Nhập discount code:");
        String  discount = text.nextLine();
         String code = discount.toUpperCase();
        double sub = 10, code_discount = 5, ship = 4.99;
        double total = sub - code_discount + ship;
        if (discount.equals(discount_code) && (code.equals("TESTING"))){
                System.out.println("a True");
        }else {
            System.out.println("a False");
        }
        if (discount.equals(discount_code) && (total == 9.99)){
            System.out.println("b True");
        }else{
            System.out.println("b False");
        }
    }
}
