package com.anuragkondeya.example.vehiclediexample;

import javax.inject.Inject;

/**
 * Created by anuragkondeya on 31/7/17.
 */

public class Vehicle {

    private Motor motor;            // here lies the dependencies on motor class

    //Note Motor object is not created in this class. (no new is provided)

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }


}
