package com.angeliur.animation.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.angeliur.animation.R;
import com.angeliur.animation.launchmode.ActivityB;
import com.angeliur.animation.launchmode.ActivityC;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class DropTest extends Activity {

    private LinearLayout hiddenView;
    private int hiddenViewHeight;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drop);
        hiddenView = (LinearLayout) findViewById(R.id.hidden_view);
        //获取屏幕像素密度
        float density = getResources().getDisplayMetrics().density;
        //获取隐藏布局的高度
        hiddenViewHeight = (int) (40 * density + 0.5);
    }

    public void llClick(View view){
        if (hiddenView.getVisibility() == View.VISIBLE){
            animateClose(hiddenView);
        }else {
            animateOpen(hiddenView);
        }
    }

    private void animateClose(final View view) {
        ValueAnimator animator = createDropAnimator(view,hiddenViewHeight,0);
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                //动画结束后将view隐藏，否则下次点击还会执行关闭动画的操作
                view.setVisibility(View.GONE);
            }
        });
        animator.start();
    }

    private void animateOpen(View view) {
        //开始动画前要将隐藏的view显示出来，否则看不到动画效果
        hiddenView.setVisibility(View.VISIBLE);
        ValueAnimator animator = createDropAnimator(view,0,hiddenViewHeight);
        animator.start();
    }

    private ValueAnimator createDropAnimator(final View view, int start, int end) {
        ValueAnimator valueAnimator = ValueAnimator.ofInt(start, end);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) animation.getAnimatedValue();
                view.setLayoutParams(layoutParams);
            }
        });
        valueAnimator.setDuration(3000);
        return valueAnimator;
    }

}
