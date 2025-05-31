public class Car {
    // Private instance variables
    private final String make;          // Can only be set once
    private final String model;         // Can only be set once
    private double rentalPricePerDay;
    private boolean isAvailable;

    // Constructor
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.setRentalPricePerDay(rentalPricePerDay);
        this.isAvailable = true; // Car is available when added
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for rental price
    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            this.rentalPricePerDay = price;
        } else {
            System.out.println("Rental price must be non-negative.");
        }
    }

    // Rent the car
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car has been rented.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    // Return the car
    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Car has been returned.");
        } else {
            System.out.println("Car was not rented.");
        }
    }
}
