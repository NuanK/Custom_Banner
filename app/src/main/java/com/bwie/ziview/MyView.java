package com.bwie.ziview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;



public class MyView extends View {

    private Paint mPaint=new Paint();

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        mPaint.setColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /**
         * cx : 圆心坐标 x轴点
         * cy : 圆心坐标 y 轴点
         * radius : 圆半径
         * Paint : 画笔(笔)
         */

        //canvas.drawCircle(getWidth()/2,getHeight()/2,200,mPaint);

        /**
         * left : 左上角的点200
         * top : 顶点200
         *
         * right : 200 ~ 600
         *
         * bottom : 300 高度
         *
         */
        //canvas.drawRect(200,200,400,300,mPaint);

        /**
         * startX : 开始的x点
         * starty : 开始Y点
         * stopX : 终点x点
         * stopy ： y终点
         */
        mPaint.setColor(Color.BLUE);
        canvas.drawLine(200,200,600,600,mPaint);

    }
}
