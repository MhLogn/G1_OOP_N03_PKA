package main.java.com.mycompany.app;
class A {
    A() { 
        System.out.println("Constructor của A"); 
    }
}

class B {
    B() { 
        System.out.println("Constructor của B"); 
    }
}

class C extends A {
    B b = new B(); // Thành viên của lớp B trong C
}

public class ReusingClassesExcercise5 {
    public static void main(String[] args) {
        C c = new C(); // Tạo đối tượng của lớp C
    }
}
