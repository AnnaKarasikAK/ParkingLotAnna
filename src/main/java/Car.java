import java.util.ArrayList;
import java.util.HashMap;

public class Car extends ParkingLot {
    public Car(String licencePlate, String vehicleColor) {
        super(Consts.vehicleTypeCar, licencePlate, vehicleColor);
    }

    public HashMap<Integer, ArrayList<Integer>> creation() {
        return super.parkingLot();
    }

    @Override
    public boolean canThisVehicleParkHere(HashMap<Integer, ArrayList<Integer>> spots) {
        boolean isThereFreeSpot = false; //the spot is unavailable for this type of vehicle
        for (int i = 1; i <= spots.size(); i++) {
            if (spots.get(i).get(Consts.isOccupiedInArray) == Consts.notOccupied && (spots.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeCompact || spots.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeLarge)) {
                return true;
            }
        }
        return isThereFreeSpot;
    }



    @Override

    public void parkingAvailableFor() {
        super.parkingAvailableFor();
    }
    public HashMap<Integer, ArrayList<Integer>> vehicleParking(HashMap<Integer, ArrayList<Integer>> parking){
            for (int i = 1; i <= parking.size(); i++) {
                if (parking.get(i).get(Consts.isOccupiedInArray) == Consts.notOccupied && (parking.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeCompact || parking.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeLarge)) {
                    parking.get(i).set(Consts.isOccupiedInArray, Consts.occupied);
                    break;
                }
        }return parking;
    }

    public HashMap<Integer, ArrayList<Integer>> leaveParking(HashMap<Integer, ArrayList<Integer>> parking){
        for (int i = 1; i <= parking.size(); i++) {
            if (parking.get(i).get(Consts.isOccupiedInArray) == Consts.occupied && (parking.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeCompact || parking.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeLarge)) {
                parking.get(i).set(Consts.isOccupiedInArray, Consts.notOccupied);
                break;
            }
        }return parking;
    }

}
