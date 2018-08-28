package com.example.abhiknav.dresswell;



import android.app.LauncherActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import static com.example.abhiknav.dresswell.R.id.rvMain2;

public class adult_male_casual extends Fragment {

    RecyclerView rvMain2;
    RequestQueue rq;
    String age, sex, ocassion, photo, text;
    String url = "https://api.myjson.com/bins/t1jhz";
    List<ListItem> listItems;

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kid_female_casual, container, false);

        rvMain2 = (RecyclerView) rootView.findViewById(R.id.rvMain2);
        listItems=new ArrayList<>();

        loadRecyclerViewData();
        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        rvMain2.setLayoutManager(gaggeredGridLayoutManager);
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(listItems,getContext());
        rvMain2.setAdapter(myRecyclerAdapter);





        return rootView;
    }

    private void loadRecyclerViewData() {
        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading Data...");
        progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray array = jsonObject.getJSONArray("dresswell");
                    for(int i=0;i<array.length();i++){
                        JSONObject o = array.getJSONObject(i);
                        ListItem item = new ListItem(
                                o.getString("photo"),
                                o.getString("text"),
                                o.getString("sex"),
                                o.getString("age"),
                                o.getString("ocassion")
                        );
                        listItems.add(item);


                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(getContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(stringRequest);
    }






    private class MyRecyclerAdapter extends RecyclerView.Adapter<GridHolder> {


         private List<ListItem> listitems;
        private Context context;

        public MyRecyclerAdapter(List<ListItem> listitems, Context context) {
            this.listitems = listitems;
            this.context = context;
        }



        @Override
        public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.grid_rv, parent, false);
            return new GridHolder(view);
        }

        @Override
        public void onBindViewHolder(GridHolder holder, int position) {
            ListItem listItem = listitems.get(position);

            holder.textView.setText(listItem.getText());



        }

        @Override
        public int getItemCount() {
            return listitems.size();
        }
    }

    private class GridHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public GridHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivMainImage);
            textView = itemView.findViewById(R.id.tvCaption);
        }
    }

}




