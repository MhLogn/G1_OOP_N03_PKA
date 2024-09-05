package main.java.com.mycompany.app;

public class IaCExercise16 {
    public static void main(String[] args) {
        // Tạo mảng các đối tượng String
        String[] strings = new String[5];

        // Gán giá trị cho từng phần tử trong mảng
        strings[0] = "Hello World";
        strings[1] = "Java";
        strings[2] = "Mảng";
        strings[3] = "Chuỗi";
        strings[4] = "Code";

        // In các phần tử của mảng bằng vòng lặp for
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
