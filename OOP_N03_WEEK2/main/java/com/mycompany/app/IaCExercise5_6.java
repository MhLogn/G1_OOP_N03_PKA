package OOP_N03_WEEK2.main.java.com.mycompany.app;

public class IaCExercise5_6 {
    // Phương thức cho tham số kiểu int
    public void bark(int i) {
        System.out.println("Sủa to với cường độ: " + i);
    }

    // Phương thức cho tham số kiểu double
    public void bark(double d) {
        System.out.println("Sủa với tần số: " + d);
    }

    // Phương thức cho tham số kiểu boolean
    public void bark(boolean b) {
        if (b) {
            System.out.println("Sủa mạnh");
        } else {
            System.out.println("Sũa nhẹ");
        }
    }

    // Phương thức cho tham số kiểu String
    public void bark(String s) {
        System.out.println("Sủa với thông điệp: " + s);
    }

    // Phương thức bark với hai tham số int và double 
    public void bark(int i, double d) {
        System.out.println("Sủa to với cường độ: " + i + " và tần số: " + d);
    }

    // Phương thức với hai tham số double và int
    public void bark(double d, int i) {
        System.out.println("Hú với tần số: " + d + " và cường độ: " + i);
    }

    public static void main(String[] args) {
        IaCExercise5_6 myDog = new IaCExercise5_6();
        // Gọi tất cả các loại khác nhau của phương thức bark()
        myDog.bark(3);
        myDog.bark(3.5);
        myDog.bark(true);
        myDog.bark("Xin chào!");
        myDog.bark(5, 7.2);
        myDog.bark(7.2, 5);
    }
}    
