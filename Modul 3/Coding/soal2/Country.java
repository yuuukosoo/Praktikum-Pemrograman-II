package Praktikum.praktikum3.soal2;
import java.util.HashMap;

public class Country {
    private String countryName;
    private String leadershipStyle;
    private String leaderName;
    private int independenceDay;
    private int independenceMonth;
    private int independenceYear;


    public Country(String countryName, String leadershipStyle, String leaderName){
        this.countryName=countryName;
        this.leadershipStyle=leadershipStyle;
        this.leaderName=leaderName;

    }

    public Country(String countryName, String leadershipStyle, String leaderName, int independenceDay,int independenceMonth, int independenceYear ){
        this.countryName=countryName;
        this.leadershipStyle=leadershipStyle;
        this.leaderName=leaderName;
        this.independenceDay=independenceDay;
        this.independenceMonth=independenceMonth;
        this.independenceYear=independenceYear;
    }

    public String getCountryName(){
        return countryName;
    }

    public String getLeadershipStyle(){
        return leadershipStyle;
    }

    public String getLeaderName(){
        return leaderName;
    }

    public int getIndependenceDay(){
        return independenceDay;
    }

    public int getIndependenceMonth(){
        return independenceMonth;
    }

    public int getIndependenceYear(){
        return independenceYear;
    }

    public void display(HashMap<Integer, String> MonthMap ){
        if(leadershipStyle.equalsIgnoreCase("monarki")){
            System.out.println("Negara " + countryName + " mempunyai Raja bernama " + leaderName);
        }

        else{
            System.out.println("Negara " + countryName + " mempunyai " + capitalize(leadershipStyle) + " bernama " + leaderName);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + independenceDay + " " + MonthMap.get(independenceMonth) + " " + independenceYear);

    }

        System.out.println();
}

private static String capitalize(String text){
        if(text == null || text.isEmpty()) return text;

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            result.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();

}
}
