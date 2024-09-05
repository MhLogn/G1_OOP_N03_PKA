package main.java.com.mycompany.app;

public class ReusingClassesExcercise18 {
    // Trường static final: chỉ được khởi tạo một lần và thuộc về lớp
    public static final int STATIC_FINAL_FIELD = 100;

    // Trường final: chỉ được khởi tạo một lần nhưng thuộc về đối tượng
    public final int finalField;

    // Constructor
    public ReusingClassesExcercise18(int value) {
        // Trường final được khởi tạo trong constructor
        this.finalField = value;
    }

    public static void main(String[] args) {
        // Truy cập static final field mà không cần tạo đối tượng
        System.out.println("Static final field: " + ReusingClassesExcercise18.STATIC_FINAL_FIELD);

        // Tạo các đối tượng ReusingClassesExcercise18 với giá trị khác nhau cho finalField
        ReusingClassesExcercise18 obj1 = new ReusingClassesExcercise18(10);
        ReusingClassesExcercise18 obj2 = new ReusingClassesExcercise18(20);

        // Truy cập final field của từng đối tượng
        System.out.println("Object 1 - finalField: " + obj1.finalField); // In ra 10
        System.out.println("Object 2 - finalField: " + obj2.finalField); // In ra 20

        // Thử thay đổi giá trị của static final field hoặc final field sẽ gây lỗi biên dịch
        // ReusingClassesExcercise18.STATIC_FINAL_FIELD = 200; // Lỗi
        // obj1.finalField = 30; // Lỗi
    }
}
/*  Kết luận:static final là trường thuộc về lớp, có một giá trị không đổi cho tất cả các đối tượng.
            final là trường thuộc về đối tượng, có giá trị không đổi nhưng có thể khác nhau giữa các đối tượng.*/