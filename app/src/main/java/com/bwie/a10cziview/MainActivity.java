package com.bwie.a10cziview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ImageBannerViewGroup.BannerImagClickListener {

    private BannerFrameLayout banner;

    private Integer[] imgs = {R.drawable.aaa, R.drawable.bbb, R.drawable.ccc,

            R.drawable.ddd, R.drawable.asa, R.drawable.eee,R.drawable.psb};

    private int screenWidth;

    private int screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.main);

        banner = (BannerFrameLayout) findViewById(R.id.mBannerFrameLayout);

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        screenWidth = dm.widthPixels;

        screenHeight = dm.heightPixels;

        banner.addBanners(imgs, screenWidth, screenHeight);

        banner.getmImageBannerViewGroup().setBannerImagClickListener(this);
    }

    @Override
    public void bannerClick(int pos) {
        Toast.makeText(this, ""+pos, Toast.LENGTH_SHORT).show();
    }
}
