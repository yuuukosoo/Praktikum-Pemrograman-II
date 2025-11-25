package Praktikum.praktikum6.SOLID;

public class staffFormatter {
    public String format(staff s){
        return
                "Nama : " + s.getName() +
                "\nDeskripsi : " + s.getDescription() +
                "\nbaseDamage : " + s.getBaseDamage() +
                "\nSkill : " + s.getSkillInfo();
    }
}
