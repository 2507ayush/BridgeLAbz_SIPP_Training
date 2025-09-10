public class Bus implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Bus is rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus is returned");
    }
}
