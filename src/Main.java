public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet1 = new FleetOfCars();
        Car c1 = new GasolinCar("32654", "BMW", "A3", 4,25,150);
        Car c2 = new DieselCar("3625314","Toyota","242B",2,15,56584,true);
        Car c3 = new ElectricCar("7246273","Tesla","S9",4,75,355);
        Car c4 = new DieselCar("233573","Toyota","242c",2,15,0,false);
        fleet1.addCar(c1);
        fleet1.addCar(c2);
        fleet1.addCar(c3);
        fleet1.addCar(c4);
        System.out.println(fleet1);
        System.out.println("Total registration fee for the entire fleet :"+fleet1.getTotalRegistrationFeeForFleet());
        
    }
}