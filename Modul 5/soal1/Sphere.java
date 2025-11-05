package Praktikum.praktikum5.soal1;

public class Sphere extends Shape{
    private Double radius;

    public Sphere(String shapeName, Double r){
        super("Sphere");
        this.radius=r;
    }

    public void setRadius(Double radius){
        this.radius=radius;
    }

    public Double getRadius(){

        return radius;
    }

    @Override
    protected Double area() {
        return 4 * Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + getRadius();
    }
}
