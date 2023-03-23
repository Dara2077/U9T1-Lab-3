public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi(){
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Number of passengres: " + getPassengers());
        System.out.println("Is electric: " + isElectric());
        System.out.println("Discount applied: " + isDiscountApplied());
        System.out.println("Fare collected: " + fareCollected);
    }
}
