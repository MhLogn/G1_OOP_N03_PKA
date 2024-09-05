package main.java.com.mycompany.app;

// Các lớp component với constructor có tham số
class Component1 {
    Component1(int i) {
        System.out.println("Constructor của lớp Component1 với tham số: " + i);
    }
}

class Component2 {
    Component2(int i) {
        System.out.println("Constructor của lớp Component2 với tham số: " + i);
    }
}

class Component3 {
    Component3(int i) {
        System.out.println("Constructor của lớp Component3 với tham số: " + i);
    }
}

// Lớp cơ sở Root chứa các component
class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root() {
        c1 = new Component1(1);
        c2 = new Component2(2);
        c3 = new Component3(3);
        System.out.println("Constructor của lớp Root");
    }
}

// Lớp kế thừa Stem cũng chứa các component
class Stem extends Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Stem() {
        super(); // Gọi constructor của lớp cơ sở
        c1 = new Component1(4);
        c2 = new Component2(5);
        c3 = new Component3(6);
        System.out.println("Constructor của lớp Stem");
    }
}

public class ReusingClassesExcercise9_10 {
    public static void main(String[] args) {
        System.out.println("Tạo đối tượng Stem:");
        Stem s = new Stem();
    }
}


