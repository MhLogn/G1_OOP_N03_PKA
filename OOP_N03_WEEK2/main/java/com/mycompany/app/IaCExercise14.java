package main.java.com.mycompany.app;

public class IaCExercise14 {
    // Biến tĩnh được khởi tạo tại điểm định nghĩa
    static String field1 = "Đây là field1";

    // Biến tĩnh được khởi tạo trong khối static
    static String field2;

    // Khối static để khởi tạo field2
    static {
        field2 = "Đây là field2";
    }

    // Phương thức tĩnh để in ra giá trị của cả hai field
    public static void printFields() {
        System.out.println("field1: " + field1);
        System.out.println("field2: " + field2);
    }

    public static void main(String[] args) {
        // Gọi phương thức tĩnh để in ra các giá trị của field1 và field2
        IaCExercise14.printFields();
    }
}
