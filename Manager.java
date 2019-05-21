/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528.lab1;
import java.util.*;


/**
 *
 * @author Navjot
 */

public class Manager  {
    
    private ArrayList<Flight> flightList = new ArrayList();
    private ArrayList<Passenger> passengerList = new ArrayList();
    private ArrayList<Ticket> ticketList = new ArrayList();
    
    public Manager(){
     ArrayList<Flight> flightList = new ArrayList();
     ArrayList<Passenger> passengerList = new ArrayList();
     ArrayList<Ticket> ticketList = new ArrayList();
    }
    public void createFlights(int flightNumber, int capacity, String origin, String destination, String departureTime, 
            int originalPrice ){
        
        Flight flight = new Flight(flightNumber, capacity, origin, destination, departureTime, originalPrice);
        flightList.add(flight);
    }
    
     public Flight getFlight(int flightNumber){  
         for(int i =0; i<flightList.size(); i++){
             if(flightNumber == flightList.get(i).getFlightNumber()){
                 return flightList.get(i);
             }
         }
         return null;
     }
     public void displayAvailableFlights(){
       System.out.println("Available Flights:");  
        for(int i = 0; i<flightList.size(); i++){
            if(flightList.get(i).getNumberOfSeatsLeft()!= 0){
                System.out.println(flightList.get(i).getOrigin()+" to "+flightList.get(i).getDestination());
            }
            else{
                System.out.println("No Flights");
            }
        }
     }
    public void bookSeat(int flightNumber, Passenger p){
        Flight flight = getFlight(flightNumber);
        if(flight == null){
            throw new IllegalArgumentException("Flight doesn't exist");
        }
        if(flight.bookASeat(flightNumber)){
            flight.setNumberOfSeatsLeft(flightNumber);
            ticketList.add(new Ticket(p, flight, p.applyDiscount(flight.getOriginalPrice())));
           
        }
        else{
            throw new IllegalArgumentException("Flight full");
        }
    }
    public static void main(String[] args ){
        
        Manager m1 = new Manager();
        
        m1.createFlights(102, 7, "Toronto", "Vancouver", "10/02/18 3:30pm", 200);
        m1.createFlights(103, 3, "Vancouver", "Toronto", "10/03/18 2:40pm", 150);
        
        m1.passengerList.add(new Member("Bob Builder", 33, 4));
        m1.passengerList.add(new Member("Dora Rodrigez", 22, 1));
        m1.passengerList.add(new Member("Tele Tubbs", 33, 7));
        m1.passengerList.add(new Member("John Cena", 32, 2));
        m1.passengerList.add(new Member("Barney Smith", 69, 5));
        
        //First Flight Bookings
        m1.bookSeat(m1.flightList.get(0).getFlightNumber(), m1.passengerList.get(0));
        m1.bookSeat(102, m1.passengerList.get(1));
        m1.bookSeat(102, m1.passengerList.get(3));
        
        //Second Flight Bookings
        m1.bookSeat(m1.flightList.get(1).getFlightNumber(), m1.passengerList.get(2));
        m1.bookSeat(103, m1.passengerList.get(4));
        
        m1.displayAvailableFlights();
         
    }
}