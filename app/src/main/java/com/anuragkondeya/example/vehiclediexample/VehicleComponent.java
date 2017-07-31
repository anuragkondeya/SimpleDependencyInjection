package com.anuragkondeya.example.vehiclediexample;

import com.anuragkondeya.example.vehiclediexample.Module.VehicleModule;
import com.anuragkondeya.example.vehiclediexample.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anuragkondeya on 31/7/17.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();


}
