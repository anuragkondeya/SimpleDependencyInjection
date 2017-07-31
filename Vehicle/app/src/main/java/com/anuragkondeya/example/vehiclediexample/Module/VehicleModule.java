package com.anuragkondeya.example.vehiclediexample.Module;

import com.anuragkondeya.example.vehiclediexample.Motor;
import com.anuragkondeya.example.vehiclediexample.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anuragkondeya on 31/7/17.
 */

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
       return new Motor();    // Vehicle modules in motor class and not the vehicle class itself
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());  // Note motor is singleton above, Check if i can use provideMotor here instead
    }



}
