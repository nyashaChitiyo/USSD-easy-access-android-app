package com.example.nyasha.zimmobo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.nyasha.zimmobo.airtime.Airtime_Menu;
import com.example.nyasha.zimmobo.call_me_back.Call_Me_Back;
import com.example.nyasha.zimmobo.make_payment.Make_Payment;
import com.example.nyasha.zimmobo.send_money.Send_Money;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    String values[] = {"Airtime", "Call Me Back", "Send Money", "Make Payment", "Mobile Banking", "Cash Out", "Buy Wifi", "Data Bundles", "Not Available"};
    int images[] = {R.drawable.wallet, R.drawable.wallet, R.drawable.wallet, R.drawable.wallet, R.drawable.wallet, R.drawable.wallet, R.drawable.wallet, R.drawable.wallet, R.drawable.wallet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        gridview = (GridView) findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(this, values, images);
        gridview.setAdapter(gridAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //Toast.makeText(MainActivity.this, "" + values[position], Toast.LENGTH_SHORT).show();

                if(values[position]=="Airtime"){
                    Intent airtime_menu = new Intent(MainActivity.this,Airtime_Menu.class);
                    startActivity(airtime_menu);
                }
                else if(values[position]=="Call Me Back"){
                    Intent intent = new Intent(MainActivity.this, Call_Me_Back.class);
                    startActivity(intent);
                }
                else if(values[position]=="Send Money"){
                    Intent intent = new Intent(MainActivity.this, Send_Money.class);
                    startActivity(intent);
                }
                else if(values[position]=="Make Payment"){
                    Intent intent = new Intent(MainActivity.this, Make_Payment.class);
                    startActivity(intent);
                }
            }
        });
    }
}
