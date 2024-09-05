package main.java.com.mycompany.app;

public class IaCExercise15 {
      // Biến String được khởi tạo thông qua khối khởi tạo instance
      String message;

      // Khối khởi tạo instance
      {
          message = "Đây là một chuỗi được khởi tạo trong khối instance IaCExcercise15.";
          System.out.println("Khối instance initialization được thực thi.");
      }
  
      // Constructor mặc định
      public IaCExercise15() {
          System.out.println("Constructor mặc định được gọi.");
      }
  
      // Constructor với tham số
      public IaCExercise15(String customMessage) {
          message = customMessage;
          System.out.println("Constructor với tham số được gọi.");
      }
  
      // Phương thức để in ra giá trị của message
      public void printMessage() {
          System.out.println("Message: " + message);
      }
  
      public static void main(String[] args) {
          System.out.println("Tạo đối tượng bằng constructor mặc định:");
          IaCExercise15 obj1 = new IaCExercise15();
          obj1.printMessage();
  
          System.out.println("\nTạo đối tượng bằng constructor với tham số:");
          IaCExercise15 obj2 = new IaCExercise15("Chuỗi được khởi tạo trong constructor.");
          obj2.printMessage();
      }
  }
