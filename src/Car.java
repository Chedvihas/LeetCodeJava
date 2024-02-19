public class Car {
    // Fields or instance variables
    private String make;
    private String model;
    private int year;

    // Constructor without parameters (default constructor)
    public Car() {
        // Default values for fields
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with parameters
    public Car(String make, String model, int year) {
        // Initializing fields with values passed as parameters
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an instance of Car using the default constructor
        Car defaultCar = new Car();
        System.out.println("Default Car:");
        defaultCar.displayInfo();
        System.out.println();

        // Creating an instance of Car using the parameterized constructor
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println("My Car:");
        myCar.displayInfo();
    }
}
