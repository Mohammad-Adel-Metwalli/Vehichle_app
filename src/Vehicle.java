public class Vehicle
{
    String vehicleName, vehicleFuelType;
    int vehicleSpeed;

    public Vehicle(String vehicleName, String vehicleFuelType, int vehicleSpeed)
    {
        this.vehicleName = vehicleName;
        this.vehicleFuelType = vehicleFuelType;
        this.vehicleSpeed = vehicleSpeed;
    }

    public void startEngine()
    {
        System.out.println("Vehicle engine started");
    }

    public void stopEngine()
    {
        System.out.println("Vehicle engine stopped");
    }
}