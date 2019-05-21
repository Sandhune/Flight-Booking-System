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
 public abstract class Passenger {
     String name;
    private int age;
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    abstract double applyDiscount(double p);

    public Passenger(String name, int age){
        if (name == null) {
            throw new IllegalArgumentException("Passenger name should not be null.");
        }
        this.name = name;
        
        this.age = age;
    }
}



