/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528.lab1;

/**
 *
 * @author Navjot
 */
public class Flight {
    private int flightNumber;
    private int capacity;
    private int numberOfSeatsLeft;
    private String destination;
    private String origin;
    private String departureTime;
    private double originalPrice;

    Flight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Flight(int flightNumber, int capacity, String origin, String destination, String departureTime, double originalPrice) {
        if(destination.equalsIgnoreCase(origin)){
            throw new IllegalArgumentException("Destination cannot be the same location as Origin");
        }
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.originalPrice = originalPrice;
        numberOfSeatsLeft = capacity;
    }

    public boolean bookASeat(int capacity){
        if(numberOfSeatsLeft>0){
        numberOfSeatsLeft--;  
        return(true);}
        else{
                return false;
                }
                 
    }

    @Override
    public String toString(){
        return("Flight "+getFlightNumber()+", "+getOrigin()+" to "+getDestination()+", "
                +getDepartureTime()+", original price: $"+getOriginalPrice());
    }
}
