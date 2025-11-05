package Praktikum.praktikum5.soal1;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(String shapeName, Double length, Double width){
        super("Rectangle");
        this.shapeName=shapeName;
        this.length=length;
        this.width=width;
    }

    public void setLength(Double length){
        this.length=length;
    }

    public void setWidth(Double width){
        this.width=width;
    }

    public Double getlength(){
        return length;
    }

    public Double getwidth(){
        return width;
    }

    @Override
    public Double area(){
        return getlength() * getwidth();
    }

    @Override
    public String toString(){
        return super.toString() + " of Length " + getlength() + " Width " + getwidth();
    }

}
