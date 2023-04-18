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
        if (20 < kmPrLiter && kmPrLiter < 50) {
            if(!hasParticleFilter()){
                registrationFee += 1000;
            }
            registrationFee += 130;
            return registrationFee;
        }
        if (15 < kmPrLiter && kmPrLiter < 20) {
            if(!hasParticleFilter()){
                registrationFee += 1000;
            }
            registrationFee += 1390;
            return registrationFee;
        }
        if (10 < kmPrLiter && kmPrLiter < 15) {
            if(!hasParticleFilter()){
                registrationFee += 1000;
            }
            registrationFee += 1850;
            return registrationFee;
        }
        if (5 < kmPrLiter && kmPrLiter < 10) {
            if(!hasParticleFilter()){
                registrationFee += 1000;
            }
            registrationFee += 2770;
            return registrationFee;
        }
        if(!hasParticleFilter()){
            registrationFee += 1000;
        }
        registrationFee += 15260;
        return registrationFee;
    }
    public boolean hasParticleFilter(){
        return particleFilter;
    }
    @Override
    public String toString(){
        String msg = super.toString();
        msg += "/n and runs on "+getFuelType();
        return msg;
    }

}


