package Praktikum.praktikum6.DesignPattern;

import java.util.List;

public class weaponService {
    private final weaponRepository repository;

    public weaponService(weaponRepository repository){
        this.repository=repository;
    }

    public List<staff> getAllWeapons(){
        return repository.findAll();
    }

    public String getStaffDetail(staff s){
        StringBuilder sb = new StringBuilder();
        sb.append("Nama : ").append(s.getName()).append("\n");
        sb.append("Deskripsi : ").append(s.getDescription()).append("\n");
        sb.append("Base Damage : ").append(s.getBaseDamage()).append("\n");
        sb.append("Bonus Damage : ").append(s.getBonusDamage()).append("\n");
        sb.append("Total Damage : ").append(s.getTotalDamage()).append("\n");
        sb.append("Skill : ").append(s.getSkillInfo());
        return sb.toString();
    }
}
