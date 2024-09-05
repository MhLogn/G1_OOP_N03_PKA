package main.java.com.mycompany.app;

class WithFinals {
    // Phương thức private, không thể ghi đè
    private final void f() { System.out.println("WithFinals.f()"); }
    private void g() { System.out.println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
    // Thử thêm @Override, nhưng vì phương thức private không phải một phần của lớp cha
    // nên điều này sẽ gây lỗi biên dịch
    //@Override
    public final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    //@Override
    public void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

public class ReusingClassesExcercise20 {
    public static void main(String[] args) {
        OverridingPrivate op = new OverridingPrivate();
        op.f(); // Gọi phương thức của OverridingPrivate
        op.g();
    }
}

