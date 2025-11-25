package Praktikum.praktikum6.DesignPattern;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        UI ui = new UI();
        Scanner input = new Scanner(System.in);

        weaponRepository repository = new staffRepository();
        weaponService service = new weaponService(repository);

        weaponMenu menu = new weaponMenu(ui, input, service);
        menu.start();
    }
}
