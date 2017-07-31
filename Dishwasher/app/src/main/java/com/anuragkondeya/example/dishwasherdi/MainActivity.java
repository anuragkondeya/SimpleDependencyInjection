package com.anuragkondeya.example.dishwasherdi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anuragkondeya.example.dishwasherdi.Controller.DaggerDishWasherComponent;
import com.anuragkondeya.example.dishwasherdi.Controller.DishWasherComponent;
import com.anuragkondeya.example.dishwasherdi.Modules.DishwasherModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DishWasherComponent dishWasherComponent = DaggerDishWasherComponent.builder().dishwasherModule(new DishwasherModule()).build();
        dishWasherComponent.provideDishwasher().startDishwasher();
        dishWasherComponent.provideDishwasher().stopDishwasher();

    }
}
