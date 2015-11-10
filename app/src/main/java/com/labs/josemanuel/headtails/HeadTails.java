package com.labs.josemanuel.headtails;

import android.content.Context;
import android.content.res.Resources;

import java.util.Random;

/**
 * Created by JoseManuel on 09/11/2015.
 */
public class HeadTails {

    public static String getRandomSide(Context context) {
        Resources res = context.getResources();
        String[] side = res.getStringArray(R.array.side_array);
        Random randomGenerator = new Random();
        int randomText = randomGenerator.nextInt(2);
        return side[randomText];
    }

}
