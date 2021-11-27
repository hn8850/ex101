package com.example.ex101;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb1,adb2,adb3,adb4,adb5;
    AlertDialog ad1,ad2,ad3,ad4,ad5;
    Random rn;
    View bg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rn = new Random();
        adb1 = new AlertDialog.Builder(this);
        adb2 = new AlertDialog.Builder(this);
        adb3 = new AlertDialog.Builder(this);
        adb4 = new AlertDialog.Builder(this);
        adb5 = new AlertDialog.Builder(this);
        bg = this.getWindow().getDecorView();

    }

    public void one(View view) {
        adb1.setMessage("According to all known laws\n" +
                "of aviation,there is no way a bee\n" +
                "should be able to fly.");
        ad1 = adb1.create();
        ad1.show();
    }

    public void two(View view) {
        adb2.setMessage("Its wings are too small to get\n" +
                "its fat little body off the ground.");
        adb2.setTitle("");
        adb2.setIcon(R.drawable.bee);
        ad2 = adb2.create();
        ad2.show();
    }

    public void three(View view) {
        adb3.setMessage("The bee, of course, flies anyway");
        adb3.setIcon(R.drawable.bee);
        adb3.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad3 = adb3.create();
        ad3.show();
    }

    public void four(View view) {
        adb4.setPositiveButton("Random color!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if ((rn.nextInt(3 - 1 + 1) + 1) == 1) bg.setBackgroundColor(Color.BLUE);
                else if ((rn.nextInt(3 - 1 + 1) + 1) == 2) bg.setBackgroundColor(Color.RED);
                else bg.setBackgroundColor(Color.GREEN);
            }
        });

        adb4.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad4 = adb4.create();
        ad4.show();
    }

    public void five(View view) {
        adb5.setPositiveButton("Random color!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if ((rn.nextInt(3 - 1 + 1) + 1) == 1) bg.setBackgroundColor(Color.BLUE);
                else if ((rn.nextInt(3 - 1 + 1) + 1) == 2) bg.setBackgroundColor(Color.RED);
                else bg.setBackgroundColor(Color.GREEN);
            }
        });

        adb5.setNeutralButton("White background!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                bg.setBackgroundColor(Color.WHITE);
            }
        });

        adb5.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad5 = adb5.create();
        ad5.show();
    }
}