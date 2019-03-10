package com.oukksoft.demodatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.oukksoft.demodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements SampleEventHandlers{

    private User mUser = new User("Taro");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(mUser);
        binding.setHandlers(this);
    }

    @Override
    public void onChangeClick(View view) {
        Log.d("DEBUG", "Change User Name");
        mUser.setName("Jiro");
        Log.d("DEBUG", mUser.getName());
    }
}
