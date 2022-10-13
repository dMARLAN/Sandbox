package creationalpatterns.builder.animal;

public class AnimalBuilder {
    private final Animal animal = new Animal();
    private String name;
    private String weight;
    private String type;
    private String color;

    public AnimalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public AnimalBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public AnimalBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Animal build() {
        animal.setName(name);
        animal.setWeight(weight);
        animal.setType(type);
        animal.setColor(color);
        return animal;
    }
}
