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

public class ViewPagerAdaptersix extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] lady = {R.drawable.lady1,R.drawable.lady2,R.drawable.lady3,R.drawable.lady4};


    public ViewPagerAdaptersix(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lady.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout6,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView6);
        imageView.setImageResource(lady[position]);


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
