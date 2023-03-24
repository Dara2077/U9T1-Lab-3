public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }


    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (getPassengers() >= 4 && !isDiscountApplied()){
            setTollFee(getTollFee() * .5);
            setDiscountApplied(true);
        }
    }

    public double getFareCollected(){
        return fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        fareCollected += farePerRider * (getPassengers() - 1);
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);
    }

    @Override
    public void printDestinationStatement(){
        super.printDestinationStatement();
        System.out.println("We aren't picking up any more passengers along the way");
    }

}
