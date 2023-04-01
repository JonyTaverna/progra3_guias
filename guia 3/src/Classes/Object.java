package Classes;

public abstract class Object {
    private String color;

    public Object() {
    }

    public Object(String color) {
        this.color = color;
    }

    public abstract Double getArea();
    public abstract Double getPerimeter();
}
