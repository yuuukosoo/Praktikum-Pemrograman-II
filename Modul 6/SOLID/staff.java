package Praktikum.praktikum6.SOLID;

public abstract class staff {
    protected String name;
    protected String description;
    protected double baseDamage;
    protected Skill skill;

    public staff(String name, String description, double baseDamage, Skill skill){
        this.name=name;
        this.description=description;
        this.baseDamage=baseDamage;
        this.skill= skill;
    }

    public void setSkill(Skill skill){
        this.skill=skill;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public String getSkillInfo() {
        return skill.getSkillName() + " --> " + skill.useSkill();
    }
}
