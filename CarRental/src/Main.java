import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RentalAgency agency = new RentalAgency();

        // Add some cars
        agency.addCar(new Car("KDA123A", "Toyota Vitz"));
        agency.addCar(new Car("KDB456B", "Mazda Demio"));
        agency.addCar(new Car("KDC789C", "Subaru Impreza"));

        // Customer input
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your ID:");
        String id = input.nextLine();
        Customer customer = new Customer(name, id);

        // Display menu
        while (true) {
            System.out.println("\n1. View Available Cars\n2. Rent a Car\n3. Return a Car\n4. Exit");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    agency.showAvailableCars();
                    break;
                case 2:
                    System.out.println("Enter car registration number to rent:");
                    String regRent = input.nextLine();
                    agency.rentCar(regRent);
                    break;
                case 3:
                    System.out.println("Enter car registration number to return:");
                    String regReturn = input.nextLine();
                    agency.returnCar(regReturn);
                    break;
                case 4:
                    System.out.println("Thank you for using the Car Rental System.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}