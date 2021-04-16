
package com.example.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button indore;
  Button bhopal;
  Button mumbai;
  Button delhi;
  Button mtp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        indore = findViewById(R.id.buttona);
        bhopal = findViewById(R.id.buttonb);
        mumbai = findViewById(R.id.buttonc);
        delhi = findViewById(R.id.buttond);
        mtp = findViewById(R.id.buttone);
        indore.setOnClickListener(this);
        bhopal.setOnClickListener(this);
        mumbai.setOnClickListener(this);
        delhi.setOnClickListener(this);
        mtp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttona:
            {
                Uri indore = Uri.parse("geo:0, 0?q=Gandhi+Chowk");
                Intent iIntent = new Intent(Intent.ACTION_VIEW, indore);
                iIntent.setPackage("com.google.android.apps.maps");
                startActivity(iIntent);
                break;
            }
            case R.id.buttonb:
            {
                Uri bhopal = Uri.parse("geo:23.2599, 77.4126?q=resort");
                Intent bIntent = new Intent(Intent.ACTION_VIEW, bhopal);
                bIntent.setPackage("com.google.android.apps.maps");
                startActivity(bIntent);
                break;
            }
            case R.id.buttonc:
            {
                Uri mumbai = Uri.parse("geo:19.0760, 72.8777?q=resort");
                Intent mIntent = new Intent(Intent.ACTION_VIEW, mumbai);
                mIntent.setPackage("com.google.android.apps.maps");
                startActivity(mIntent);
                break;
            }
            case R.id.buttond:
            {
                Uri delhi = Uri.parse("geo:28.7041, 77.1025?q=resort");
                Intent dIntent = new Intent(Intent.ACTION_VIEW, delhi);
                dIntent.setPackage("com.google.android.apps.maps");
                startActivity(dIntent);
                break;
            }
            case R.id.buttone:
            {
                Uri mtp = Uri.parse("google.navigation:q=mumbai,pune,&mode=l");
                Intent mtpIntent = new Intent(Intent.ACTION_VIEW, mtp);
                mtpIntent.setPackage("com.google.android.apps.maps");
                startActivity(mtpIntent);
                break;
            }
        }
    }
}