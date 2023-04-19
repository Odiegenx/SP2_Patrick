public class GasolinCar extends AFuelCar {

    GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter,int totalKmDriven) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLiter,totalKmDriven);
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }
    @Override
    public int getRegistrationFee() {
        int kmPrLiter = super.getKmPrLiter();
        if(20 < kmPrLiter && kmPrLiter < 50){
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
    @Override
    public String toString(){
        String msg = super.toString();
        msg += "\n"+"runs on "+getFuelType();
        msg += "\n"+"registration fee: "+getRegistrationFee();
        msg += "\n"+"--------------------------------------------------------";
        return msg;
    }
}
