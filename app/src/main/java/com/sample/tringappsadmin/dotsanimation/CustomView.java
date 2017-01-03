package com.sample.tringappsadmin.dotsanimation;

/**
 * Created by tringappsadmin on 2/1/17.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;



public class CustomView extends View {
    private Paint mPaint;
    private float initialRadius = 2f,secondRadius = 2f,thirdRadius = 2f;
    private int i,j= 0;

    public CustomView(Context context) {
        super(context);
        init();
        Log.e("tag","message");
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        mPaint = new Paint();
        mPaint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float position = canvas.getWidth() / 3;

        if (initialRadius < 10f) {
            canvas.drawCircle(position/2, canvas.getHeight() / 2, initialRadius += 1, mPaint);
            if(initialRadius > 9)
            {
                i=1;
            }
            if(i==1 && secondRadius < 10f) {
                canvas.drawCircle(position+(position/2), canvas.getHeight() / 2, secondRadius += 1, mPaint);
                if(secondRadius > 9)
                {
                    j=1;
                }
                if(j==1 && thirdRadius<10f)
                {
                    canvas.drawCircle(position+(position)+(position/2), canvas.getHeight() / 2, thirdRadius += 1, mPaint);
                }else
                {
                    thirdRadius = 2f;
                }

            }else
            {
                secondRadius = 2f;
            }

        }
        else{
            initialRadius = 2f;

        }
        invalidate();
        super.onDraw(canvas);
    }
}


