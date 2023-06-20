public class Main {
    public static void main(String[] args) {
        Car sportCar = new Car.Builder("Sport wheels", "Sport body", "blue", "Sport interior").build();
        Car classicCar = new Car.Builder("Classic wheels", "Classic body", "white", "Classic interior").build();
        System.out.println(classicCar.equals(sportCar));
    }
}