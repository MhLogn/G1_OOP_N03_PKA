package main.java.com.mycompany.app;

class MyClass {
        // Constructor nhận tham số String và in ra tham số đó
         MyClass(String message) {
         System.out.println("Constructor called with message: " + message);
    }
}
public class IaCExercise17_18 {
        public static void main(String[] args) {
        // Tạo mảng tham chiếu đến đối tượng MyClass
         MyClass[] array = new MyClass[5];
    
        // Không khởi tạo đối tượng, chỉ là mảng tham chiếu
        System.out.println("Đã tạo mảng tham chiều nhưng k có đối tượng được khởi tạo.");
        // Khởi tạo các đối tượng và gán vào mảng tham chiếu
        for (int i = 0; i < array.length; i++) {
        array[i] = new MyClass("Đối tượng " + (i + 1));
             }
        }   
    }

