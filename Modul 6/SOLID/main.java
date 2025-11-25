package Praktikum.praktikum6.SOLID;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        UI ui = new UI();
        Scanner input = new Scanner(System.in);

        weaponRepository repository = new staffRepository();
        weaponService service = new weaponService(repository);
        staffFormatter formatter = new staffFormatter();
        inputHelper helper = new inputHelper(input);

        weaponMenu menu = new weaponMenu(ui, helper, service, formatter);
        menu.start();
    }
}
