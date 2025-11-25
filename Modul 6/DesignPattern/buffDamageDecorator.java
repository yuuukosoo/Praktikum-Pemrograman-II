package Praktikum.praktikum6.DesignPattern;

public class buffDamageDecorator extends skillDecorator {
    private final int added;

    public buffDamageDecorator(Skill skill, int added){
        super(skill);
        this.added=added;
    }

    @Override
    public String getSkillName() {
        return wrappedSkill.getSkillName() + " + Buff(+" + added + ")";
    }

    @Override
    public String useSkill() {
        return wrappedSkill.useSkill() + " (Damage +" + added + ")";
    }
}
