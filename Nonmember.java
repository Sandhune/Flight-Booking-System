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
public class Nonmember extends Passenger{
    
   public Nonmember(String name,int age ){
       super(name,age);  
   }
    @Override
    public double applyDiscount(double p){
    
        if(getAge()>=65){
            return(0.9*p);    
}
        else
            return (p);
    }

}
