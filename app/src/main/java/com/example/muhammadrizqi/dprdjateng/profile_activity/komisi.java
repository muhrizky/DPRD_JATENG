package com.example.muhammadrizqi.dprdjateng.profile_activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.muhammadrizqi.dprdjateng.R;
import com.example.muhammadrizqi.dprdjateng.profile_activity.komisi_profile.komisia;
import com.example.muhammadrizqi.dprdjateng.profile_activity.komisi_profile.komisib;
import com.example.muhammadrizqi.dprdjateng.profile_activity.komisi_profile.komisic;
import com.example.muhammadrizqi.dprdjateng.profile_activity.komisi_profile.komisid;
import com.example.muhammadrizqi.dprdjateng.profile_activity.komisi_profile.komisie;

public class komisi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komisi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton ImageButton = (ImageButton) findViewById(R.id.komisia);
        final Context context = this;
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, komisia.class);
                startActivity(intent);
            }
        });
        ImageButton ImageButton2 = (ImageButton) findViewById(R.id.komisib);
        final Context context2 = this;
        ImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context2, komisib.class);
                startActivity(intent);
            }
        });
        ImageButton ImageButton3 = (ImageButton) findViewById(R.id.komisic);
        final Context context3 = this;
        ImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context3, komisic.class);
                startActivity(intent);
            }
        });
        ImageButton ImageButton4 = (ImageButton) findViewById(R.id.komisid);
        final Context context4 = this;
        ImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context4, komisid.class);
                startActivity(intent);
            }
        });
        ImageButton ImageButton5 = (ImageButton) findViewById(R.id.komisie);
        final Context context5 = this;
        ImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context5, komisie.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            // finish the activity
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
