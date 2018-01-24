package com.angeliur.animation.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.angeliur.animation.R;
import com.angeliur.animation.launchmode.ActivityB;
import com.angeliur.animation.launchmode.ActivityC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class PropertyTest extends Activity implements View.OnClickListener{
    private int[] mRes = {R.id.imageView_a, R.id.imageView_b, R.id.imageView_c,
            R.id.imageView_d, R.id.imageView_e};
    private List<ImageView> mImageViews = new ArrayList<ImageView>();
    private boolean mFlag = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.property);
        for (int i = 0; i < mRes.length; i++) {
            ImageView imageView = (ImageView) findViewById(mRes[i]);
            imageView.setOnClickListener(this);
            mImageViews.add(imageView);
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView_a:
                if (mFlag){
                    startAnim();
                }else {
                    closeAnim();
                }
                break;
            default:
                Toast.makeText(PropertyTest.this, "" + v.getId(),
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void closeAnim() {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(mImageViews.get(0), "alpha", 0, 1);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mImageViews.get(1), "translationY", 200,0);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(mImageViews.get(2), "translationX", 200,0);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(mImageViews.get(3), "translationY", -200,0);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(mImageViews.get(4), "translationX", -200,0);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animator1,animator2,animator3,animator4,animator5);
        set.setDuration(1000);
        set.setInterpolator(new BounceInterpolator());
        set.start();
        mFlag = true;
    }

    private void startAnim() {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(mImageViews.get(0), "alpha", 1, 0);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mImageViews.get(1), "translationY", 200);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(mImageViews.get(2), "translationX", 200);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(mImageViews.get(3), "translationY", -200);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(mImageViews.get(4), "translationX", -200);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animator1,animator2,animator3,animator4,animator5);
        set.setDuration(1000);
        set.setInterpolator(new BounceInterpolator());
        set.start();
        mFlag = false;
    }
}
