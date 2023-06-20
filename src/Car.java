import java.util.Objects;

public class Car {
    private String wheels;
    private String body;
    private String colour;
    private String interior;

    public Car(Builder builder) {
        this.wheels = builder.wheels;
        this.body = builder.body;
        this.colour = builder.colour;
        this.interior = builder.interior;
    }

    public static class Builder {
        private String wheels;
        private String body;
        private String colour;
        private String interior;

        public Builder(String wheels, String body, String colour, String interior) {
            this.wheels = wheels;
            this.body = body;
            this.colour = colour;
            this.interior = interior;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getWheels() {
        return wheels;
    }

    public String getBody() {
        return body;
    }

    public String getColour() {
        return colour;
    }

    public String getInterior() {
        return interior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(wheels, car.wheels) && Objects.equals(body, car.body) && Objects.equals(colour, car.colour) && Objects.equals(interior, car.interior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, body, colour, interior);
    }
}
