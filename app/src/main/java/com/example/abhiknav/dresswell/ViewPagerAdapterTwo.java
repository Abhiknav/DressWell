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

public class ViewPagerAdapterTwo extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    private Integer [] man = {R.drawable.man1,R.drawable.man2,R.drawable.man3,R.drawable.man4};


    public ViewPagerAdapterTwo(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return man.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout2,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        imageView.setImageResource(man[position]);


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
