package com.example.mission6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iV;
    int[] id=new int[3];
    int[] idx=new int[3];
    ImageButton iB;
    int mone;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iV=(ImageView) findViewById(R.id.iV);
        id[0]=R.drawable.download2;
        id[1]=R.drawable.two;
        id[2]=R.drawable.clickme;
        idx[0]=R.drawable.dog;
        idx[1]=R.drawable.banana;
        idx[2]=R.drawable.random;
        iB = (ImageButton) findViewById(R.id.iB);
        iB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mone = rnd.nextInt(3);
                iB.setImageResource(id[mone]);



                //Toast.makeText(MainActivity.this, "you click image", Toast.LENGTH_SHORT).show();

                iV.setImageResource(idx[mone]);





            }
        });

    }

}



