package creationalpatterns.builder.animal;

public class Animal {
    private String name;
    private String weight;
    private String type;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println(name + ": { Type: " + type + ", Colour: " + color + ", Weight: " + weight + " }");
    }
}
