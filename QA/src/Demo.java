import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
      //  System.out.println("Hello World!");
        /*
        tạo 1 biến kiểu hashmap để lưu lại thông tin của 1 học viên bao gồm:
- Key: họ tên học viên
- Value: kết quả [passed/failed]
         */

        HashMap<String, String> result = new HashMap<>();
                //Key = họ tên
        //Nguyễn Thị Mơ,passed{
        result.put("Nguyễn Thị Mơ",  "passed");
        result.put("Nguyễn Thị Thuý",  "passed");
        result.put("Nguyễn Thị Linh",  "failed");

        String rlLinh = result.get("Nguyễn Thị Linh");
        System.out.println("Kết quả của Linh là " + rlLinh);
    }
}

