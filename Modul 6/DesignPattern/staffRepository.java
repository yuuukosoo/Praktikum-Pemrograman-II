package Praktikum.praktikum6.DesignPattern;
import java.util.Arrays;
import java.util.List;

public class staffRepository implements weaponRepository{

    @Override
    public List<staff> findAll() {
        return Arrays.asList(
                staffFactory.createStaff("novice_fire"),
                staffFactory.createStaff("adept_holy"),
                staffFactory.createStaff("expert_great")
        );
    }
}
