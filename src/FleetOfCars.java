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
        }
        return totalFee;
    }
    @Override
    public String toString(){
       String msg ="";
        for(Car c: fleet){
           msg += c.toString();
       }
       return msg;
    }
}
