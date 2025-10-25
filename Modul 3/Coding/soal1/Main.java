package Praktikum.praktikum3.soal1;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);
        LinkedList<Dice> dicevalue = new LinkedList<>();

        int listdice = sc.nextInt();

        for(int i=0; i<listdice; i++){
            Dice d = new Dice();
            d.randomize();
            dicevalue.add(d);
        }

        int totalvalue=0;
        for(int i=0; i<dicevalue.size(); i++){
            int value= dicevalue.get(i).getValue();
            System.out.println("Dadu ke-" + (i+1) + " bernilai " + value);
            totalvalue += value;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalvalue);

    }
}
