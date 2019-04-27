package com.atoysporkchop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> orderList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button porkchop = (Button) findViewById(R.id.porkchop);
        porkchop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                orderList.add("porkchop");
            }
        });

        Button tapa = (Button) findViewById(R.id.tapa);
        tapa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                orderList.add("tapa");
            }
        });

    }


}
