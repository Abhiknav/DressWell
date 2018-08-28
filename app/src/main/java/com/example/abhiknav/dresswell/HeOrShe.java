package com.example.abhiknav.dresswell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeOrShe extends AppCompatActivity {
    Button she;
    Button he;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he_or_she);



        she = (Button)findViewById(R.id.she);
        she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeOrShe.this,she_age_select.class);
                startActivity(intent);
            }
        });



        he = (Button)findViewById(R.id.he);
        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeOrShe.this,he_age_select.class);
                startActivity(intent);
            }
        });
    }
}
