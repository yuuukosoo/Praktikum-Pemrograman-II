package Praktikum.praktikum5.soal1;

public class Cylinder extends Shape{
    private Double radius;
    private Double height;

    public Cylinder(String shapeName, Double radius, Double height){
        super("Cylinder");
        this.radius=radius;
        this.height=height;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getRadius() {
        return radius;
    }

    public Double getHeight(){
        return height;
    }

    @Override
    public Double area(){
        return Math.PI * (getRadius()*getRadius()) * getHeight();
    }

    @Override
    public String toString(){
        return super.toString() + " of radius " + getRadius() + " and height " + getHeight();
    }
}
