package com.example.abhiknav.dresswell;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class she_age_select extends AppCompatActivity {
    ViewPager viewPager4;
    ViewPager viewPager5;
    ViewPager viewPager6;
    ViewPager viewPager7;
    LinearLayout sliderDotspanel;
    LinearLayout sliderDotspanel1;
    LinearLayout sliderDotspanel2;
    LinearLayout sliderDotspanel3;
    private int dotscount,dotscount1,dotscount2,dotscount3;
    private ImageView[] dots;
    private ImageView[] dots1;
    private ImageView[] dots2;
    private ImageView[] dots3;
    Button kid;
    Button teen;
    Button adult;
    Button old;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_she_age_select);



        Toast toast = Toast.makeText(getApplicationContext(), "Please select the prefered age group!",
                Toast.LENGTH_LONG);

        TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
        toastMessage.setTextColor(Color.RED);
        toast.show();



        kid = (Button)findViewById(R.id.kid_female);
        teen = (Button)findViewById(R.id.teen_female) ;
        adult= (Button)findViewById(R.id.adult_female);
        old = (Button)findViewById(R.id.old_female);



        teen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(she_age_select.this,teen_female.class);
                startActivity(intent);
            }
        });



        kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(she_age_select.this,kid_female.class);
                startActivity(intent);
            }
        });


        adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(she_age_select.this,adult_female.class);
                startActivity(intent);
            }
        });


        old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(she_age_select.this,old_female.class);
                startActivity(intent);
            }
        });

        viewPager4 = (ViewPager) findViewById(R.id.viewPager4);
        viewPager5 = (ViewPager) findViewById(R.id.viewPager5);
        viewPager6 = (ViewPager) findViewById(R.id.viewPager6);
        viewPager7 = (ViewPager) findViewById(R.id.viewPager7);


        ViewPagerAdapterFour viewPagerAdapterFour = new ViewPagerAdapterFour(this);
        viewPager4.setAdapter(viewPagerAdapterFour);
        ViewPagerAdapterFive viewPagerAdapterFive = new ViewPagerAdapterFive(this);
        viewPager5.setAdapter(viewPagerAdapterFive);
        ViewPagerAdaptersix viewPagerAdaptersix = new ViewPagerAdaptersix(this);
        viewPager6.setAdapter(viewPagerAdaptersix);
        ViewPagerAdapterSeven viewPagerAdapterSeven = new ViewPagerAdapterSeven(this);
        viewPager7.setAdapter(viewPagerAdapterSeven);





        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);
        sliderDotspanel1 = (LinearLayout) findViewById(R.id.SliderDots1);
        sliderDotspanel2 = (LinearLayout) findViewById(R.id.SliderDots2);
        sliderDotspanel3 = (LinearLayout) findViewById(R.id.SliderDots3);


        dotscount = viewPagerAdapterFour.getCount();
        dotscount1 = viewPagerAdapterFive.getCount();
        dotscount2 = viewPagerAdaptersix.getCount();
        dotscount3 = viewPagerAdapterSeven.getCount();
        dots = new ImageView[dotscount];
        dots1 = new ImageView[dotscount1];
        dots2 = new ImageView[dotscount2];
        dots3 = new ImageView[dotscount3];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager4.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });






        for(int i = 0; i < dotscount1; i++){

            dots1[i] = new ImageView(this);
            dots1[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel1.addView(dots1[i], params);

        }

        dots1[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager5.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount1; i++){
                    dots1[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots1[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });







        for(int i = 0; i < dotscount2; i++){

            dots2[i] = new ImageView(this);
            dots2[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel2.addView(dots2[i], params);

        }

        dots2[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager6.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount2; i++){
                    dots2[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots2[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });







        for(int i = 0; i < dotscount3; i++){

            dots3[i] = new ImageView(this);
            dots3[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel3.addView(dots3[i], params);

        }

        dots3[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager7.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount3; i++){
                    dots3[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots3[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTaskFour(),3000,3000);
        timer.scheduleAtFixedRate(new MyTimerTaskFive(),4000,4000);
        timer.scheduleAtFixedRate(new MyTimerTasksix(),4000,4000);
        timer.scheduleAtFixedRate(new MyTimerTaskSeven(),3000,3000);
    }


    public class MyTimerTaskFour extends TimerTask{

        @Override
        public void run() {
            she_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager4.getCurrentItem()==0)
                        viewPager4.setCurrentItem(1);
                    else if(viewPager4.getCurrentItem()==1)
                        viewPager4.setCurrentItem(2);
                    else if (viewPager4.getCurrentItem()==2)
                        viewPager4.setCurrentItem(3);

                    else
                        viewPager4.setCurrentItem(0);


                }
            });
        }
    }


    public class MyTimerTaskFive extends TimerTask{

        @Override
        public void run() {
            she_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager5.getCurrentItem()==0)
                        viewPager5.setCurrentItem(1);
                    else if(viewPager5.getCurrentItem()==1)
                        viewPager5.setCurrentItem(2);
                    else if (viewPager5.getCurrentItem()==2)
                        viewPager5.setCurrentItem(3);
                    else
                        viewPager5.setCurrentItem(0);


                }
            });
        }
    }


    public class MyTimerTasksix extends TimerTask{

        @Override
        public void run() {
            she_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager6.getCurrentItem()==0)
                        viewPager6.setCurrentItem(1);
                    else if(viewPager6.getCurrentItem()==1)
                        viewPager6.setCurrentItem(2);
                    else if (viewPager6.getCurrentItem()==2)
                        viewPager6.setCurrentItem(3);
                    else
                        viewPager6.setCurrentItem(0);

                }
            });
        }
    }


    public class MyTimerTaskSeven extends TimerTask{

        @Override
        public void run() {
            she_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager7.getCurrentItem()==0)
                        viewPager7.setCurrentItem(1);
                    else if(viewPager7.getCurrentItem()==1)
                        viewPager7.setCurrentItem(2);
                    else if (viewPager7.getCurrentItem()==2)
                        viewPager7.setCurrentItem(3);
                    else
                        viewPager7.setCurrentItem(0);


                }
            });
        }
    }
}
