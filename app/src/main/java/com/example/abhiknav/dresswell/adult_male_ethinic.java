package com.example.abhiknav.dresswell;

/**
 * Created by Abhiknav on 3/24/2018.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class adult_male_ethinic extends Fragment {


    RecyclerView rvMain1;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_adult_male_ethinic, container, false);
        Bitmap[] bitmaps = getBitmaps();
        rvMain1 = (RecyclerView)rootView.findViewById(R.id.rvMain8);


        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        rvMain1.setLayoutManager(gaggeredGridLayoutManager);
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(bitmaps);
        rvMain1.setAdapter(myRecyclerAdapter);

        return rootView;
    }


    private Bitmap[] getBitmaps() {
        Bitmap [] tempBitmaps  = new Bitmap[10];
        tempBitmaps[0] = BitmapFactory.decodeResource(getResources(),R.drawable.d);
        tempBitmaps[1] = BitmapFactory.decodeResource(getResources(),R.drawable.c);
        tempBitmaps[2] = BitmapFactory.decodeResource(getResources(),R.drawable.b);
        tempBitmaps[3] = BitmapFactory.decodeResource(getResources(),R.drawable.a);
        tempBitmaps[4] = BitmapFactory.decodeResource(getResources(),R.drawable.e);
        tempBitmaps[5] = BitmapFactory.decodeResource(getResources(),R.drawable.f);
        tempBitmaps[6] = BitmapFactory.decodeResource(getResources(),R.drawable.g);
        tempBitmaps[7] = BitmapFactory.decodeResource(getResources(),R.drawable.h);
        tempBitmaps[8] = BitmapFactory.decodeResource(getResources(),R.drawable.i);
        tempBitmaps[9] = BitmapFactory.decodeResource(getResources(),R.drawable.j);
        return tempBitmaps;
    }

    private class MyRecyclerAdapter extends RecyclerView.Adapter<GridHolder>{

        Bitmap [] bitmaps;

        public MyRecyclerAdapter(Bitmap[] bitmaps) {
            this.bitmaps = bitmaps;
        }

        @Override
        public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.grid_rv,parent,false);
            return new GridHolder(view);
        }

        @Override
        public void onBindViewHolder(GridHolder holder, int position) {
            holder.imageView.setImageBitmap(bitmaps[position]);
            holder.textView.setText("Capion:"+position);
        }

        @Override
        public int getItemCount() {
            return bitmaps.length;
        }
    }

    private class GridHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public GridHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivMainImage);
            textView = itemView.findViewById(R.id.tvCaption);
        }
    }



}


