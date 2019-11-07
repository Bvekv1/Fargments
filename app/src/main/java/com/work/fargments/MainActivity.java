package com.work.fargments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.work.fargments.fargments.FirstFragment;
import com.work.fargments.fargments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLoadFragment;

    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadFragment = findViewById(R.id.btnFragment);
        btnLoadFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.linearLayout,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnLoadFragment.setText("Load Second Fragment");
            status=false;

        } else{
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.linearLayout,secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnLoadFragment.setText("Load First Fragment");
            status=true;

        }

    }
}
