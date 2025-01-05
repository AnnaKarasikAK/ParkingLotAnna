import javax.swing.plaf.synth.SynthPopupMenuUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ParkingLot {

    protected String vehicleType;
    protected String licencePlate;
    protected String vehicleColor;

    public ParkingLot(String vehicleType, String licencePlate, String vehicleColor){
        this.vehicleType = vehicleType;
        this.licencePlate = licencePlate;
        this.vehicleColor = vehicleColor;
    }

    public HashMap<Integer, ArrayList<Integer>> parkingLot() {
        HashMap<Integer, ArrayList<Integer>> spots = new HashMap<Integer, ArrayList<Integer>>();

        spots.put(1, new ArrayList<Integer>());
        spots.get(1).add(Consts.floor1);
        spots.get(1).add(Consts.row1);
        spots.get(1).add(Consts.spotTypeMoto);
        spots.get(1).add(Consts.notOccupied);
        spots.put(2, new ArrayList<Integer>());
        spots.get(2).add(Consts.floor1);
        spots.get(2).add(Consts.row1);
        spots.get(2).add(Consts.spotTypeCompact);
        spots.get(2).add(Consts.notOccupied);
        spots.put(3, new ArrayList<Integer>());
        spots.get(3).add(Consts.floor1);
        spots.get(3).add(Consts.row2);
        spots.get(3).add(Consts.spotTypeLarge);
        spots.get(3).add(Consts.notOccupied);
        spots.put(4, new ArrayList<Integer>());
        spots.get(4).add(Consts.floor1);
        spots.get(4).add(Consts.row2);
        spots.get(4).add(Consts.spotTypeLarge);
        spots.get(4).add(Consts.notOccupied);
        spots.put(5, new ArrayList<Integer>());
        spots.get(5).add(Consts.floor1);
        spots.get(5).add(Consts.row2);
        spots.get(5).add(Consts.spotTypeLarge);
        spots.get(5).add(Consts.notOccupied);
        spots.put(6, new ArrayList<Integer>());
        spots.get(6).add(Consts.floor1);
        spots.get(6).add(Consts.row2);
        spots.get(6).add(Consts.spotTypeLarge);
        spots.get(6).add(Consts.notOccupied);
        spots.put(7, new ArrayList<Integer>());
        spots.get(7).add(Consts.floor1);
        spots.get(7).add(Consts.row2);
        spots.get(7).add(Consts.spotTypeLarge);
        spots.get(7).add(Consts.notOccupied);
        spots.put(8, new ArrayList<Integer>());
        spots.get(8).add(Consts.floor1);
        spots.get(8).add(Consts.row2);
        spots.get(8).add(Consts.spotTypeLarge);
        spots.get(8).add(Consts.notOccupied);
        spots.put(9, new ArrayList<Integer>());
        spots.get(9).add(Consts.floor1);
        spots.get(9).add(Consts.row2);
        spots.get(9).add(Consts.spotTypeLarge);
        spots.get(9).add(Consts.notOccupied);
        spots.put(10, new ArrayList<Integer>());
        spots.get(10).add(Consts.floor1);
        spots.get(10).add(Consts.row2);
        spots.get(10).add(Consts.spotTypeLarge);
        spots.get(10).add(Consts.occupied);

//        In the beginning I wanted to see the created parking spots, so this is for printing it, but it messes up the final output, so I removed it:
//        for (Map.Entry entry : spots.entrySet()) {
//            System.out.println(entry);
//        }
        return spots;
    }
    public void printParkingSpots(HashMap<Integer, ArrayList<Integer>> parkingLot){
                for (Map.Entry entry : parkingLot.entrySet()) {
            System.out.println(entry);
        }
    }


    //the following method can return boolean, but then


    public boolean canThisVehicleParkHere(HashMap<Integer, ArrayList<Integer>> spots) {
        boolean isThereFreeSpot = false; //the spot is unavailable for this type of vehicle
        for (int i = 1; i <= spots.size(); i++) {
            if (spots.get(i).get(Consts.isOccupiedInArray) == Consts.notOccupied) {
                            return true;
                    }
        } return isThereFreeSpot;
    }

    public void vehicle(){
        System.out.printf("%s, licence plate: %s, color: %s - ", vehicleType, licencePlate, vehicleColor );
    }

    public void parkingAvailableFor(){
        System.out.println("Parking available for:");
    }


    public HashMap<Integer, ArrayList<Integer>> vehicleParking(HashMap<Integer, ArrayList<Integer>> parking){
        for (int i = 1; i <= parking.size(); i++) {
            if (parking.get(i).get(Consts.isOccupiedInArray) == Consts.notOccupied) {
                parking.get(i).set(Consts.isOccupiedInArray, Consts.occupied);
                break;
            }
        }return parking;
    }

    public HashMap<Integer, ArrayList<Integer>> leaveParking(HashMap<Integer, ArrayList<Integer>> parking){
        for (int i = 1; i <= parking.size(); i++) {
            if (parking.get(i).get(Consts.isOccupiedInArray) == Consts.occupied) {
                parking.get(i).set(Consts.isOccupiedInArray, Consts.notOccupied);
                break;
            }
        }return parking;
    }



//    public String getVehicleType() {
//        return vehicleType;
//    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public String getVehicleColor() {
        return vehicleColor;
    }
}






