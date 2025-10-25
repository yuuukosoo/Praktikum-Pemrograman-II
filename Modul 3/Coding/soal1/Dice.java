package Praktikum.praktikum3.soal1;
import java.util.Random;


public class Dice {
    private int value;

    public void randomize(){
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }

    public int getValue(){
        return value;
    }
}
