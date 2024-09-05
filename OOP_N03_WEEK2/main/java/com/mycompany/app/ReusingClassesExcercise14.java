package main.java.com.mycompany.app;

public class ReusingClassesExcercise14 {

    // Lớp Engine với phương thức service() mới
    static class Engine {
        public void start() {
            System.out.println("Engine started.");
        }

        public void rev() {
            System.out.println("Engine revved.");
        }

        public void stop() {
            System.out.println("Engine stopped.");
        }

        // Thêm phương thức service()
        public void service() {
            System.out.println("Engine is being serviced.");
        }
    }

    // Lớp Wheel
    static class Wheel {
        public void inflate(int psi) {
            System.out.println("Wheel inflated to " + psi + " PSI.");
        }
    }

    // Lớp Window
    static class Window {
        public void rollup() {
            System.out.println("Window rolled up.");
        }

        public void rolldown() {
            System.out.println("Window rolled down.");
        }
    }

    // Lớp Door chứa một đối tượng Window
    static class Door {
        public Window window = new Window();

        public void open() {
            System.out.println("Door opened.");
        }

        public void close() {
            System.out.println("Door closed.");
        }
    }

    // Lớp Car với các thành phần được khai báo
    static class Car {
        public Engine engine = new Engine();
        public Wheel[] wheel = new Wheel[4];
        public Door left = new Door(), right = new Door(); // 2-door

        public Car() {
            for (int i = 0; i < 4; i++) {
                wheel[i] = new Wheel();
            }
        }

        public static void main(String[] args) {
            Car car = new Car();

            // Gọi phương thức service() của Engine
            car.engine.service();

            // Các hành động khác
            car.left.window.rollup();
            car.wheel[0].inflate(72);
        }
    }
}
