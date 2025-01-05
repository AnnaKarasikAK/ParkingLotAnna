import java.util.ArrayList;
import java.util.HashMap;

public class Moto extends ParkingLot{


    public Moto(String licencePlate, String vehicleColor) {
        super(Consts.vehicleTypeMoto, licencePlate, vehicleColor);
    }

    public HashMap<Integer, ArrayList<Integer>> creation(){
        return super.parkingLot();
    }

    @Override
    public boolean canThisVehicleParkHere(HashMap<Integer, ArrayList<Integer>> spots) {
        return super.canThisVehicleParkHere(spots);
    }

    public void printParkingSpots(HashMap<Integer, ArrayList<Integer>> parkingLot) {
        super.printParkingSpots(parkingLot);
    }
}
