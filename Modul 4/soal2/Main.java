package soal2;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice=sc.nextInt();
        sc.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = sc.nextLine();

        System.out.print("Ras: ");
        String race = sc.nextLine();

        System.out.print("Warna bulu: ");
        String color= sc.nextLine();

        if(choice == 1){
            System.out.println(" ");
            System.out.println("Detail Hewan Peliharaan: ");
            Cat cat  = new Cat(name, race, color);
            cat.displayDetailCat();
        }

        else if(choice == 2){
            System.out.print("Kemampuan: ");
            String abilityinput= sc.nextLine();
            String[] ability = abilityinput.split(",");

            System.out.println(" ");
            System.out.println("Detail Hewan Peliharaan: ");
            Dog dog = new Dog(name, race, color, ability);
            dog.displayDetailDog();
        }

    sc.close();
    }
}
