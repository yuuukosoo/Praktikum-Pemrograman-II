package Praktikum.praktikum5.soal1;

public abstract class Shape{
    protected String shapeName;

    public Shape(String shapeName){
        this.shapeName=shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    protected abstract Double area();

    @Override
    public String toString() {
        return getShapeName();
    }
}