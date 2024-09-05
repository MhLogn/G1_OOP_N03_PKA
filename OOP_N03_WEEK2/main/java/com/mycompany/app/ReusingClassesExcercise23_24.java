package main.java.com.mycompany.app;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("Insect constructor: i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("Beetle constructor: k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Main method of Beetle");
        Beetle b = new Beetle();  // Tạo đối tượng Beetle đầu tiên
    }
}

class Scarab extends Beetle {
    private int m = printInit("Scarab.m initialized");

    public Scarab() {
        System.out.println("Scarab constructor: m = " + m);
        System.out.println("j = " + j);
    }

    private static int x3 = printInit("static Scarab.x3 initialized");

    public static void main(String[] args) {
        System.out.println("Main method of Scarab");
        Scarab s = new Scarab();  // Tạo đối tượng Scarab
    }
}

