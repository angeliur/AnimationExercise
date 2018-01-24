package com.angeliur.animation.vector;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.angeliur.animation.R;
import com.angeliur.animation.anim.DropTest;
import com.angeliur.animation.anim.PropertyTest;
import com.angeliur.animation.anim.TimerTest;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class VectorTestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_test);
    }

    public void startAnim(View view){
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable)drawable).start();
        }
    }

}
