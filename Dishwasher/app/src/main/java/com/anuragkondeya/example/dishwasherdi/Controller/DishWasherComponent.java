package com.anuragkondeya.example.dishwasherdi.Controller;

import com.anuragkondeya.example.dishwasherdi.Dishwasher;
import com.anuragkondeya.example.dishwasherdi.Modules.DishwasherModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anuragkondeya on 31/7/17.
 */
@Singleton
@Component(modules = {DishwasherModule.class})
public interface DishWasherComponent {
    Dishwasher provideDishwasher();

}
