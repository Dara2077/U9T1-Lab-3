public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    //getter methods

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setTollFee(double tollFee) {
        this.tollFee = tollFee;
    }

    public void printInfo(){
        System.out.println("Licence plate: " + licensePlate);
        System.out.println("Toll fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }

    public void printDestinationStatement(){
        System.out.println("We are on our way to our destination!");
    }

}
