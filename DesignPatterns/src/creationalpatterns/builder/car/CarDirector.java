package creationalpatterns.builder.car;

public class CarDirector {

    public Car constructSportsCar(Car.Builder builder) {
        builder.setName("Corvette");
        builder.setBody("Curvy");
        builder.setEngine("6.2 L LT2 crossplane OHV V8 (Stingray) 5.5 L LT6 flat-plane DOHC V8 (Z06)");
        builder.setWheels("4");
        return builder.build();
    }

}
