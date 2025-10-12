package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String name= sc.nextLine();

        System.out.print("Ras: ");
        String race=sc.nextLine();

        Pet pet = new Pet(name, race);
        pet.display();
    }
}
