package QA;
import java.util.HashMap;
import java.util.Map;
import  java.util.Map.Entry;
//Bài 2
public class Hashmap {
    Map<String, Values> productInCart = new HashMap<String, Values>();
    public  void addToCart(String key, Values value){
        productInCart.put(key, value);
        System.out.println(productInCart);
    }
    public void minusQuantity(String key, Values value){
        productInCart.replace(key, value);
        System.out.println(productInCart);
    }
    public void printCart(){
        for (Entry<String, Values> entry : productInCart.entrySet()) {
            String key = entry.getKey();
            Values value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }

    public static void main(String[] args) {
        Hashmap hashMap = new Hashmap();
        Values values1 = new Values("green", 69.99, 3);
        Values values2 = new Values("green", 69.99, 2);
        Values values3 = new Values("red", 69.99, 1);

        String name = "Polarized fishing glasses";
        String name1 = "Glasses";
        // a, thêm 3 product vào giỏ hàng
       hashMap.addToCart(name, values1);
       // giảm số lượng của product trong giỏ hàng xuống còn 2
       hashMap.minusQuantity(name,values2);
       //Thêm 1 product khác
       hashMap.addToCart(name1,values3);
       // in toàn bộ product có trong giỏ hàng
       hashMap.printCart();
    }
}
