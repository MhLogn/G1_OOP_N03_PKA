package OOP_N03_WEEK2.main.java.com.mycompany.app;

public class DerivedClass extends ReusingClassesExcercise15 {
    public DerivedClass() {
        super();
    }

    public void callProtectedMethod() {
        // Gọi phương thức protected từ lớp con
        protectedMethod();
    }
}