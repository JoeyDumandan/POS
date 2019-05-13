package com.atoysporkchop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.atoysporkchop.order.api.BottledWaterAPI;
import com.atoysporkchop.order.api.ChickenLongganisaAPI;
import com.atoysporkchop.order.api.DaingNaBangusAPI;
import com.atoysporkchop.order.api.EggAPI;
import com.atoysporkchop.order.api.FriedChickenAPI;
import com.atoysporkchop.order.api.FriedRiceAPI;
import com.atoysporkchop.order.api.GarlicLongganisaAPI;
import com.atoysporkchop.order.api.GrilledSpareribsAPI;
import com.atoysporkchop.order.api.JuiceInCanAPI;
import com.atoysporkchop.order.api.PorkSisigAPI;
import com.atoysporkchop.order.api.PorkchopAPI;
import com.atoysporkchop.order.api.SodaInCanAPI;
import com.atoysporkchop.order.api.TapaAPI;
import com.atoysporkchop.order.api.TocinoAPI;
import com.atoysporkchop.order.api.TotalAPI;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> orderList;
    private ArrayAdapter<String> adapter;
    private TotalAPI totalAPI = new TotalAPI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeSales();

        orderList = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this, R.layout.product_view, R.id.product_name, orderList);

        ListView order_list = (ListView) findViewById(R.id.order_list);
        order_list.setAdapter(adapter);

        Button porkchop = (Button) findViewById(R.id.porkchop);
        porkchop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                orderList.add(getString(R.string.porkchop));
                adapter.notifyDataSetChanged();
            }
        });



    }

    private void initializeSales() {
        totalAPI.setPorkchopAPI(new PorkchopAPI());
        totalAPI.setTapaAPI(new TapaAPI());
        totalAPI.setTocinoAPI(new TocinoAPI());
        totalAPI.setFriedChickenAPI(new FriedChickenAPI());
        totalAPI.setDaingNaBangusAPI(new DaingNaBangusAPI());
        totalAPI.setPorkSisigAPI(new PorkSisigAPI());
        totalAPI.setChickenLongganisaAPI(new ChickenLongganisaAPI());
        totalAPI.setGrilledSpareribsAPI(new GrilledSpareribsAPI());
        totalAPI.setGarlicLongganisaAPI(new GarlicLongganisaAPI());
        totalAPI.setSodaInCanAPI(new SodaInCanAPI());
        totalAPI.setBottledWaterAPI(new BottledWaterAPI());
        totalAPI.setJuiceInCanAPI(new JuiceInCanAPI());
        totalAPI.setEggAPI(new EggAPI());
        totalAPI.setFriedRiceAPI(new FriedRiceAPI());
    }

}
