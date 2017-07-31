package com.anuragkondeya.example.dishwasherdi.ControlPanels;

import android.util.Log;

import com.anuragkondeya.example.dishwasherdi.Fans.Fan;
import com.anuragkondeya.example.dishwasherdi.Fans.XVZFan;
import com.anuragkondeya.example.dishwasherdi.WaterPumps.WaterPump;

import javax.inject.Inject;

/**
 * Created by anuragkondeya on 31/7/17.
 */

public class ABCControlPanel implements ControlPanel{

    @Inject
    public ABCControlPanel() {
    }

    /**
     * Start dishwasher
     */
    public void startButton() {

        Log.e("Anurag", "startButtonPressed started");
    }

    /**
     * Stop dishwasher
     */
    public void stopButton() {
        Log.e("Anurag", "stopButtonPressed stopped");
    }


}
