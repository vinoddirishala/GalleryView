package com.vdtlabs.galleryview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vdtlabs.vdtgallery.CustomMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomMath.add(5,10);
    }
}
