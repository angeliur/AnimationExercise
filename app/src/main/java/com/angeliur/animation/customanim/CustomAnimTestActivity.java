package com.angeliur.animation.customanim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.angeliur.animation.R;
import com.angeliur.animation.anim.DropTest;
import com.angeliur.animation.anim.PropertyTest;
import com.angeliur.animation.anim.TimerTest;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class CustomAnimTestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customanim_test);
    }

    public void btnAnim(View view){
        CustomAnim customAnim = new CustomAnim();
        customAnim.setRotate(180);
        view.startAnimation(customAnim);
    }

    public void imgClose(View view){
        CustomTv customTv = new CustomTv();
        view.startAnimation(customTv);
    }



}
