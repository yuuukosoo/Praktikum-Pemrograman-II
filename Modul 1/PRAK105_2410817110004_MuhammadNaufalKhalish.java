import java.util.Scanner;
public class PRAK105_2410817110004_MuhammadNaufalKhalish {

    public static void main(String[] args) {
        final double phi=3.14f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius=sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height=sc.nextDouble();

        double volume = phi*radius*radius*height;
        volume = Math.floor(volume * 1000.0) / 1000.0;

        System.out.println("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height + " cm adalah " + volume + " m3");
    }
}
