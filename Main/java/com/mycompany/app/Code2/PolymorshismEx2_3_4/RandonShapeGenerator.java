package Main.java.com.mycompany.app.Code2.PolymorshismEx2_3_4;

import java.util.Random;

public class RandonShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)){
            default :
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
