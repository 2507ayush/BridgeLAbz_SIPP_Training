public class Car implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Car is rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car is returned");
    }
}
