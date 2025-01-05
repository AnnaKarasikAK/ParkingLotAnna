import java.util.ArrayList;
import java.util.HashMap;

public class Bus extends ParkingLot {

    public Bus(String licencePlate, String vehicleColor) {
        super(Consts.vehicleTypeBus, licencePlate, vehicleColor);
    }

    public HashMap<Integer, ArrayList<Integer>> creation(){
        return super.parkingLot();
    }

    @Override
    public boolean canThisVehicleParkHere(HashMap<Integer, ArrayList<Integer>> spots) {
        boolean isThereFreeSpot = false; //the spot is unavailable for this type of vehicle
        for (int i = 1; i <= spots.size() - 3; i++) {
            if (spots.get(i).get(Consts.isOccupiedInArray) == Consts.notOccupied && spots.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeLarge) {
                for (int j = i + 1; j <= i + 4 && j<= spots.size(); j++) {
                    if (spots.get(j).get(Consts.isOccupiedInArray) == Consts.notOccupied && spots.get(j).get(Consts.spotTypeInArray) == Consts.spotTypeLarge && spots.get(j).get(Consts.floorNumberInArray) == spots.get(i).get(Consts.floorNumberInArray) && spots.get(j).get(Consts.rowNumberInArray) == spots.get(i).get(Consts.rowNumberInArray)) {
                        if (j == i + 4) {
                            return true;
                        }
                    } else break;
                }
            }
        } return isThereFreeSpot;
    }

    public HashMap<Integer, ArrayList<Integer>> vehicleParking(HashMap<Integer, ArrayList<Integer>> parking){
        for (int i = 1; i <= parking.size() - 3; i++) {
            if (parking.get(i).get(Consts.isOccupiedInArray) == Consts.notOccupied && parking.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeLarge) {
                for (int j = i + 1; j <= i + 4 && j<= parking.size(); j++) {
                    if (parking.get(j).get(Consts.isOccupiedInArray) == Consts.notOccupied && parking.get(j).get(Consts.spotTypeInArray) == Consts.spotTypeLarge && parking.get(j).get(Consts.floorNumberInArray) == parking.get(i).get(Consts.floorNumberInArray) && parking.get(j).get(Consts.rowNumberInArray) == parking.get(i).get(Consts.rowNumberInArray)) {

                        if (j == i + 4) { //counts if there are 5 spots that have all the requested criteria
                            for (int k= i ; k <= i+4 ; k++){ //turns these 5 spots to occupied
                                parking.get(k).set(Consts.isOccupiedInArray, Consts.occupied);
                            }
                            break;
                        }
                    } else break;
                }
            }
        }return parking;
    }

    public HashMap<Integer, ArrayList<Integer>> leaveParking(HashMap<Integer, ArrayList<Integer>> parking){
        for (int i = 1; i <= parking.size() - 3; i++) {
            if (parking.get(i).get(Consts.isOccupiedInArray) == Consts.occupied && parking.get(i).get(Consts.spotTypeInArray) == Consts.spotTypeLarge) {
                for (int j = i + 1; j <= i + 4 && j<= parking.size(); j++) {
                    if (parking.get(j).get(Consts.isOccupiedInArray) == Consts.occupied && parking.get(j).get(Consts.spotTypeInArray) == Consts.spotTypeLarge && parking.get(j).get(Consts.floorNumberInArray) == parking.get(i).get(Consts.floorNumberInArray) && parking.get(j).get(Consts.rowNumberInArray) == parking.get(i).get(Consts.rowNumberInArray)) {

                        if (j == i + 4) { //counts if there are 5 spots that have all the requested criteria
                            for (int k= i ; k <= i+4 ; k++){ //turns these 5 spots to occupied
                                parking.get(k).set(Consts.isOccupiedInArray, Consts.notOccupied);
                            }
                            break;
                        }
                    } else break;
                }
            }
        }return parking;
    }


    @Override

    public void parkingAvailableFor(){
        super.parkingAvailableFor();
    }
}

