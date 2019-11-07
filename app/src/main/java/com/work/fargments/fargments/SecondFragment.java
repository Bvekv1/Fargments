package com.work.fargments.fargments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.work.fargments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

      EditText etRadius;
      Button btnArea;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);
           etRadius = view.findViewById(R.id.etRadius);
           btnArea = view.findViewById(R.id.btnArea);
           btnArea.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
      float  Radius = Float.parseFloat(etRadius.getText().toString());
      float Area = (float) (3.14 * Radius * Radius);
        Toast.makeText(getActivity(),"Total is"+ Area, Toast.LENGTH_SHORT).show();
    }
}
