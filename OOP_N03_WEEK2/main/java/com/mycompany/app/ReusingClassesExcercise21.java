package main.java.com.mycompany.app;

class BaseClass {
    // Phương thức final không thể bị ghi đè
    public final void finalMethod() {
        System.out.println("BaseClass finalMethod()");
    }
}

class DerivedClass extends BaseClass {
    // Thử ghi đè phương thức final sẽ gây lỗi biên dịch
    // @Override
    // public void finalMethod() {
    //     System.out.println("DerivedClass finalMethod()");
    // }
}

public class ReusingClassesExcercise21 {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        derived.finalMethod(); // Gọi phương thức final từ lớp cha
    }
}


