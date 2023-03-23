public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    //printTruck() print
    //    Truck's license plate, toll fee, number of passengers, number of axles,
    //    and whether it has a trailer.
    //    Add getter methods as necessary to the Vehicle superclass.

    public void printTruck(){
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " +getPassengers());
        System.out.println("Number of axles: " +axles);
        System.out.println("Has trailer: " +hasTrailer);
    }

    public boolean validateLicensePlate(){
        if (hasTrailer){
            if (axles > 4){
                String lp = getLicensePlate();
                if (lp.substring(lp.length() -2, lp.length()).equals("MX")){
                    return true;
                }
                return false;
            }
            else{
                String lp = getLicensePlate();
                if (lp.substring(lp.length() -2, lp.length()).equals("LX")){
                    return true;
                }
                return false;
            }
        }
        else{
            return true;
        }
    }
}
