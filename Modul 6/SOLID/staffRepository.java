package Praktikum.praktikum6.SOLID;
import java.util.Arrays;
import java.util.List;

public class staffRepository implements weaponRepository{

    @Override
    public List<staff> findAll() {
        staff novice = new novicesFireStaff();
        staff adept = new adeptHolyStaff();
        staff expert = new expertGreatStaff();


        return Arrays.asList(novice, adept, expert);
    }
}
