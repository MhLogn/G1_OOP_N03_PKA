package main.java.com.mycompany.app;

// Lớp đơn giản đầu tiên
class SimpleClass {
    private String message;

    // Constructor
    public SimpleClass() {
        this.message = "Đối tượng của SimpleClass đã được khởi tạo!";
    }

    public void showMessage() {
        System.out.println(message);
    }
}

// Lớp thứ hai sử dụng lazy initialization
public class ReusingClassesExcercise1 {
    private SimpleClass simpleObject; // Tham chiếu tới đối tượng của SimpleClass

    public void useSimpleClass() {
        if (simpleObject == null) { // Lazy initialization
            simpleObject = new SimpleClass();
        }
        simpleObject.showMessage();
    }

    public static void main(String[] args) {
        ReusingClassesExcercise1 example = new ReusingClassesExcercise1();
        example.useSimpleClass(); // Lần đầu tiên sử dụng, đối tượng được khởi tạo
        example.useSimpleClass(); // Lần thứ hai sử dụng, đối tượng đã tồn tại
    }
}
