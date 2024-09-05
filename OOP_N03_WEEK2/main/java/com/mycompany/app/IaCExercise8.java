package OOP_N03_WEEK2.main.java.com.mycompany.app;

public class IaCExersise8 {
    // Phương thức thứ nhất
    public void firstMethod() {
        // Gọi phương thức thứ hai mà không sử dụng 'this'
        secondMethod();

        // Gọi phương thức thứ hai và sử dụng 'this'
        this.secondMethod();
    }

    // Phương thức thứ hai
    public void secondMethod() {
        System.out.println("Phương thức thứ hai đã được gọi!");
    }

    public static void main(String[] args) {
        // Tạo một đối tượng của lớp IaCExcersise8
        IaCExersise8 example = new IaCExersise8();

        // Gọi phương thức đầu tiên
        example.firstMethod();
    }
}