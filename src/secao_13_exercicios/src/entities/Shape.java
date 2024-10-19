package entities;

public abstract class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
}

//Exemplo de uma classe e métodos abstratos, esse exemplo contempla um dos alicerces da POO, no caso, a abstração.


