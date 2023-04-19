public abstract class AFuelCar extends ACar {

    private int kmPrLiter;
    private int totalKmDriven;

    AFuelCar(String registrationNumber, String make, String model, int numberOfDoors,int kmPrLiter,int totalKmDriven) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLiter = kmPrLiter;
        this.totalKmDriven = totalKmDriven;
    }

    abstract String getFuelType();

    public int getKmPrLiter(){
        return kmPrLiter;
    }
    @Override
    public String toString(){
        String msg = super.toString();
        msg += "\n"+"Car has driven: " + totalKmDriven+"\n"+"fuel economy of: "+kmPrLiter+"km/l";
        return msg;
    }
}
