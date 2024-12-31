import java.util.Objects;

public class Motorcycle extends Vehicle implements Rentable{
    private Customer currentCustomer;
    private final boolean includeHelmet;
    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean includeHelmet) {
        super(vehicleId, model, baseRentalRate=150, isAvailable);
        this.includeHelmet = includeHelmet;

    }
    @Override
    public double calculateRentalCost(int days) {

        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "vehicleId='" + getVehicleId() + '\'' + ", model='" + getModel() + '\'' +
                ", baseRentalRate=" + getBaseRentalRate() + ", hasGPS=" + includeHelmet + '}';
    }

    public void enableCruiseControl() {
        System.out.println("Cruise control activated for a smoother ride!");
    }


    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailable()) {
            System.out.println("The motorcycle is not available. Car can't rent!");
        }
        this.currentCustomer = customer;
        setAvailable(false);
        System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");

    }

    @Override
    public void returnVehicle() {
        this.currentCustomer = null;
        setAvailable(true);
        System.out.println("Motorcycle returned. Thanks for doing business with us, we wish to see you another time");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle motorcycle = (Motorcycle) o;
        return includeHelmet == motorcycle.includeHelmet && Objects.equals(currentCustomer, motorcycle.currentCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currentCustomer, includeHelmet);
    }
}

