package main.java.com.mycompany.app;

public class IaCExercise10_11 {
    // Phương thức finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Đối tượng đang được thu gom rác!");
        super.finalize();
    }

    public static void main(String[] args) {
        IaCExercise10_11 obj = null;
        try {
            // Tạo một đối tượng của IaCExercise10_11
            obj = new IaCExercise10_11();
        } finally {
            if (obj != null) {
                try {
                    obj.finalize();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }
    }
}
