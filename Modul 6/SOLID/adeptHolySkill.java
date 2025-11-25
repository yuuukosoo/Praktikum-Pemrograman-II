package Praktikum.praktikum6.SOLID;

public class adeptHolySkill implements Skill{
    @Override
    public String getSkillName() {
        return "Holy Bless";
    }

    @Override
    public String useSkill() {
        return "Memulihkan HP sekutu";
    }
}
