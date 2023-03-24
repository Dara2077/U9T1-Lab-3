public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }


    //getters

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        } else {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if (!discountApplied && electric) {
            setTollFee(getTollFee() * .5);
            discountApplied = true;
        }
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public double calculateTollPrice(){
        if (getPassengers() > 4){
            return getTollFee() * 4;
        }
        else{
            return super.calculateTollPrice();
        }
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Electric: " + electric);
        System.out.println("Discount applied: " + discountApplied);
    }
}