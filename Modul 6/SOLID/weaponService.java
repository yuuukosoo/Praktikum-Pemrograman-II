package Praktikum.praktikum6.SOLID;
import java.util.List;

public class weaponService {
    private final weaponRepository repository;

    public weaponService(weaponRepository repository){
        this.repository=repository;
    }

    public List<staff> getAllWeapons(){
        return repository.findAll();
    }
}
