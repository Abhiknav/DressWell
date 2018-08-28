package com.example.abhiknav.dresswell;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class he_age_select extends AppCompatActivity {
    ViewPager viewPager;
    ViewPager viewPager1;
    ViewPager viewPager2;
    ViewPager viewPager3;
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
           setContentView(R.layout.activity_he_age_select);


        kid = (Button)findViewById(R.id.kid_male);
        teen = (Button)findViewById(R.id.teen_male) ;
        adult= (Button)findViewById(R.id.adult_male);
        old = (Button)findViewById(R.id.old_male);



        teen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(he_age_select.this,teen_male.class);
                startActivity(intent);
            }
        });



        kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(he_age_select.this,kid_male.class);
                startActivity(intent);
            }
        });


        adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(he_age_select.this,adult_male.class);
                startActivity(intent);
            }
        });


        old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(he_age_select.this,old_male.class);
                startActivity(intent);
            }
        });



        Toast toast = Toast.makeText(getApplicationContext(), "Please select the prefered age group!",
                Toast.LENGTH_LONG);

        TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
        toastMessage.setTextColor(Color.RED);
        toast.show();


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager1 = (ViewPager) findViewById(R.id.viewPager1);
        viewPager2 = (ViewPager) findViewById(R.id.viewPager2);
        viewPager3 = (ViewPager) findViewById(R.id.viewPager3);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        ViewPagerAdapterOne viewPagerAdapterOne = new ViewPagerAdapterOne(this);
        viewPager1.setAdapter(viewPagerAdapterOne);
        ViewPagerAdapterTwo viewPagerAdapterTwo = new ViewPagerAdapterTwo(this);
        viewPager2.setAdapter(viewPagerAdapterTwo);
        ViewPagerAdapterThree viewPagerAdapterThree = new ViewPagerAdapterThree(this);
        viewPager3.setAdapter(viewPagerAdapterThree);


        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);
        sliderDotspanel1 = (LinearLayout) findViewById(R.id.SliderDots1);
        sliderDotspanel2 = (LinearLayout) findViewById(R.id.SliderDots2);
        sliderDotspanel3 = (LinearLayout) findViewById(R.id.SliderDots3);


        dotscount = viewPagerAdapter.getCount();
        dotscount1 = viewPagerAdapterOne.getCount();
        dotscount2 = viewPagerAdapterTwo.getCount();
        dotscount3 = viewPagerAdapterThree.getCount();
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

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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

        viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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

        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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

        viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
        timer.scheduleAtFixedRate(new MyTimerTask(), 3000, 3000);
        timer.scheduleAtFixedRate(new MyTimerTaskOne(), 4000, 4000);
        timer.scheduleAtFixedRate(new MyTimerTaskTwo(), 4000, 4000);
        timer.scheduleAtFixedRate(new MyTimerTaskThree(), 3000, 3000);






    }



    public class MyTimerTask extends TimerTask{

        @Override
        public void run() {
            he_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem()==0)
                        viewPager.setCurrentItem(1);
                    else if(viewPager.getCurrentItem()==1)
                        viewPager.setCurrentItem(2);
                    else if (viewPager.getCurrentItem()==2)
                        viewPager.setCurrentItem(3);

                    else
                        viewPager.setCurrentItem(0);


                }
            });
        }
    }


    public class MyTimerTaskOne extends TimerTask{

        @Override
        public void run() {
            he_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager1.getCurrentItem()==0)
                        viewPager1.setCurrentItem(1);
                    else if(viewPager1.getCurrentItem()==1)
                        viewPager1.setCurrentItem(2);
                    else if (viewPager1.getCurrentItem()==2)
                        viewPager1.setCurrentItem(3);
                   else
                        viewPager1.setCurrentItem(0);


                }
            });
        }
    }


    public class MyTimerTaskTwo extends TimerTask{

        @Override
        public void run() {
            he_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager2.getCurrentItem()==0)
                        viewPager2.setCurrentItem(1);
                    else if(viewPager2.getCurrentItem()==1)
                        viewPager2.setCurrentItem(2);
                    else if (viewPager2.getCurrentItem()==2)
                        viewPager2.setCurrentItem(3);
                    else
                        viewPager2.setCurrentItem(0);

                }
            });
        }
    }


    public class MyTimerTaskThree extends TimerTask{

        @Override
        public void run() {
            he_age_select.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager3.getCurrentItem()==0)
                        viewPager3.setCurrentItem(1);
                    else if(viewPager3.getCurrentItem()==1)
                        viewPager3.setCurrentItem(2);
                    else if (viewPager3.getCurrentItem()==2)
                        viewPager3.setCurrentItem(3);
                    else
                        viewPager3.setCurrentItem(0);


                }
            });
        }
    }




}
