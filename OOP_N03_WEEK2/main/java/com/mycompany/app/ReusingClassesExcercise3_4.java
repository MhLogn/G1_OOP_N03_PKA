package main.java.com.mycompany.app;
class Art {
    Art() { 
        System.out.println("Art constructor"); 
    }
}

class Drawing extends Art {
    Drawing() { 
        System.out.println("Drawing constructor"); 
    }
}

public class ReusingClassesExcercise3_4 {
    // Không có constructor nào được định nghĩa cho ReusingClassesExcercise3
    public static void main(String[] args) {
        ReusingClassesExcercise3_4 x = new ReusingClassesExcercise3_4(); // Trình biên dịch sẽ tạo constructor mặc định cho ReusingClassesExcercise3
    }
}

/*Câu hỏi Exercise4:Chứng minh rằng các constructor của lớp cha luôn được gọi và chúng được gọi trước các constructor của lớp dẫn xuất.

Trả lời :Mã nguồn hiện tại đã chứng minh điều này. Khi tạo một đối tượng của lớp ReusingClassesExcercise3, các constructor của lớp cha (Art và Drawing) đều được gọi trước khi constructor của ReusingClassesExcercise3 được thực thi. */