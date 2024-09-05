package main.java.com.mycompany.app;

// Lớp cơ sở với constructor không mặc định
class Base {
    Base(int i) {
        System.out.println("Constructor của lớp Base với tham số: " + i);
    }
}

// Lớp kế thừa với cả constructor mặc định và constructor có tham số
class Derived extends Base {
    Derived() {
        super(1); // Gọi constructor của lớp cơ sở với tham số
        System.out.println("Constructor mặc định của lớp Derived");
    }

    Derived(int i) {
        super(i); // Gọi constructor của lớp cơ sở với tham số
        System.out.println("Constructor có tham số của lớp Derived với tham số: " + i);
    }
}

public class ReusingClassesExcercise8 {
    public static void main(String[] args) {
        System.out.println("Tạo đối tượng Derived với constructor mặc định:");
        Derived d1 = new Derived(); // Gọi constructor mặc định

        System.out.println("\nTạo đối tượng Derived với constructor có tham số:");
        Derived d2 = new Derived(5); // Gọi constructor có tham số
    }
}
