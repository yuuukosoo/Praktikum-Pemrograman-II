package soal2;

public class Cat extends Pet{
    private String color;

    public Cat(String n, String r, String w ) {
        super(n, r);
        this.color = w;
    }

    public String getColor(){
        return color;
    }

    public void displayDetailCat(){
        super.display();
        System.out.println("Memiliki Warna bulu: " + getColor());
    }
}
