package OOP_N03_WEEK2.main.java.com.mycompany.app;

public class IacExercise3_4 {
    // Hàm tạo mặc định
    public IacExercise3_4() {
        System.out.println("Default constructor");
    } 
    // Hàm overload với String 
     public IacExercise3_4(String message) {
        System.out.println("This is the overloaded constructor! Message: " + message);
    }
    public static void main(String[] args) {
        // Tạo object dùng hàm mặc định
        IacExercise3_4 Object1 = new IacExercise3_4();
    // Tạo object dùng overloaded constructor
    IacExercise3_4 Object2 = new IacExercise3_4("Hello, World!");
}
}