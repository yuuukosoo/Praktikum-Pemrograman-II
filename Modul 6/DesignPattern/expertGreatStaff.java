package Praktikum.praktikum6.DesignPattern;

public class expertGreatStaff extends staff{
    public expertGreatStaff(){
        super("Expert Great Staff",
                "Staff besar dengan kekuatan energi murni",
                20,
                new expertGreatSkill());
    }
}
