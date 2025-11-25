package Praktikum.praktikum6.DesignPattern;

public abstract class skillDecorator implements Skill{
    protected Skill wrappedSkill;

    public skillDecorator(Skill wrappedSkill) {
        this.wrappedSkill = wrappedSkill;
    }
}
