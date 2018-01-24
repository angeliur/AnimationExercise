package com.angeliur.animation.customanim;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.Transformation;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class CustomTv extends Animation {
    private int mCenterWidth;
    private int mCenterHeight;
    private Camera mCamera = new Camera();

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        mCenterWidth = width/2;
        mCenterHeight = height/2;
        //设置默认时长
        setDuration(2000);
        // 动画结束后保留状态
        setFillAfter(true);
        // 设置默认插值器
        setInterpolator(new AccelerateInterpolator());

    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);

        Matrix matrix = t.getMatrix();
        matrix.preScale(1,1-interpolatedTime,mCenterWidth,mCenterHeight);
    }


}
