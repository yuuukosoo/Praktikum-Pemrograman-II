package soal1;
public class Pet {
    private String name;
    private String race;

    public Pet(String n, String r) {
        this.name = n;
        this.race = r;
    }

    public String getName() {
        return name; }

    public String getRace() {
        return race; }

    public void display(){
        System.out.println(" ");
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + getName());
        System.out.println("Dengan ras : " + getRace());
    }
}
