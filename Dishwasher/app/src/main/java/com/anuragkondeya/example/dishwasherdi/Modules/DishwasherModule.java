package com.anuragkondeya.example.dishwasherdi.Modules;

import com.anuragkondeya.example.dishwasherdi.ControlPanels.ABCControlPanel;
import com.anuragkondeya.example.dishwasherdi.ControlPanels.ControlPanel;
import com.anuragkondeya.example.dishwasherdi.Dishwasher;
import com.anuragkondeya.example.dishwasherdi.Fans.ABCFan;
import com.anuragkondeya.example.dishwasherdi.Fans.Fan;
import com.anuragkondeya.example.dishwasherdi.Fans.XVZFan;
import com.anuragkondeya.example.dishwasherdi.WaterPumps.ABCWaterPump;
import com.anuragkondeya.example.dishwasherdi.WaterPumps.WaterPump;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anuragkondeya on 31/7/17.
 */
@Module
public class DishwasherModule {

    @Provides
    public Dishwasher provideDishwasher(){
        //return new Dishwasher(new ABCControlPanel(),new ABCFan(),new ABCWaterPump());
        return new Dishwasher(new ABCControlPanel(),new XVZFan(),new ABCWaterPump());
    }

}
