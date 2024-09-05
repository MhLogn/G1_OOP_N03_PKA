package main.java.com.mycompany.app;

// Các lớp component với constructor mặc định
class Component1 {
    Component1() {
        System.out.println("Constructor của lớp Component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Constructor của lớp Component2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Constructor của lớp Component3");
    }
}

// Lớp cơ sở Root chứa các component
class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root() {
        System.out.println("Constructor của lớp Root");
    }
}

// Lớp kế thừa Stem cũng chứa các component
class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Stem() {
        System.out.println("Constructor của lớp Stem");
    }
}

public class ReusingClassesExcercise12 {
    public static void main(String[] args) {
        System.out.println("Tạo đối tượng Stem:");
        Stem s = new Stem();
    }
}
