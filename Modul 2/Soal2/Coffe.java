package praktikum2.Soal2;

public class Coffe {
   private String customer;
   public String coffename,size;
   public int price;
   private final double tax = 0.11;

    public void setCustomer(String customer) {

        this.customer = customer;
    }

    public String getCustomer() {

        return customer;
    }


    public String getCoffename() {

        return coffename;
    }


    public String getSize() {

        return size;
    }


    public double getPrice() {

        return price;
    }

    public double getTax() {

        return this.price * tax;
    }

    public void info(){
        System.out.println("Nama Kopi: " + getCoffename());
        System.out.println(("Ukuran: " + getSize()));
        System.out.println("Harga: Rp. " + getPrice());
    }
}