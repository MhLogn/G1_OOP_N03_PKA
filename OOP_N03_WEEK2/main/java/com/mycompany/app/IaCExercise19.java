package main.java.com.mycompany.app;

public class IaCExercise19 {
        // Phương thức với varargs kiểu String
        public static void printStrings(String... strings) {
            for (String s : strings) {
                System.out.println(s);
            }
        }
    
        public static void main(String[] args) {
            // Truyền một danh sách các chuỗi được phân tách bằng dấu phẩy
            printStrings("Chuỗi 1", "Chuỗi 2", "Chuỗi 3");
    
            System.out.println("-----");
    
            // Truyền một mảng String[]
            String[] stringArray = {"Chuỗi A", "Chuỗi B", "Chuỗi C"};
            printStrings(stringArray);
        }
    }
    
