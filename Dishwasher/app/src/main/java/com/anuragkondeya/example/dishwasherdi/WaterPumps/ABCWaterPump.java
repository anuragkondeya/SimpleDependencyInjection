package com.anuragkondeya.example.dishwasherdi.WaterPumps;

import android.util.Log;

/**
 * Created by anuragkondeya on 31/7/17.
 */


public class ABCWaterPump implements WaterPump{

    public void startWaterPump(){
        Log.e("Anurag","waterpump started");
    }

    public void stopWaterPump(){
        Log.e("Anurag","waterpump stop");
    }

}
