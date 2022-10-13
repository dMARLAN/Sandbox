package creationalpatterns.builder;

import creationalpatterns.builder.animal.Animal;
import creationalpatterns.builder.animal.AnimalBuilder;
import creationalpatterns.builder.car.Car;
import creationalpatterns.builder.car.CarDirector;

public class Sandbox {
    public static void main(String[] args) {

        // Cars have an inner class builder
        Car car = new Car.Builder()
                .setName("Ferrari")
                .setBody("Curvy")
                .setEngine("F154 V8")
                .setWheels("4")
                .build();
        car.print();

        Car car2 = new Car.Builder()
                .setName("Chevy")
                .setBody("Thicc")
                .setEngine("GM 5.7 Liter V8 Small Block LS1 Engine")
                .build();
        car2.print();

        // Using a director
        CarDirector carDirector = new CarDirector();
        Car.Builder builder = new Car.Builder();
        Car car3 = carDirector.constructSportsCar(builder);
        car3.print();

        // Animal uses a separate builder class
        Animal cat = new AnimalBuilder()
                .setName("Fluffy")
                .setColor("Black")
                .setType("Cat")
                .setWeight("5kg")
                .build();
        cat.print();

        Animal dog = new AnimalBuilder()
                .setName("Rex")
                .setColor("Brown")
                .setType("Doggo")
                .setWeight("30kg")
                .build();
        dog.print();
    }
}
