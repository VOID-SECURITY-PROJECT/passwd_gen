package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    public Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.donate_button);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/aperture_science_logo", null, getPackageName())));
        btn.setOnClickListener(v -> {
            Intent i = new Intent(this, passwd_choose.class);
            startActivity(i);
        });
        btn2.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.donationalerts.com/r/cybercotleta77"));
            startActivity(browserIntent);
        });
    }
}