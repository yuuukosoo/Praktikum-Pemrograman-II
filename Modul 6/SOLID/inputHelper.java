package Praktikum.praktikum6.SOLID;
import java.util.Scanner;

public class inputHelper {
    private final Scanner scanner;

    public inputHelper(Scanner scanner){

        this.scanner=scanner;
    }

    public int getInt(String prompt){
        System.out.print(prompt);
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String getString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

}
