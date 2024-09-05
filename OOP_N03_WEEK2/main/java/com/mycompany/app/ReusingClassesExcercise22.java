package main.java.com.mycompany.app;

// Lớp được đánh dấu là final, không thể bị kế thừa
final class FinalClass {
    public void displayMessage() {
        System.out.println("This is a final class.");
    }
}
/*
// Thử kế thừa từ lớp final sẽ gây lỗi biên dịch
class DerivedClass extends FinalClass {
    public void displayMessage() {
        System.out.println("This is a derived class.");
    }
}*/

public class ReusingClassesExcercise22 {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.displayMessage(); // Gọi phương thức từ lớp final
    }
}

