package com.example.muhammadrizqi.dprdjateng.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.etsy.android.grid.StaggeredGridView;
import com.example.muhammadrizqi.dprdjateng.R;

public class AbaoutActivity extends AppCompatActivity {
    private StaggeredGridView staggeredGridView;
    private String[] items = new String[]{
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/589/977/577/589977577d77b541706547.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/589/977/554/589977554b33e890397892.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/587/393/043/5873930439d32310839088.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/584/427/d7a/584427d7a4bd0897847695.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/585/77b/186/58577b186ffe1715917130.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/583/3e5/367/5833e5367ab0e453601619.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/585/752/aa0/585752aa00ca6811577420.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/585/77b/1a3/58577b1a3ff85788429953.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/586/5d3/52b/5865d352bbe7f827042710.jpg",
            "http://dprd.jatengprov.go.id/storage/app/uploads/public/586/4a3/291/5864a32914e20034434819.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaout);

        getSupportActionBar().setTitle("Geleri Foto");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        staggeredGridView = (StaggeredGridView)findViewById(R.id.gv_staggered);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(AbaoutActivity.this, items);
        staggeredGridView.setAdapter(itemGridAdapter);
        staggeredGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetailImageActivity.toDetailImageActivity(AbaoutActivity.this, items[position]);
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
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void toAbaoutActivity (Activity activity){
        activity.startActivity(new Intent(activity, AbaoutActivity.class));
    }
}
