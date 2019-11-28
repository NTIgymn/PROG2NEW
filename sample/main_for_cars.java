package sample;

public class main_for_cars {
    public static void main(String[] args) {
        Car[]cars = { new Volvo("Niklas"), new Audi("Are"), new Mazda("Musa") };

        for (Car car : cars) {
            car.getOwner();
            car.color();
            car.engine();
            car.name();
            System.out.println(car);
            System.out.println("......................");
            System.out.println("");

        }

    }
}
