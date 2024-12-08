public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);

        Vehicle truck1 = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck2", 8);

        Vehicle bicycle1 = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();

        Vehicle[] vehicles = {car1, car2, truck1, truck2, bicycle1, bicycle2};
        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }
}