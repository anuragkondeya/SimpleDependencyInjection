package com.anuragkondeya.example.dishwasherdi;

import android.util.Log;

import com.anuragkondeya.example.dishwasherdi.ControlPanels.ControlPanel;
import com.anuragkondeya.example.dishwasherdi.Fans.Fan;
import com.anuragkondeya.example.dishwasherdi.WaterPumps.WaterPump;

import javax.inject.Inject;

/**
 * Created by anuragkondeya on 31/7/17.
 */

public class Dishwasher {

    ControlPanel controlPanel;
    WaterPump waterPump;
    Fan fan;

    @Inject
    public Dishwasher(ControlPanel controlPanel, Fan fan, WaterPump waterPump) {
        this.controlPanel = controlPanel;
        this.fan = fan;
        this.waterPump = waterPump;

    }

    public void startDishwasher() {
        controlPanel.startButton();
        waterPump.startWaterPump();
        fan.startFan();
        Log.e("Anurag", "Dishwasher is running");
    }

    public void stopDishwasher() {
        fan.stopFan();
        waterPump.stopWaterPump();
        controlPanel.stopButton();
        Log.e("Anurag", "Dishwasher stopped");
    }

}
