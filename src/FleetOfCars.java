import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();

    FleetOfCars(){

    }

    public void addCar(Car car){
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet(){
        int totalFee = 0;
        for(Car c: fleet){
            totalFee += c.getRegistrationFee();
            //System.out.println(totalFee);
        }
        return totalFee;
    }
    @Override
    public String toString(){
        System.out.println("-------Welcome to Patrick's Fleet of random cars--------");
        String msg ="--------------------------------------------------------";
        for(Car c: fleet){
           msg += c.toString();
       }
       return msg;
    }
}
