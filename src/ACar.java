public abstract class ACar implements Car{
    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

        ACar(String registrationNumber,String make,String model,int numberOfDoors){
            this.registrationNumber = registrationNumber;
            this.make = make;
            this.model = model;
            this.numberOfDoors = numberOfDoors;
        }

    public String getRegistrationNumber(){
            return registrationNumber;
    }
    public String getMake(){
            return make;
    }
    public String getModel(){
            return model;
    }
    public int getNumberOfDoors(){
            return numberOfDoors;
    }
    @Override
    public String toString(){
            String msg = "";
            msg += "Car registration number: " +getRegistrationNumber()+"/n Car model: "+getModel();
            return msg;
    }
}
