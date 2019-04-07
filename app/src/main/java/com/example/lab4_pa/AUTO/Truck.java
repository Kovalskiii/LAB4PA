package com.example.lab4_pa.AUTO;

import com.example.lab4_pa.R;

public class Truck extends VehicleType
{


    @Override
    public String getEngineType()
    {
        return "diesel";
    }

    @Override
    public int getFuelTank()
    {
        return 100;
    }

    @Override
    public int getFuelLevel()
    {
        return 7;
    }

    @Override
    public float getEngineCapacity() {
        return (float) 15.2;
    }

    @Override
    public int getWheelNumber()
    {
        return 10;
    }

    @Override
    public int getPhotoResId() {
        return R.mipmap.ic_truck;
    }
}


