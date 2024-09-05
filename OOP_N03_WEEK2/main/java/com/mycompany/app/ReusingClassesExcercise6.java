package main.java.com.mycompany.app;

// Chạy đoạn mã này đầu tiên để chứng minh lỗi khi không gọi super(i)
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        // Không gọi super(i) ở đây sẽ gây lỗi biên dịch
        System.out.println("BoardGame constructor");
    }
}

public class ReusingClassesExcercise6 {
    public static void main(String[] args) {
        // Sẽ bị lỗi biên dịch vì không gọi constructor của lớp cơ sở
        // BoardGame bg = new BoardGame(11);
    }
}
/* 
// Chạy đoạn mã này sau đó để chứng minh lỗi khi gọi super(i) không đúng vị trí
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        // Di chuyển super(i) sau câu lệnh print sẽ gây lỗi biên dịch
        System.out.println("BoardGame constructor");
        super(i);
    }
}

public class ReusingClassesExcercise6 {
    public static void main(String[] args) {
        // Sẽ bị lỗi biên dịch vì super(i) phải là câu lệnh đầu tiên trong constructor
        // BoardGame bg = new BoardGame(11);
    }
}
*/