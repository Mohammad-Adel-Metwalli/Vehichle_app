public class Main
{
    public static void main(String[] args)
    {
        Car formula1 = new Car("Formula-1", "92", 220, 2, false);
        formula1.startEngine();
        formula1.carInfo();
        formula1.chargeBattery();
        formula1.checkBatteryLevel();
        formula1.stopEngine();

        System.out.println();

        Bike bmx = new Bike("BMX", "Nitrogen", 70, true, "Flat");
        bmx.startEngine();
        bmx.bikeInfo();
        bmx.chargeBattery();
        bmx.checkBatteryLevel();
        bmx.stopEngine();
    }
}