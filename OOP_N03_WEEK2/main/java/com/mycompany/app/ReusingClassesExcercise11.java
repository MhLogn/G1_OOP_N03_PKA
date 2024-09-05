package main.java.com.mycompany.app;

// Detergent.java - sử dụng delegation
class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }
}

public class ReusingClassesExcercise11 {
    private Cleanser cleanser = new Cleanser(); // Delegation

    // Ủy thác các phương thức đến đối tượng cleanser
    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
        append(" Detergent.scrub()"); // Hành vi bổ sung của Detergent
    }

    public void foam() {
        append(" foam()"); // Hành vi riêng của Detergent
    }

    // Thay đổi lớp Cleanser từ Detergent
    private void append(String a) {
        cleanser.append(a);
    }

    @Override
    public String toString() {
        return cleanser.toString(); // Trả về kết quả từ Cleanser
    }

    public static void main(String[] args) {
        ReusingClassesExcercise11 x = new ReusingClassesExcercise11();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
    }
}


