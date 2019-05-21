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
public class Ticket {
    
    private double price;
    private static int number;
    Passenger passenger;
    Flight flight;
    
   
    
   public Passenger getPassenger(){
       return passenger;
   }
  public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
  
   public Flight getFlight(){
       
   return flight;
   }
   public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
   public double getPrice(){
       return price;
   }
   public void setPrice(double price){
       this.price = price;
   }
   public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public Ticket( Passenger P,Flight flight, double price ) { 
        this.passenger = P;
        this.flight = flight;
        this.price = price;
       
    }  
    @Override
    public String toString(){
       return (passenger.getName() + ", Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() 
                + " to " + flight.getDestination() + ", " + flight.getDepartureTime()
                + ", original price: $" + flight.getOriginalPrice() + ", ticket price $"
                + this.price + "\n");
    }
}
