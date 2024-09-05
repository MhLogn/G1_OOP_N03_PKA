package main.java.com.mycompany.app;

// Lớp Cleanser gốc
class Cleanser {
    private String s = "Cleanser";
    
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    
    @Override
    public String toString() { return s; }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

// Lớp Detergent kế thừa từ lớp Cleanser
class Detergent extends Cleanser {
    // Ghi đè phương thức scrub()
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Gọi phương thức scrub() của lớp cha
    }

    
    // Thêm phương thức mới
    public void foam() { append(" foam()"); }

    // Phương thức main() để kiểm tra lớp Detergent
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

// Lớp NewDetergent kế thừa từ lớp Detergent
class NewDetergent extends Detergent {
    // Ghi đè phương thức scrub()
    @Override
    public void scrub() {
        append(" NewDetergent.scrub()");
        super.scrub(); // Gọi phương thức scrub() của lớp cha
    }

    // Thêm phương thức mới tên là sterilize()
    public void sterilize() {
        append(" sterilize()");
    }

    // Phương thức main() để kiểm tra lớp NewDetergent
    public static void main(String[] args) {
        NewDetergent x = new NewDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
    }
} //tham khao chat gpt :((
