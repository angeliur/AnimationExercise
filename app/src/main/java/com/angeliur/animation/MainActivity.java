package com.angeliur.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.angeliur.animation.anim.AnimTestActivity;
import com.angeliur.animation.customanim.CustomAnimTestActivity;
import com.angeliur.animation.launchmode.ActivityA;
import com.angeliur.animation.vector.VectorTestActivity;
import com.angeliur.animation.viewanim.ViewAnimTestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityA.class));
            }
        });
    }

    public void openAnimTest(View view){
        startActivity(new Intent(this, AnimTestActivity.class));
    }

    public void openViewAnimTest(View view){
        startActivity(new Intent(this, ViewAnimTestActivity.class));
    }

    public void openVectorTest(View view){
        startActivity(new Intent(this, VectorTestActivity.class));
    }

    public void openCustomAnimTest(View view){
        startActivity(new Intent(this, CustomAnimTestActivity.class));
    }
}
