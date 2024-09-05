package main;

import  main.java.com.mycompany.app.DerivedClass;

public class ReusingClassesExercise15 {
public static void main(String[] args) {
    DerivedClass derivedObj = new DerivedClass();
    derivedObj.callProtectedMethod(); // Sẽ in ra "Phương thức được bảo vệ"
}
}