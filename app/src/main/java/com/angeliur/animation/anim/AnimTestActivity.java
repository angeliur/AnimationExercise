package com.angeliur.animation.anim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.angeliur.animation.R;
import com.angeliur.animation.launchmode.ActivityB;
import com.angeliur.animation.launchmode.ActivityC;
import com.angeliur.animation.launchmode.ActivityD;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class AnimTestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_test);
    }

    public void btnProperty(View view){
        startActivity(new Intent(this,PropertyTest.class));
    }

    public void btnTimer(View view){
        startActivity(new Intent(this,TimerTest.class));
    }

    public void btnDrop(View view){
        startActivity(new Intent(this,DropTest.class));
    }


}
