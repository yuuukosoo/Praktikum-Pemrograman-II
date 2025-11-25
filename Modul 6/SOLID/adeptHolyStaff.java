package Praktikum.praktikum6.SOLID;

public class adeptHolyStaff extends staff{
    public adeptHolyStaff(){
        super("Adept Holy Staff", "Staff suci dengan kemampuan penyembuhan", 15, new adeptHolySkill());
    }
}
