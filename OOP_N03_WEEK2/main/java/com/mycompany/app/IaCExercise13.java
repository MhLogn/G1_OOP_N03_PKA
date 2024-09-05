package main.java.com.mycompany.app;

import static java.lang.System.out;

class Cup {
    Cup(int marker) {
        out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        out.println("Cups()");
    }
}

public class IaCExercise13 {
    public static void main(String[] args) {
        out.println("Inside main()");
        Cups.cup1.f(99); // (1)
    }

    // static Cups cups1 = new Cups(); // (2)
    // static Cups cups2 = new Cups(); // (2)
}
/*Chỉ chạy (1) trong IaCExcersise13, đầu ra là : 
Inside main()
Cup(1)
Cup(2)
f(99) */

/*Comment dòng (1) và uncomment dòng (2), đầu ra ta được:
Cup(1)
Cup(2)
Cups()
Cups()
Inside main()
 */
/*Comment cả dòng (1) và dòng (2), đầu ra được:
 * Ínide main()
 */
/*Kết luận: Khối static trong lớp Cups sẽ chỉ được kích hoạt khi có một lần truy cập đến các thành viên tĩnh hoặc khi lớp Cups được khởi tạo lần đầu tiên.
Khối static chỉ được kích hoạt một lần duy nhất, bất kể bao nhiêu lần các thành viên tĩnh được truy cập hoặc bao nhiêu đối tượng của lớp được tạo ra sau đó.
Nếu không có truy cập nào đến các thành viên tĩnh hoặc lớp không được khởi tạo, khối static sẽ không bao giờ được kích hoạt. */ 
//=>Điều phải chứng minh