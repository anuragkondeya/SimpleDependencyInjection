package com.anuragkondeya.example.dishwasherdi.Fans;

import android.util.Log;

/**
 * Created by anuragkondeya on 31/7/17.
 */

public class ABCFan implements Fan{


    public ABCFan(){}

    public void startFan(){
       Log.e("Anurag","ABCFan started");
    }

    public void stopFan(){
        Log.e("Anurag","ABCFan stoped");
    }

}
