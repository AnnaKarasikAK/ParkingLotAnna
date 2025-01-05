public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("ABC 123", "Black");
        Moto moto1 = new Moto("Nif-Nif", "Silver");
        Moto moto2 = new Moto("Naf-Naf", "Gold");
        Car car1 = new Car("Mario", "Rainbow");


        moto1.printParkingSpots(moto1.parkingLot());
        bus1.parkingAvailableFor();
        bus1.vehicle();
        System.out.println(bus1.canThisVehicleParkHere(bus1.parkingLot()));
        moto1.vehicle();
        System.out.println(moto1.canThisVehicleParkHere(moto1.parkingLot()));
        car1.vehicle();
        System.out.println(car1.canThisVehicleParkHere(car1.parkingLot()));
        System.out.println("*** Moto parked:");
        moto1.printParkingSpots(moto1.vehicleParking(moto1.parkingLot()));
        System.out.println("*** Moto left");
        moto1.printParkingSpots(moto1.leaveParking(moto1.vehicleParking(moto1.parkingLot())));
        System.out.println("*** Car parked:");
        car1.printParkingSpots(car1.vehicleParking(car1.parkingLot()));
        System.out.println("*** Car left:");
        car1.printParkingSpots(car1.leaveParking(car1.vehicleParking(car1.parkingLot())));
        System.out.println("*** Bus parked:");
        bus1.printParkingSpots(bus1.vehicleParking(bus1.parkingLot()));
        System.out.println("*** Bus left:");
        bus1.printParkingSpots(bus1.leaveParking(bus1.vehicleParking(bus1.parkingLot())));

    }
}
