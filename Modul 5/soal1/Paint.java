package Praktikum.praktikum5.soal1;

public class Paint {
    private Double coverage;

    public Paint(Double c){
        this.coverage=c;
    }

    public void setCoverage(Double coverage) {
        this.coverage = coverage;
    }

    public Double getCoverage() {
        return coverage;
    }

    public Double amount(Shape s){
    System.out.println("Computing amount for " + s);
    double paintAmount= s.area() / getCoverage();

    return paintAmount;
    }
}
