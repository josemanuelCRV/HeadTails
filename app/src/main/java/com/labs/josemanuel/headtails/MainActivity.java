package com.labs.josemanuel.headtails;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    final static String TAG =
            MainActivity.class.getSimpleName();

    int countHead, countTail = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Presiona el botón", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Nombre de la Activity *** ");

    }

    public void sideButtonAction(View view) {
        TextView sideLabel = (TextView) findViewById(R.id.txView_arg1);
        String side = HeadTails.getRandomSide(this);
        sideLabel.setText(side);
        Toast toast2;
        toast2 = Toast.makeText(getApplicationContext(),
                sideLabel.getText(), Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER, 0, 0);
        toast2.show();

        testContador(sideLabel);

    }


    public void testContador(TextView sideLabel) {

        if (sideLabel.getText().equals("Cara")) {
            countHead += 1;
            TextView contLabelHead = (TextView) findViewById(R.id.contHead);
            contLabelHead.setText(Integer.toString(countHead));
        } else {
            countTail += 1;

            TextView contLabelTail = (TextView) findViewById(R.id.contTail);
            contLabelTail.setText(Integer.toString(countTail));
        }


    }


}
