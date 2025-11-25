package Praktikum.praktikum6.DesignPattern;

public class noviceFireStaff extends staff{
    public noviceFireStaff(){
        super("Novice Fire Staff",
                "Staff api dasar untuk pemula",
                10,
                new noviceFireSkill());
    }
}
