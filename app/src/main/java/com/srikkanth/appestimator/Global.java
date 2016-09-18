package com.srikkanth.appestimator;

import android.app.Application;

/**
 * Created by Srikkanth on 17/09/16.
 */
public class Global extends Application {

    static int price = 0;

    public static int getPrice()
    {
        return price;
    }

    public static void setPrice(int _price)
    {
        price = _price;
    }
}
