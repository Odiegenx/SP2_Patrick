public class DieselCar extends AFuelCar {
    private boolean particleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter, int totalKmDriven, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLiter, totalKmDriven);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLiter = super.getKmPrLiter();
        int registrationFee = 0;
        if(!hasParticleFilter()){
            registrationFee += 1000;
        }
        if (20 <= kmPrLiter && kmPrLiter < 50) {
            registrationFee += 330+ 130;
            return registrationFee;
        }
        if (15 <= kmPrLiter && kmPrLiter < 20) {
            registrationFee += 1050+1390;
            return registrationFee;
        }
        if (10 <= kmPrLiter && kmPrLiter < 15) {
            registrationFee += 2340+1850;
            return registrationFee;
        }
        if (5 <= kmPrLiter && kmPrLiter < 10) {
            registrationFee += 5500+2770;
            return registrationFee;
        }
        registrationFee += 10470+15260;
        return registrationFee;
    }
    public boolean hasParticleFilter(){
        return particleFilter;
    }
    @Override
    public String toString(){
        String msg = super.toString();
        msg += "\n"+"runs on "+getFuelType();
        if(hasParticleFilter()){
            msg += "\n"+"has a particle filter";
        }else{
            msg += "\n"+"No particle filter";
        }
        msg += "\n"+"registration fee: "+getRegistrationFee();
        msg += "\n"+"--------------------------------------------------------";
        return msg;
    }

}


