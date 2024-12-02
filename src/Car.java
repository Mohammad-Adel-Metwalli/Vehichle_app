public class Car extends Vehicle implements Electric
{
    int numberOfDoors;
    boolean hasAirConditioning;

    public Car(String vehicleName, String vehicleFuelType, int vehicleSpeed, int numberOfDoors, boolean hasAirConditioning)
    {
        super(vehicleName, vehicleFuelType, vehicleSpeed);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Car engine stopped");
    }

    @Override
    public void chargeBattery()
    {
        System.out.println("Charging...");
    }

    @Override
    public void checkBatteryLevel()
    {
        System.out.println("Your current battery level is 84%");
    }

    public void carInfo()
    {
        System.out.println("Car is " + vehicleName + "\nCar fuel type is " + vehicleFuelType + "\nCar speed is " + vehicleSpeed + " Km/h\nNumber of doors is " + numberOfDoors + " doors\nAir Conditioning is " + (hasAirConditioning ? "Available" : "Not Available"));
    }
}