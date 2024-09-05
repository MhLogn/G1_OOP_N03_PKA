package main.java.com.mycompany.app;

    class A {
        A(int i) {
            System.out.println("Constructor của A với đối số: " + i);
        }
    }
    
    class B extends A {
        B(int i) {
            super(i);
            System.out.println("Constructor của B với đối số: " + i);
        }
    }
    
    class C extends B {
        C(int i) {
            super(i);
            System.out.println("Constructor của C với đối số: " + i);
        }
    }
    
    public class ReusingClassesExcercise7 {
        public static void main(String[] args) {
            C c = new C(5);
        }
    }
//Lớp C kế thừa từ lớp B, mà lớp B kế thừa từ lớp A. Constructor của C gọi constructor của B, và constructor của B gọi constructor của A.
//lú @@