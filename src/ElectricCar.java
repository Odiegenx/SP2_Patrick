public class ElectricCar extends ACar{
    private int batteryCapacity; //in kWh
    private int maxRange;

    ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,int batteryCapacity,int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
    public int getBatteryCapacityKWh(){
        //int energyDensityOfGasoline = 34;
        return batteryCapacity;
    }
    public int getMaxRangeKm(){
        return maxRange;
    }
    public int getWhPrKm(){
        return batteryCapacity*1000/maxRange;
    }
    @Override
    public int getRegistrationFee() {
        int kmPrLiter = (int) (100/(getWhPrKm()/91.25));
        if(20 < kmPrLiter){
            return 330;
        }
        if(15 < kmPrLiter && kmPrLiter < 20){
            return 1050;
        }
        if(10 < kmPrLiter && kmPrLiter < 15){
            return 2340;
        }
        if(5 < kmPrLiter && kmPrLiter < 10){
            return 5500;
        }
            return 10470;
    }
    /* For en Elbil gælder de samme regler som for en benzinbil,
    blot skal man først omregne watt-timer pr kilometer til km/l.
    Det gøres ved at dividere Wh/km med 91,25 og dernæst dividere 100 med dette tal.
     Se evt. formlen her:
     https://fdm.dk/alt-om-biler/dine-rettigheder/boder-afgifter/ejerafgift-elbil.*/
    @Override
    public String toString(){
        String msg = super.toString();
        msg += "\n"+"runs on electricity and has a max range of: "+maxRange+" km";
        msg += "\n"+"registration fee: "+getRegistrationFee();
        msg += "\n"+"--------------------------------------------------------";
        return msg;
    }
}
