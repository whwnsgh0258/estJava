package Day0617.vehicle;

public class Driver {
    public String Drive(Vehicle vehicle){
        return vehicle.run();
    }
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle taxi = new Taxi();
        System.out.println(driver.Drive(taxi));
        Vehicle bus = new Bus();
        System.out.println(driver.Drive(bus));
    }
}
