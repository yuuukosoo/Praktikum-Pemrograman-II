package soal2;

public class Dog extends Pet{
    private String color;
    private String[] ability;

    public Dog(String n, String r, String w, String[] k) {
        super(n, r);
        this.color = w;
        this.ability = k;
    }

    public String getColor() {
        return color;
    }

    public String[] getAbility() {
        return ability;
    }

    public void displayDetailDog(){
        super.display();
        System.out.println("Memiliki warna bulu: " + getColor());
        System.out.print("Memiliki kemampuan: ");
        for (int i=0; i< ability.length; i++){
            System.out.print(ability[i]);
        }
        System.out.println();
    }
}
