package com.olegdudar.legodiceheroica;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.olegdudar.legodiceheroica.R;

public class DiceActivity extends Activity {

    ImageButton imageButton;
    Dice diceHeroica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        imageButton = (ImageButton) findViewById(R.id.imageButton);



        imageButton.setImageResource(R.drawable.dice__0000_main);

        diceHeroica = new Dice(imageButton, R.drawable.dice__0001s_0005_side_1, R.drawable.dice__0001s_0004_side_2, R.drawable.dice__0001s_0003_side_3,
                R.drawable.dice__0001s_0002_side_4, R.drawable.dice__0001s_0001_side_5, R.drawable.dice__0001s_0000_side_6,
                R.drawable.dice__0000_main, R.drawable.dice__0001_loading);
    }

    public void changeViewByClass(View view)
    {
        diceHeroica.ChangeImageButtonSource();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dice, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*@Override
    public void onBackPressed()
    {
        Intent intent = new Intent(DiceActivity.this, MainActivity.class);
        startActivity(intent);
    }*/
}
