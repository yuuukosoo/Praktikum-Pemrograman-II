package Praktikum.praktikum6.DesignPattern;

public class noviceFireSkill implements Skill {
    @Override
    public String getSkillName() {
        return "Fire Bolt";
    }

    @Override
    public String useSkill() {
        return "Menembakkan api kecil ke musuh";
    }
}
