package praktikum2.Soal1;

public class Main {
    public static void main (String[] args){
        Fruit apel= new Fruit();
        apel.setName("apel");
        apel.setWeight(0.4);
        apel.setPrice(7000.0);
        apel.setBuy_total(40);
        apel.display();

        Fruit mangga = new Fruit();
        mangga.setName("mangga");
        mangga.setWeight(0.2);
        mangga.setPrice(3500.0);
        mangga.setBuy_total(15);
        mangga.display();

        Fruit alpukat = new Fruit();
        alpukat.setName("alpukat");
        alpukat.setWeight(0.25);
        alpukat.setPrice(10000.0);
        alpukat.setBuy_total(12);
        alpukat.display();
    }
}

