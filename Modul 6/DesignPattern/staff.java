package Praktikum.praktikum6.DesignPattern;

public abstract class staff {
    public Skill getSkill;
    protected String name;
    protected String description;
    protected double baseDamage;
    protected Skill skill;
    protected double bonusDamage = 0;

    public staff(String name, String description, double baseDamage, Skill skill){
        this.name=name;
        this.description=description;
        this.baseDamage=baseDamage;
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

    public Skill getSkill() {
        return skill;
    }

    public double getBonusDamage(){
        return bonusDamage;
    }

    public double getTotalDamage(){
        return baseDamage + bonusDamage;
    }

    public void addBonusDamage(int amount) {
        this.bonusDamage += amount;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getSkillInfo(){

        if (skill == null) return "(no skill)";
        return skill.getSkillName() + " → " + skill.useSkill();
    }
}


