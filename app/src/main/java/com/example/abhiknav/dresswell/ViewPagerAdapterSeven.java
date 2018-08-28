package com.example.abhiknav.dresswell;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Abhiknav on 3/8/2018.
 */

public class ViewPagerAdapterSeven extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] woman = {R.drawable.woman1,R.drawable.woman2,R.drawable.woman3,R.drawable.woman4};


    public ViewPagerAdapterSeven(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return woman.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout7,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView7);
        imageView.setImageResource(woman[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);
        return view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {


        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
