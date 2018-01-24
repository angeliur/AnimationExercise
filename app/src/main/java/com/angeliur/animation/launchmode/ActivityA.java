package com.angeliur.animation.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.angeliur.animation.R;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class ActivityA extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void openA(View view){
        startActivity(new Intent(this,ActivityA.class));
    }

    public void openB(View view){
        startActivity(new Intent(this,ActivityB.class));
    }

    public void openC(View view){
        startActivity(new Intent(this,ActivityC.class));
    }

    public void openD(View view){
        startActivity(new Intent(this,ActivityD.class));
    }
}
