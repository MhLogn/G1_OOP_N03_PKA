package main.java.com.mycompany.app;

public class ReusingClassesExcercise13 {
    // Lớp cơ sở với phương thức được overload ba lần
    static class BaseClass {
        // Phương thức overload đầu tiên
        void display() {
            System.out.println("BaseClass: display()");
        }

        // Phương thức overload thứ hai
        void display(int x) {
            System.out.println("BaseClass: display(int x) with value: " + x);
        }

        // Phương thức overload thứ ba
        void display(String s) {
            System.out.println("BaseClass: display(String s) with value: " + s);
        }
    }

    // Lớp kế thừa với thêm một phương thức overload
    static class DerivedClass extends BaseClass {
        // Phương thức overload mới
        void display(double d) {
            System.out.println("DerivedClass: display(double d) with value: " + d);
        }
    }

    // Lớp thử nghiệm để kiểm tra
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        // Gọi tất cả các phương thức overload
        obj.display();                // Gọi phương thức từ BaseClass
        obj.display(10);              // Gọi phương thức từ BaseClass
        obj.display("Hello");         // Gọi phương thức từ BaseClass
        obj.display(10.5);            // Gọi phương thức từ DerivedClass
    }
}