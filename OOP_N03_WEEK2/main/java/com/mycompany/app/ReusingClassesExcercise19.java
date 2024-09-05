package main.java.com.mycompany.app;

class MyObject {
    private String name;

    public MyObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ReusingClassesExcercise19 {
    // Biến final trống, tham chiếu đến một đối tượng
    private final MyObject myFinalObject;

    // Constructor 1: Khởi tạo final field
    public ReusingClassesExcercise19(String objectName) {
        myFinalObject = new MyObject(objectName);  // Phải khởi tạo biến final
    }

    // Constructor 2: Khởi tạo final field bằng cách khác
    public ReusingClassesExcercise19() {
        myFinalObject = new MyObject("Default Name");  // Phải khởi tạo biến final
    }

    // Phương thức in ra tên của đối tượng MyObject
    public void displayObjectName() {
        System.out.println("Object Name: " + myFinalObject.getName());
    }

    // Thử thay đổi giá trị của myFinalObject sẽ gây lỗi biên dịch
    // public void changeObject() {
    //     myFinalObject = new MyObject("New Name"); // Lỗi, không thể thay đổi giá trị của final
    // }

    public static void main(String[] args) {
        // Sử dụng constructor 1
        ReusingClassesExcercise19 obj1 = new ReusingClassesExcercise19("Custom Name");
        obj1.displayObjectName();  // In ra "Object Name: Custom Name"

        // Sử dụng constructor 2
        ReusingClassesExcercise19 obj2 = new ReusingClassesExcercise19();
        obj2.displayObjectName();  // In ra "Object Name: Default Name"
    }
}


