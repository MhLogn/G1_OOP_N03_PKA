package main.java.com.mycompany.app;

public class IaCExercise9 {
        // Constructor thứ nhất không có tham số
        public IaCExercise9() {
            // Gọi constructor thứ hai bằng cách sử dụng 'this'
            this("Hello from the second constructor!");
            System.out.println("Đây là constructor đầu tiên!");
        }
    
        // Constructor thứ hai với một tham số kiểu String
        public IaCExercise9(String message) {
            System.out.println("Đây là constructor thứ hai! Message: " + message);
        }
    
        public static void main(String[] args) {
            // Tạo một đối tượng của IaCExcercise9 sử dụng constructor đầu tiên
            IaCExercise9 obj = new IaCExercise9();
        }
    }
