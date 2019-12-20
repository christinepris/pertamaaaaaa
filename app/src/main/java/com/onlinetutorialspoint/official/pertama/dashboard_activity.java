package com.onlinetutorialspoint.official.pertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dashboard_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_activity);


        TextView menu, profile, favorite, komentar, jadwal, home;
        Button login;
        Intent i;
        View v;



        menu = (TextView) findViewById(R.id.textview_menu);
        profile = (TextView) findViewById(R.id.textview_profile);
        favorite = (TextView) findViewById(R.id.textview_favorite);
        komentar = (TextView) findViewById(R.id.textview_komentar);
        jadwal = (TextView) findViewById(R.id.textview_jadwal);
        home = (TextView) findViewById(R.id.textview_home);

        login = (Button) findViewById(R.id.btn_login);
        

        login.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public void onClick(View v) {
                Intent i login = new(Intent,dashboard_activity,this.loginActivity.class);
                startActivity(i login );
            }
        });


    }
}
