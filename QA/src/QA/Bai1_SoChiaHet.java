public class Bai1_SoChiaHet {
        public static void main(String args[]){
            System.out.print("Các số chia hết cho 7 và không chia hết cho 5 trong khoảng [10;200] là: ");
            for (int i =10; i<= 200; i++){
                if ((i%7 == 0) && (i%5 != 0)){
                    System.out.print(i + ", ");
                }
            }
        }
    }

