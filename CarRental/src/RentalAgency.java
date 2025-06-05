import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars;

    public RentalAgency() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void showAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                car.displayDetails();
            }
        }
    }

    public void rentCar(String regNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(regNumber) && car.isAvailable()) {
                car.rentCar();
                System.out.println("Car rented successfully.");
                return;
            }
        }
        System.out.println("Car not available.");
    }

    public void returnCar(String regNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(regNumber) && !car.isAvailable()) {
                car.returnCar();
                System.out.println("Car returned successfully.");
                return;
            }
        }
        System.out.println("Car not found or already available.");
    }
}