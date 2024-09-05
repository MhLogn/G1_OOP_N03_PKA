package main.java.com.mycompany.app;

class Amphibian {
    public void move() {
        System.out.println("Amphibian is moving");
    }

    public void makeSound() {
        System.out.println("Amphibian is making a sound");
    }
}

class Frog extends Amphibian {
    @Override
    public void move() {
        System.out.println("Frog is jumping");
    }

    @Override
    public void makeSound() {
        System.out.println("Frog is croaking");
    }
}

public class ReusingClassesExcercise16_17 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        
        // Upcasting từ Frog lên Amphibian
        Amphibian amphibian = frog;

        // Gọi các phương thức sau khi upcast
        amphibian.move();        // In ra "Frog is jumping"
        amphibian.makeSound();   // In ra "Frog is croaking"
    }
}