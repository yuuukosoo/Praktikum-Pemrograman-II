package praktikum2.Soal1;

public class Fruit {
    private String name;
    private double weight;
    private double price;
    private double buy_total;
    private final double discount = 0.02;
    private final double multiple_discount = 4.0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBuy_total(double buy_total) {
        this.buy_total = buy_total;
    }

    public double getBuy_total() {
        return buy_total;
    }

    public double getpricePerKg(){
        return getPrice()/ getWeight();
    }

    public double getbeforeDiscount(){
        return getBuy_total()* getpricePerKg();
    }

    public double getCalculateDiscount(){
        double totaldiscount = (int)(buy_total / multiple_discount)*(multiple_discount * price)* discount;
        return totaldiscount;
    }

    public double getAfterDiscount(){
        return getbeforeDiscount()- getCalculateDiscount();
    }

    public void display(){
        System.out.println("Nama Buah: " + getName());
        System.out.println("Berat: " + getWeight() );
        System.out.printf("Harga: %.1f%n", getPrice());
        System.out.printf("Jumlah Beli: %.1fkg%n", getBuy_total());

        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", getbeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f%n", getCalculateDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", getAfterDiscount());
        System.out.println();
    }
}
