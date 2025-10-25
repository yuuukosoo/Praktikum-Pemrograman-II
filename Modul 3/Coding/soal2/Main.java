package Praktikum.praktikum3.soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);


      HashMap<Integer, String> month = new HashMap<>();
      month.put(1, "Januari");
      month.put(2, "Februari");
      month.put(3, "Maret");
      month.put(4, "April");
      month.put(5, "Mei");
      month.put(6, "Juni");
      month.put(7, "Juli");
      month.put(8,"Agustus");
      month.put(9, "September");
      month.put(10, "Oktober");
      month.put(11, "November");
      month.put(12, "Desember");

      LinkedList<Country> listCountry = new LinkedList<>();
      int total = sc.nextInt();
      sc.nextLine();

      for(int i=0; i<total; i++){
          String countryName= sc.nextLine();
          String leadershipStyle = sc.nextLine();
          String leaderName = sc.nextLine();

          if(leadershipStyle.equalsIgnoreCase("Monarki")){
              listCountry.add(new Country(countryName, leadershipStyle, leaderName));
          }
          else{
              int independenceDay=sc.nextInt();
              int independenceMonth=sc.nextInt();
              int independenceYear=sc.nextInt();
              sc.nextLine();
              listCountry.add(new Country(countryName,leadershipStyle,leaderName,independenceDay, independenceMonth,independenceYear));

          }
      }

    for(Country country: listCountry){
        country.display(month);
    }

    }
}
