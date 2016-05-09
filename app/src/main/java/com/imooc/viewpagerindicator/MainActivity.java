package com.imooc.viewpagerindicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import java.util.Arrays;
import java.util.List;
import com.imooc.view.viewpagerIndicator;


public class MainActivity extends Activity {


    private ViewPager mViewPager;
    private viewpagerIndicator mIndicator;
    private List<String> mTitles = Arrays.asList("短信", "收藏", "推荐");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}
