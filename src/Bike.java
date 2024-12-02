public class Bike extends Vehicle implements Electric
{
    boolean hasGear;
    String handleType;

    public Bike(String vehicleName, String vehicleFuelType, int vehicleSpeed, boolean hasGear, String handleType)
    {
        super(vehicleName, vehicleFuelType, vehicleSpeed);
        this.handleType = handleType;
        this.hasGear = hasGear;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Bike engine started");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Bike engine stopped");
    }

    @Override
    public void chargeBattery()
    {
        System.out.println("Charging...");
    }

    @Override
    public void checkBatteryLevel()
    {
        System.out.println("Your current battery level is 90%");
    }

    public void bikeInfo()
    {
        System.out.println("Bike is " + vehicleName + "\nBike fuel type is " + vehicleFuelType + "\nBike speed is " + vehicleSpeed + " Km/h\nThe gear is " + (hasGear ? "Available" : "Not Available") + "\nHandle type is " + handleType);
    }
}