package Praktikum.praktikum6.DesignPattern;

public class staffFactory {
    public static staff createStaff(String type){
        switch(type.toLowerCase()){
            case "novice_fire":
                return new noviceFireStaff();
            case "adept_holy":
                return new adeptHolyStaff();
            case "expert_great":
                return new expertGreatStaff();
            default:
                throw new IllegalArgumentException("Unknowrn staff type");
        }
    }
}
