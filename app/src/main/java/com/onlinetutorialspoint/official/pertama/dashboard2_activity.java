package com.onlinetutorialspoint.official.pertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dashboard2_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2_activity);

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
            public void onClick(View v){

               switch (v.getId())
               {
                   case R.id.textview_menu : i = new Intent(this, menuactivity.class);
                   startActivity(i);
                break;


                   case R.id.textview_profile : i = new Intent(this, profileactivity.class);
                   startActivity(i);
                       break;

                   case R.id.textview_favorite : i = new Intent(this, favoriteactivity.class);
                   startActivity(i);
                       break;

                   case R.id.textview_komentar : i = new Intent(this, komentaractivity.class);
                   startActivity(i);
                       break;

                   case R.id.textview_jadwal : i = new Intent(this, jadwalactivity.class);
                   startActivity(i);
                       break;

                   case R.id.textview_home : i = new Intent(this, homeactivity.class);
                   startActivity(i);
                       break;

                       default:
                           break;
               }
           }
        });

    }
}
