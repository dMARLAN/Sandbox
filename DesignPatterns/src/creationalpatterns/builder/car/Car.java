package creationalpatterns.builder.car;

public class Car {
    String name;
    String engine;
    String wheels;
    String body;

    private Car(final Builder builder) {
        this.name = builder.name;
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.body = builder.body;
    }

    public void print() {
        System.out.println("Car Built: " + name + "\n\tEngine: " + engine + "\n\tWheels: " + wheels + "\n\tBody_type: " + body + "\n");
    }

    public static final class Builder {
        private String name;
        private String engine;
        private String wheels;
        private String body;

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setEngine(final String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheels(final String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setBody(final String body) {
            this.body = body;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
