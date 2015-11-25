package com.olegdudar.legodiceheroica;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Oleg_Dudar on 8/25/2014.
 */
public class Dice {
    private boolean isLoadingState;
    ImageButton imageButton;
    int sideGeneral;
    int side1;
    int side2;
    int side3;
    int side4;
    int side5;
    int side6;
    int sideLoading;

    public Dice(ImageButton imageButton, int side1, int side2, int side3, int side4, int side5, int side6, int sideGeneral, int sideLoading)
    {
        this.imageButton = imageButton;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
        this.sideGeneral = sideGeneral;
        this.sideLoading = sideLoading;
        isLoadingState = false;
    }

    private boolean getState()
    {
        return isLoadingState;
    }

    public void ChangeImageButtonSource() {
        if(!getState()) {
            isLoadingState = true;
            imageButton.setImageResource(this.sideLoading);
            // SLEEP 1 SECONDS HERE ...
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    imageButton.setImageResource(getRandomValue());
                    isLoadingState = false;
                }
            }, 1000);
        }
    }

    private int getRandomValue()
    {
        Random generator = new Random();
        switch(generator.nextInt(6)+1){
            case 1:
                return side1;
            case 2:
                return side2;
            case 3:
                return side3;
            case 4:
                return side4;
            case 5:
                return  side5;
            case 6:
                return side6;
            default:
                return sideGeneral;
        }
    }
}
