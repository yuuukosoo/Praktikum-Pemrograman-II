package Praktikum.praktikum6.DesignPattern;

public class adeptHolyStaff extends staff{
    public adeptHolyStaff(){
        super("Adept Holy Staff",
                "Staff dengan kemampuan penyembuhan",
                14,
                new adeptHolySkill());
    }
}
