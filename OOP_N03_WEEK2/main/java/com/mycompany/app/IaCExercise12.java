package main.java.com.mycompany.app;

public class IaCExercise12 {
    private boolean isFull = false;

    // Đổ đầy Tank
    public void fill() {
        isFull = true;
        System.out.println("Tank đã được đổ đầy.");
    }

    // Làm trống Tank
    public void empty() {
        isFull = false;
        System.out.println("Tank đã được làm trống.");
    }

    // Phương thức finalize để kiểm tra điều kiện kết thúc
    @Override
    protected void finalize() throws Throwable {
        if (isFull) {
            System.out.println("Lỗi: Tank chưa được làm trống!");
        } else {
            System.out.println("Tank đã được làm trống trước khi thu gom rác.");
        }
    }

    public static void main(String[] args) {
        // Tạo một đối tượng của Tank
        IaCExercise12 tank1 = new IaCExercise12();
        tank1.fill();

        // Không làm trống tank trước khi gán null
        tank1 = null;
        System.gc();  // Yêu cầu thu gom rác

        // Tạo một đối tượng khác và làm trống nó trước khi gán null
        IaCExercise12 tank2 = new IaCExercise12();
        tank2.fill();
        tank2.empty();
        tank2 = null;
        System.gc();  // Yêu cầu thu gom rác
    }
}
//Nếu Tank chưa được làm trống khi đối tượng bị thu gom rác, chương trình sẽ in ra một thông báo lỗi.
//Nếu Tank đã được làm trống, chương trình sẽ xác nhận.