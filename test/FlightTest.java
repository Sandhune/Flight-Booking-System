/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Navjot
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void testConstructor(){
           boolean got = true;
         try{
             Flight in2 = new Flight(302,44,"Toronto","Vancouver"," 03/02/2018 2:30 pm",44);
         }
         catch(IllegalArgumentException ex){
                  
         }
         if(got==false){
             System.out.println("Arguments invalid");
         }
     }
     @Test
     public void InvalidTestConstructor(){
         boolean got = false;
         try{
             Flight in2 = new Flight(-302,44,"h","h","h",44);
         }
         catch(IllegalArgumentException ex){
             got = true;
              System.out.println("Arguments invalid");
         }
     }
     @Test
     public void mainTest(){
         System.out.println("Main");
          Flight in1 = null ;
          int a1 = 302;
          int e1 = in1.getFlightNumber();
          int a2 = 44;
          int e2 = in1.getCapacity();
          String a3 = "Toronto";
          String e3 = in1.getOrigin();
          String a4 = "Vancouver";
          String e4 = in1.getDestination();
          String a5 = "2:30";
          String e5 = in1.getDepartureTime();
          double a6 = 440.0;
          double e6 = in1.getOriginalPrice();
          assertEquals(e1, a1);
          assertEquals(e2, a2);
          assertEquals(e3, a3);
          assertEquals(e4, a4);
          assertEquals(e5, a5);
          assertEquals(e6, a6, 0.001);
}
     @Test
     public void setTest(){
         System.out.println("Main");
          Flight in1 = new Flight(302,44,"Toronto","Vancouver","2:30",440.0);
          int a1 = 302;
          in1.setFlightNumber(a1);
          int a2 = 44;
          in1.setCapacity(a2);
          String a3 = "Toronto";
          in1.setOrigin(a3);
          String a4 = "Vancouver";
          in1.setDestination(a4);
          String a5 = "2:30";
          in1.setDepartureTime(a5);
          double a6 = 440.0;
          in1.setOriginalPrice(a6);
          assertEquals(in1.getFlightNumber(), a1);
          assertEquals(in1.getCapacity(), a2);
          assertEquals(in1.getOrigin(), a3);
          assertEquals(in1.getDestination(), a4);
          assertEquals(in1.getDepartureTime(), a5);
          assertEquals(in1.getOriginalPrice(), a6, 0.001);
}
     @Test
     public void testtoString(){
        System.out.println("toString");
        Flight instance = new Flight(302,44,"Toronto","Vancouver","2:30 pm",440);
        String result = instance.toString();
        assertTrue(result.contains("Flight 302, Toronto to Vancouver, 2:30 pm, original price: $440"));
     }
     
     @Test
     public void testbookaSeat(){
         System.out.println("bookaSeat");
         int capacity =20;
         Flight in = new Flight(302,44,"Toronto","Vancouver","2:30",440);
         in.setNumberOfSeatsLeft(capacity);
         assertEquals(in.getNumberOfSeatsLeft(), capacity);
   
     }
     
     
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
